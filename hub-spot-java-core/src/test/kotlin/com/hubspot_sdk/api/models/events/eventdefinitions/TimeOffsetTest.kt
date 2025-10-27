// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TimeOffsetTest {

    @Test
    fun create() {
        val timeOffset =
            TimeOffset.builder()
                .amount(0)
                .offsetDirection(TimeOffset.OffsetDirection.PAST)
                .timeUnit(TimeOffset.TimeUnit.WEEKS)
                .build()

        assertThat(timeOffset.amount()).isEqualTo(0)
        assertThat(timeOffset.offsetDirection()).isEqualTo(TimeOffset.OffsetDirection.PAST)
        assertThat(timeOffset.timeUnit()).isEqualTo(TimeOffset.TimeUnit.WEEKS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeOffset =
            TimeOffset.builder()
                .amount(0)
                .offsetDirection(TimeOffset.OffsetDirection.PAST)
                .timeUnit(TimeOffset.TimeUnit.WEEKS)
                .build()

        val roundtrippedTimeOffset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeOffset),
                jacksonTypeRef<TimeOffset>(),
            )

        assertThat(roundtrippedTimeOffset).isEqualTo(timeOffset)
    }
}
