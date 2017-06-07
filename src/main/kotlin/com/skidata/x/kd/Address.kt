package com.skidata.x.kd

import javax.persistence.Entity

/**
 * @author firoz
 * *
 * @since 01/06/17
 */

@Entity
data class Address (val line_1: String? = null, val line_2: String? = null) : AbstractEntity(){


    constructor(line_1: String?) : this(line_1 = line_1, line_2 = null)
}
