// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalUserBusyTimesTest {

    @Test
    fun create() {
        val externalUserBusyTimes =
            ExternalUserBusyTimes.builder()
                .addBusyTime(ExternalTimeRange.builder().end(0).start(0).build())
                .isOffline(true)
                .meetingsUser(
                    ExternalMeetingsUser.builder()
                        .id("id")
                        .calendarProvider(ExternalMeetingsUser.CalendarProvider.EXCHANGE)
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

        assertThat(externalUserBusyTimes.busyTimes())
            .containsExactly(ExternalTimeRange.builder().end(0).start(0).build())
        assertThat(externalUserBusyTimes.isOffline()).isEqualTo(true)
        assertThat(externalUserBusyTimes.meetingsUser())
            .isEqualTo(
                ExternalMeetingsUser.builder()
                    .id("id")
                    .calendarProvider(ExternalMeetingsUser.CalendarProvider.EXCHANGE)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalUserBusyTimes =
            ExternalUserBusyTimes.builder()
                .addBusyTime(ExternalTimeRange.builder().end(0).start(0).build())
                .isOffline(true)
                .meetingsUser(
                    ExternalMeetingsUser.builder()
                        .id("id")
                        .calendarProvider(ExternalMeetingsUser.CalendarProvider.EXCHANGE)
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

        val roundtrippedExternalUserBusyTimes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalUserBusyTimes),
                jacksonTypeRef<ExternalUserBusyTimes>(),
            )

        assertThat(roundtrippedExternalUserBusyTimes).isEqualTo(externalUserBusyTimes)
    }
}
