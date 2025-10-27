// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLinkAvailabilityAndBusyTimesTest {

    @Test
    fun create() {
        val externalLinkAvailabilityAndBusyTimes =
            ExternalLinkAvailabilityAndBusyTimes.builder()
                .addAllUsersBusyTime(
                    ExternalUserBusyTimes.builder()
                        .addBusyTime(ExternalTimeRange.builder().end(0).start(0).build())
                        .isOffline(true)
                        .meetingsUser(
                            ExternalMeetingsUser.builder()
                                .id("id")
                                .calendarProvider("calendarProvider")
                                .isSalesStarter(true)
                                .userId("userId")
                                .userProfile(
                                    ExternalUserProfile.builder()
                                        .email("email")
                                        .firstName("firstName")
                                        .fullName("fullName")
                                        .lastName("lastName")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .linkAvailability(
                    ExternalLinkAvailability.builder()
                        .hasMore(true)
                        .linkAvailabilityByDuration(
                            ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "availabilities" to
                                                listOf(
                                                    mapOf(
                                                        "endMillisUtc" to 0,
                                                        "startMillisUtc" to 0,
                                                    )
                                                ),
                                            "meetingDurationMillis" to 0,
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(externalLinkAvailabilityAndBusyTimes.allUsersBusyTimes())
            .containsExactly(
                ExternalUserBusyTimes.builder()
                    .addBusyTime(ExternalTimeRange.builder().end(0).start(0).build())
                    .isOffline(true)
                    .meetingsUser(
                        ExternalMeetingsUser.builder()
                            .id("id")
                            .calendarProvider("calendarProvider")
                            .isSalesStarter(true)
                            .userId("userId")
                            .userProfile(
                                ExternalUserProfile.builder()
                                    .email("email")
                                    .firstName("firstName")
                                    .fullName("fullName")
                                    .lastName("lastName")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(externalLinkAvailabilityAndBusyTimes.linkAvailability())
            .contains(
                ExternalLinkAvailability.builder()
                    .hasMore(true)
                    .linkAvailabilityByDuration(
                        ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf(
                                        "availabilities" to
                                            listOf(
                                                mapOf("endMillisUtc" to 0, "startMillisUtc" to 0)
                                            ),
                                        "meetingDurationMillis" to 0,
                                    )
                                ),
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLinkAvailabilityAndBusyTimes =
            ExternalLinkAvailabilityAndBusyTimes.builder()
                .addAllUsersBusyTime(
                    ExternalUserBusyTimes.builder()
                        .addBusyTime(ExternalTimeRange.builder().end(0).start(0).build())
                        .isOffline(true)
                        .meetingsUser(
                            ExternalMeetingsUser.builder()
                                .id("id")
                                .calendarProvider("calendarProvider")
                                .isSalesStarter(true)
                                .userId("userId")
                                .userProfile(
                                    ExternalUserProfile.builder()
                                        .email("email")
                                        .firstName("firstName")
                                        .fullName("fullName")
                                        .lastName("lastName")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .linkAvailability(
                    ExternalLinkAvailability.builder()
                        .hasMore(true)
                        .linkAvailabilityByDuration(
                            ExternalLinkAvailability.LinkAvailabilityByDuration.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf(
                                            "availabilities" to
                                                listOf(
                                                    mapOf(
                                                        "endMillisUtc" to 0,
                                                        "startMillisUtc" to 0,
                                                    )
                                                ),
                                            "meetingDurationMillis" to 0,
                                        )
                                    ),
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedExternalLinkAvailabilityAndBusyTimes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLinkAvailabilityAndBusyTimes),
                jacksonTypeRef<ExternalLinkAvailabilityAndBusyTimes>(),
            )

        assertThat(roundtrippedExternalLinkAvailabilityAndBusyTimes)
            .isEqualTo(externalLinkAvailabilityAndBusyTimes)
    }
}
