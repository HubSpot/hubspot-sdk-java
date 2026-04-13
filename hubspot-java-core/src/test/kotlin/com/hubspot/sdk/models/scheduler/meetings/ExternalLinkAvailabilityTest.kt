// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkAvailabilityTest {

    @Test
    fun create() {
        val externalLinkAvailability =
            ExternalLinkAvailability.builder()
                .hasMore(true)
                .linkAvailabilityByDuration(
                    ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "availabilities" to
                                        listOf(mapOf("endMillisUtc" to 0, "startMillisUtc" to 0)),
                                    "meetingDurationMillis" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        assertThat(externalLinkAvailability.hasMore()).isEqualTo(true)
        assertThat(externalLinkAvailability.linkAvailabilityByDuration())
            .isEqualTo(
                ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "availabilities" to
                                    listOf(mapOf("endMillisUtc" to 0, "startMillisUtc" to 0)),
                                "meetingDurationMillis" to 0,
                            )
                        ),
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkAvailability =
            ExternalLinkAvailability.builder()
                .hasMore(true)
                .linkAvailabilityByDuration(
                    ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "availabilities" to
                                        listOf(mapOf("endMillisUtc" to 0, "startMillisUtc" to 0)),
                                    "meetingDurationMillis" to 0,
                                )
                            ),
                        )
                        .build()
                )
                .build()

        val roundtrippedExternalLinkAvailability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkAvailability),
                jacksonTypeRef<ExternalLinkAvailability>(),
            )

        assertThat(roundtrippedExternalLinkAvailability).isEqualTo(externalLinkAvailability)
    }
}
