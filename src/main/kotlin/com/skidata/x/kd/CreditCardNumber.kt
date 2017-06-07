package com.skidata.x.kd

import javax.persistence.Column
import javax.persistence.Embeddable

/**
 * @author firoz
 * *
 * @since 07/06/17
 */
@Embeddable
class CreditCardNumber {

    @Column(unique = true) val number: String?

    protected constructor() {
        this.number = null
    }

    /**
     * Creates a new [CreditCardNumber].

     * @param number must not be null and be a 16 digit numerical only String.
     */
    constructor(number: String) {

        if (!isValid(number)) {
            throw IllegalArgumentException(String.format("Invalid credit card NUMBER %s!", number))
        }

        this.number = number
    }

    companion object {

        private val regex = "[0-9]{16}"

        /**
         * Returns whether the given [String] is a valid [CreditCardNumber].

         * @param number
         * *
         * @return
         */
        fun isValid(number: String?): Boolean {
            return number?.matches(regex.toRegex()) ?: false
        }
    }
}