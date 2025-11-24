// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnenrollmentSettingsResponseTest {

    @Test
    fun create() {
        val unenrollmentSettingsResponse =
            UnenrollmentSettingsResponse.builder()
                .emailSettings(
                    EmailSettingsResponse.builder()
                        .criteria(EmailSettingsResponse.Criteria.ALL)
                        .sellingStrategy(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                        .build()
                )
                .meetingSettings(
                    MeetingSettingsResponse.builder()
                        .criteria(MeetingSettingsResponse.Criteria.ALL)
                        .sellingStrategy(MeetingSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                        .build()
                )
                .build()

        assertThat(unenrollmentSettingsResponse.emailSettings())
            .isEqualTo(
                EmailSettingsResponse.builder()
                    .criteria(EmailSettingsResponse.Criteria.ALL)
                    .sellingStrategy(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                    .build()
            )
        assertThat(unenrollmentSettingsResponse.meetingSettings())
            .isEqualTo(
                MeetingSettingsResponse.builder()
                    .criteria(MeetingSettingsResponse.Criteria.ALL)
                    .sellingStrategy(MeetingSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unenrollmentSettingsResponse =
            UnenrollmentSettingsResponse.builder()
                .emailSettings(
                    EmailSettingsResponse.builder()
                        .criteria(EmailSettingsResponse.Criteria.ALL)
                        .sellingStrategy(EmailSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                        .build()
                )
                .meetingSettings(
                    MeetingSettingsResponse.builder()
                        .criteria(MeetingSettingsResponse.Criteria.ALL)
                        .sellingStrategy(MeetingSettingsResponse.SellingStrategy.ACCOUNT_BASED)
                        .build()
                )
                .build()

        val roundtrippedUnenrollmentSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unenrollmentSettingsResponse),
                jacksonTypeRef<UnenrollmentSettingsResponse>(),
            )

        assertThat(roundtrippedUnenrollmentSettingsResponse).isEqualTo(unenrollmentSettingsResponse)
    }
}
