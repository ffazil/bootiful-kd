package com.skidata.x.kd

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.ReadOnlyProperty
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany

/**
 * @author firoz
 * @since 29/05/17
 *
 * Implementation of simple Jpa Entity. This is immutable, I guess. Much better than Lombok + Java.
 * Class and constructor declaration merged.
 */
@Entity
class Person  : AbstractEntity{

    val firstname: String?
    val lastname: String?

    constructor(firstname: String, lastname: String): super() {

        this.firstname = firstname
        this.lastname = lastname
    }

    private constructor(){
        this.firstname = null;
        this.lastname = null;
    }

    @ReadOnlyProperty
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @OneToMany(cascade = arrayOf(CascadeType.ALL))
    var addresses : Set<Address> = HashSet(0)
        private set

    fun address(address: Address) : Person {
        this.addresses = this.addresses + address
        return this
    }


}
