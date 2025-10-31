// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DatePointTest {

    @Test
    fun create() {
        val datePoint =
            DatePoint.builder()
                .day(0)
                .month(0)
                .timeType(DatePoint.TimeType.DATE)
                .timezoneSource(DatePoint.TimezoneSource.CUSTOM)
                .year(0)
                .zoneId("zoneId")
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        assertThat(datePoint.day()).isEqualTo(0)
        assertThat(datePoint.month()).isEqualTo(0)
        assertThat(datePoint.timeType()).isEqualTo(DatePoint.TimeType.DATE)
        assertThat(datePoint.timezoneSource()).isEqualTo(DatePoint.TimezoneSource.CUSTOM)
        assertThat(datePoint.year()).isEqualTo(0)
        assertThat(datePoint.zoneId()).isEqualTo("zoneId")
        assertThat(datePoint.hour()).contains(0)
        assertThat(datePoint.millisecond()).contains(0)
        assertThat(datePoint.minute()).contains(0)
        assertThat(datePoint.second()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val datePoint =
            DatePoint.builder()
                .day(0)
                .month(0)
                .timeType(DatePoint.TimeType.DATE)
                .timezoneSource(DatePoint.TimezoneSource.CUSTOM)
                .year(0)
                .zoneId("zoneId")
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .build()

        val roundtrippedDatePoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(datePoint),
                jacksonTypeRef<DatePoint>(),
            )

        assertThat(roundtrippedDatePoint).isEqualTo(datePoint)
    }
}
