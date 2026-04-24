// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkAvailabilityForDurationTest {

    @Test
    fun create() {
        val externalLinkAvailabilityForDuration =
            ExternalLinkAvailabilityForDuration.builder()
                .addAvailability(
                    ExternalMeetingAvailability.builder()
                        .endMillisUtc(0L)
                        .startMillisUtc(0L)
                        .build()
                )
                .meetingDurationMillis(0L)
                .build()

        assertThat(externalLinkAvailabilityForDuration.availabilities())
            .containsExactly(
                ExternalMeetingAvailability.builder().endMillisUtc(0L).startMillisUtc(0L).build()
            )
        assertThat(externalLinkAvailabilityForDuration.meetingDurationMillis()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkAvailabilityForDuration =
            ExternalLinkAvailabilityForDuration.builder()
                .addAvailability(
                    ExternalMeetingAvailability.builder()
                        .endMillisUtc(0L)
                        .startMillisUtc(0L)
                        .build()
                )
                .meetingDurationMillis(0L)
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
