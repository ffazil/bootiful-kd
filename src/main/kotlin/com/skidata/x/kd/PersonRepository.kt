package com.skidata.x.kd

import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author firoz
 * @since 29/05/17
 *
 * Wow, made even more simpler by Kotlin.
 */
interface PersonRepository : JpaRepository<Person, Long> {

}