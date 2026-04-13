// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DateTimeTest {

    @Test
    fun create() {
        val dateTime = DateTime.builder().dateOnly(true).timeZoneShift(0).value(0).build()

        assertThat(dateTime.dateOnly()).isEqualTo(true)
        assertThat(dateTime.timeZoneShift()).isEqualTo(0)
        assertThat(dateTime.value()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dateTime = DateTime.builder().dateOnly(true).timeZoneShift(0).value(0).build()

        val roundtrippedDateTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dateTime),
                jacksonTypeRef<DateTime>(),
            )

        assertThat(roundtrippedDateTime).isEqualTo(dateTime)
    }
}
