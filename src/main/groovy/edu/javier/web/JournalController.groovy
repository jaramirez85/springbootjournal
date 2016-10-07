package edu.javier.web

import edu.javier.domain.Journal
import edu.javier.repository.JournalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by JavierAlonso on 6/10/2016.
 */
@Controller
class JournalController {

    @Autowired
    JournalRepository repo

    @RequestMapping("/")
    String index(Model model){
        model.addAttribute "journal", repo.findAll()
        "index"
    }

    @RequestMapping(value="/journal", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    @ResponseBody
    List<Journal> getJournal(){
        repo.findAll();
    }

}

