// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingAvailabilityTest {

    @Test
    fun create() {
        val externalMeetingAvailability =
            ExternalMeetingAvailability.builder().endMillisUtc(0L).startMillisUtc(0L).build()

        assertThat(externalMeetingAvailability.endMillisUtc()).isEqualTo(0L)
        assertThat(externalMeetingAvailability.startMillisUtc()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingAvailability =
            ExternalMeetingAvailability.builder().endMillisUtc(0L).startMillisUtc(0L).build()

        val roundtrippedExternalMeetingAvailability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingAvailability),
                jacksonTypeRef<ExternalMeetingAvailability>(),
            )

        assertThat(roundtrippedExternalMeetingAvailability).isEqualTo(externalMeetingAvailability)
    }
}
