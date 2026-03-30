// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

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
                .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                .timeUnit(TimeOffset.TimeUnit.DAYS)
                .build()

        assertThat(timeOffset.amount()).isEqualTo(0)
        assertThat(timeOffset.offsetDirection()).isEqualTo(TimeOffset.OffsetDirection.FUTURE)
        assertThat(timeOffset.timeUnit()).isEqualTo(TimeOffset.TimeUnit.DAYS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val timeOffset =
            TimeOffset.builder()
                .amount(0)
                .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                .timeUnit(TimeOffset.TimeUnit.DAYS)
                .build()

        val roundtrippedTimeOffset =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(timeOffset),
                jacksonTypeRef<TimeOffset>(),
            )

        assertThat(roundtrippedTimeOffset).isEqualTo(timeOffset)
    }
}
