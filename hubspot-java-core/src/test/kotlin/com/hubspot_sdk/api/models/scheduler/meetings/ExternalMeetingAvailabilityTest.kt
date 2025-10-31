// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingAvailabilityTest {

    @Test
    fun create() {
        val externalMeetingAvailability =
            ExternalMeetingAvailability.builder().endMillisUtc(0).startMillisUtc(0).build()

        assertThat(externalMeetingAvailability.endMillisUtc()).isEqualTo(0)
        assertThat(externalMeetingAvailability.startMillisUtc()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingAvailability =
            ExternalMeetingAvailability.builder().endMillisUtc(0).startMillisUtc(0).build()

        val roundtrippedExternalMeetingAvailability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingAvailability),
                jacksonTypeRef<ExternalMeetingAvailability>(),
            )

        assertThat(roundtrippedExternalMeetingAvailability).isEqualTo(externalMeetingAvailability)
    }
}
