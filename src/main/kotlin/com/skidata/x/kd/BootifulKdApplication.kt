package com.skidata.x.kd

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.util.stream.Stream

/**
 * No idea about the difference between Kotlin class, object and file. Will figure out later.
 */
@SpringBootApplication
open class BootifulKdApplication{
    //Am not really sure about this. There should be a less verbose way.
    private val log = LoggerFactory.getLogger(BootifulKdApplication::class.java)

    @Bean
    fun init(personRepository: PersonRepository) = CommandLineRunner {
        Stream.of("Mishab,Mustafa", "Nithin,Betegeri", "Kamran,Khan", "Mukibul,Islam", "Abilasha,Devaraj", "Kuriakose,Vimalananthan", "Perumal,D")
                .map { p -> p.split(",") }
                //Not really sure that this is recommended way.
                .forEach { p ->
                    val person = personRepository.save(Person(p[0], p[1]))
                    log.info(person.toString())
                }
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(BootifulKdApplication::class.java, *args)
}


