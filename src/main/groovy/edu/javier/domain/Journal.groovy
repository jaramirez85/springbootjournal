package edu.javier.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Transient
import java.text.ParseException
import java.text.SimpleDateFormat

/**
 * Created by JavierAlonso on 6/10/2016.
 */
@Entity
public class Journal {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id
    String title
    Date created
    String summary
    @Transient
    protected static format = new SimpleDateFormat("MM/dd/yyyy");


    String toString(){
        StringBuilder value = StringBuilder.newInstance();
        value.with {
            append "JournalEntry("
            append "Id: "
            append id
            append ",Title: "
            append title
            append ",Summary: "
            append summary
            append ",Created: "
            append getCreatedAsShort()
            append ")"
        }
        value.toString();
    }

    def getCreatedAsShort() {
        format.format(created);
    }
}
