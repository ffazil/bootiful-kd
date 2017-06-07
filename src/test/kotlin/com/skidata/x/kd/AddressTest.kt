package com.skidata.x.kd

import org.junit.Assert
import org.junit.Test

import kotlin.collections.HashSet

/**
 * @author firoz
 * *
 * @since 07/06/17
 */
class AddressTest {

    @Test
    fun testsAddressCollections() {
        var addresses : Set<Address> = HashSet()
        val a = Address("Brookfield", "Whitefield")
        val b = Address("Groedig", "Salzburg")

        addresses = addresses.plus(a)
        addresses = addresses.plus(b)

        Assert.assertEquals(2, addresses.size.toLong())
    }
}
