package edu.javier.repository

import edu.javier.domain.Journal
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by JavierAlonso on 6/10/2016.
 */
interface JournalRepository extends JpaRepository<Journal, Long> {
}
