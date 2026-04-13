// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicDatePointTest {

    @Test
    fun create() {
        val publicDatePoint =
            PublicDatePoint.builder()
                .day(0)
                .month(0)
                .timeType(PublicDatePoint.TimeType.DATE)
                .year(0)
                .zoneId("zoneId")
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .timezoneSource("timezoneSource")
                .build()

        assertThat(publicDatePoint.day()).isEqualTo(0)
        assertThat(publicDatePoint.month()).isEqualTo(0)
        assertThat(publicDatePoint.timeType()).isEqualTo(PublicDatePoint.TimeType.DATE)
        assertThat(publicDatePoint.year()).isEqualTo(0)
        assertThat(publicDatePoint.zoneId()).isEqualTo("zoneId")
        assertThat(publicDatePoint.hour()).contains(0)
        assertThat(publicDatePoint.millisecond()).contains(0)
        assertThat(publicDatePoint.minute()).contains(0)
        assertThat(publicDatePoint.second()).contains(0)
        assertThat(publicDatePoint.timezoneSource()).contains("timezoneSource")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicDatePoint =
            PublicDatePoint.builder()
                .day(0)
                .month(0)
                .timeType(PublicDatePoint.TimeType.DATE)
                .year(0)
                .zoneId("zoneId")
                .hour(0)
                .millisecond(0)
                .minute(0)
                .second(0)
                .timezoneSource("timezoneSource")
                .build()

        val roundtrippedPublicDatePoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicDatePoint),
                jacksonTypeRef<PublicDatePoint>(),
            )

        assertThat(roundtrippedPublicDatePoint).isEqualTo(publicDatePoint)
    }
}
