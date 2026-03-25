// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkAvailabilityForDurationTest {

    @Test
    fun create() {
        val externalLinkAvailabilityForDuration =
            ExternalLinkAvailabilityForDuration.builder()
                .addAvailability(
                    ExternalMeetingAvailability.builder().endMillisUtc(0).startMillisUtc(0).build()
                )
                .meetingDurationMillis(0)
                .build()

        assertThat(externalLinkAvailabilityForDuration.availabilities())
            .containsExactly(
                ExternalMeetingAvailability.builder().endMillisUtc(0).startMillisUtc(0).build()
            )
        assertThat(externalLinkAvailabilityForDuration.meetingDurationMillis()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkAvailabilityForDuration =
            ExternalLinkAvailabilityForDuration.builder()
                .addAvailability(
                    ExternalMeetingAvailability.builder().endMillisUtc(0).startMillisUtc(0).build()
                )
                .meetingDurationMillis(0)
                .build()

        val roundtrippedExternalLinkAvailabilityForDuration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkAvailabilityForDuration),
                jacksonTypeRef<ExternalLinkAvailabilityForDuration>(),
            )

        assertThat(roundtrippedExternalLinkAvailabilityForDuration)
            .isEqualTo(externalLinkAvailabilityForDuration)
    }
}
