package com.skidata.x.kd

import lombok.extern.slf4j.Slf4j
import org.springframework.data.rest.webmvc.RepositoryRestController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

/**
 * @author firoz
 * *
 * @since 07/06/17
 */
@Slf4j
@RepositoryRestController
class PersonController(private val personRepository: PersonRepository) {


    @RequestMapping(path = arrayOf("/persons/{id}/addresses"), method = arrayOf(RequestMethod.PUT))
    internal fun address(@PathVariable("id") person: Person, @RequestBody address: Address): ResponseEntity<*> {
        var person = person
        person = personRepository.save(person.address(address))
        return ResponseEntity.ok(person)
    }

    @RequestMapping(path = arrayOf("/persons/{id}"), method = arrayOf(RequestMethod.PATCH))
    internal fun patch(@PathVariable("id") person: Person, @RequestBody updatedPerson: Person): ResponseEntity<*> {
        return ResponseEntity<Object>(HttpStatus.METHOD_NOT_ALLOWED)
    }

}
