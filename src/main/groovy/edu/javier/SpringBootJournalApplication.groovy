package edu.javier

import edu.javier.domain.Journal
import edu.javier.repository.JournalRepository
import org.springframework.beans.factory.InitializingBean
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

import java.text.SimpleDateFormat

@SpringBootApplication
class SpringBootJournalApplication {

	static void main(String[] args) {
		SpringApplication.run SpringBootJournalApplication, args
	}

	@Bean
	InitializingBean saveData(JournalRepository repo){
		def format = new SimpleDateFormat("MM/dd/yyyy")
		def cl = {
			repo.save(new Journal(title: 'Get to know Spring Boot', summary: 'Today I will learn Spring Boot', created: format.parse('01/01/2016')))
			repo.save(new Journal(title: 'Simple Spring Boot Project', summary: 'I will do my first SpringBoot Project', created: format.parse('01/02/2016')))
			repo.save(new Journal(title: 'Spring Boot Reading', summary: 'Read more about SpringBoot', created: format.parse("02/01/2016")))
		}
	}
}
