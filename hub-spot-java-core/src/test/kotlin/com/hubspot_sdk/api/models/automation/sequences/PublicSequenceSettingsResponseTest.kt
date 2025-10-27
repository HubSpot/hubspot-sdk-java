// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceSettingsResponseTest {

    @Test
    fun create() {
        val publicSequenceSettingsResponse =
            PublicSequenceSettingsResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eligibleFollowUpDays("eligibleFollowUpDays")
                .individualTaskRemindersEnabled(true)
                .sellingStrategy("sellingStrategy")
                .sendWindowEndMinute(0)
                .sendWindowStartMinute(0)
                .taskReminderMinute(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unenrollmentSettings(
                    UnenrollmentSettingsResponse.builder()
                        .emailSettings(
                            EmailSettingsResponse.builder()
                                .criteria(EmailSettingsResponse.Criteria.ALL)
                                .sellingStrategy(EmailSettingsResponse.SellingStrategy.LEAD_BASED)
                                .build()
                        )
                        .meetingSettings(
                            MeetingSettingsResponse.builder()
                                .criteria(MeetingSettingsResponse.Criteria.ALL)
                                .sellingStrategy(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(publicSequenceSettingsResponse.id()).isEqualTo("id")
        assertThat(publicSequenceSettingsResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceSettingsResponse.eligibleFollowUpDays())
            .isEqualTo("eligibleFollowUpDays")
        assertThat(publicSequenceSettingsResponse.individualTaskRemindersEnabled()).isEqualTo(true)
        assertThat(publicSequenceSettingsResponse.sellingStrategy()).isEqualTo("sellingStrategy")
        assertThat(publicSequenceSettingsResponse.sendWindowEndMinute()).isEqualTo(0)
        assertThat(publicSequenceSettingsResponse.sendWindowStartMinute()).isEqualTo(0)
        assertThat(publicSequenceSettingsResponse.taskReminderMinute()).isEqualTo(0)
        assertThat(publicSequenceSettingsResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceSettingsResponse.unenrollmentSettings())
            .contains(
                UnenrollmentSettingsResponse.builder()
                    .emailSettings(
                        EmailSettingsResponse.builder()
                            .criteria(EmailSettingsResponse.Criteria.ALL)
                            .sellingStrategy(EmailSettingsResponse.SellingStrategy.LEAD_BASED)
                            .build()
                    )
                    .meetingSettings(
                        MeetingSettingsResponse.builder()
                            .criteria(MeetingSettingsResponse.Criteria.ALL)
                            .sellingStrategy(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceSettingsResponse =
            PublicSequenceSettingsResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eligibleFollowUpDays("eligibleFollowUpDays")
                .individualTaskRemindersEnabled(true)
                .sellingStrategy("sellingStrategy")
                .sendWindowEndMinute(0)
                .sendWindowStartMinute(0)
                .taskReminderMinute(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .unenrollmentSettings(
                    UnenrollmentSettingsResponse.builder()
                        .emailSettings(
                            EmailSettingsResponse.builder()
                                .criteria(EmailSettingsResponse.Criteria.ALL)
                                .sellingStrategy(EmailSettingsResponse.SellingStrategy.LEAD_BASED)
                                .build()
                        )
                        .meetingSettings(
                            MeetingSettingsResponse.builder()
                                .criteria(MeetingSettingsResponse.Criteria.ALL)
                                .sellingStrategy(MeetingSettingsResponse.SellingStrategy.LEAD_BASED)
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPublicSequenceSettingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceSettingsResponse),
                jacksonTypeRef<PublicSequenceSettingsResponse>(),
            )

        assertThat(roundtrippedPublicSequenceSettingsResponse)
            .isEqualTo(publicSequenceSettingsResponse)
    }
}
