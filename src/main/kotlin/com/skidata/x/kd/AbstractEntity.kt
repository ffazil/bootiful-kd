package com.skidata.x.kd

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.hateoas.Identifiable

import javax.persistence.*

/**
 * @author firoz
 * *
 * @since 07/06/17
 */
@MappedSuperclass
abstract class AbstractEntity protected constructor() : Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private val id: Long?

    @Version
    val version: Long? = null

    init {
        this.id = null
    }

    override fun getId(): Long? {
        return this.id
    }
}
