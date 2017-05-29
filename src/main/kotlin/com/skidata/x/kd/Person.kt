package com.skidata.x.kd

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author firoz
 * @since 29/05/17
 *
 * Implementation of simple Jpa Entity. This is immutable, I guess. Much better than Lombok + Java.
 * Class and constructor declaration merged.
 */
@Entity
data class Person(val firstname: String? = null,
                  val lastname: String? = null,
                  @Id
                  @GeneratedValue(strategy = GenerationType.AUTO)
                  val id: Long = -1) {

    /**
     * The $ notation is amazing.
     */
    override fun toString(): String {
        return "Person[$id:$firstname $lastname]"
    }

}