// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttendanceCountersTest {

    @Test
    fun create() {
        val attendanceCounters =
            AttendanceCounters.builder().attended(0).cancelled(0).noShows(0).registered(0).build()

        assertThat(attendanceCounters.attended()).isEqualTo(0)
        assertThat(attendanceCounters.cancelled()).isEqualTo(0)
        assertThat(attendanceCounters.noShows()).isEqualTo(0)
        assertThat(attendanceCounters.registered()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attendanceCounters =
            AttendanceCounters.builder().attended(0).cancelled(0).noShows(0).registered(0).build()

        val roundtrippedAttendanceCounters =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attendanceCounters),
                jacksonTypeRef<AttendanceCounters>(),
            )

        assertThat(roundtrippedAttendanceCounters).isEqualTo(attendanceCounters)
    }
}
