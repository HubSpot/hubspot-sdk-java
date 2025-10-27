// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalMeetingsUserTest {

    @Test
    fun create() {
        val externalMeetingsUser =
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

        assertThat(externalMeetingsUser.id()).isEqualTo("id")
        assertThat(externalMeetingsUser.calendarProvider()).isEqualTo("calendarProvider")
        assertThat(externalMeetingsUser.isSalesStarter()).isEqualTo(true)
        assertThat(externalMeetingsUser.userId()).isEqualTo("userId")
        assertThat(externalMeetingsUser.userProfile())
            .isEqualTo(
                ExternalUserProfile.builder()
                    .email("email")
                    .firstName("firstName")
                    .fullName("fullName")
                    .lastName("lastName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalMeetingsUser =
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

        val roundtrippedExternalMeetingsUser =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalMeetingsUser),
                jacksonTypeRef<ExternalMeetingsUser>(),
            )

        assertThat(roundtrippedExternalMeetingsUser).isEqualTo(externalMeetingsUser)
    }
}
