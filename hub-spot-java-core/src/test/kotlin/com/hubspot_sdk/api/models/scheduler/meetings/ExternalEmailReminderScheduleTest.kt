// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalEmailReminderScheduleTest {

    @Test
    fun create() {
        val externalEmailReminderSchedule =
            ExternalEmailReminderSchedule.builder()
                .addReminder(
                    ExternalReminder.builder().numberOfTimeUnits(0).timeUnit("timeUnit").build()
                )
                .shouldIncludeInviteDescription(true)
                .build()

        assertThat(externalEmailReminderSchedule.reminders())
            .containsExactly(
                ExternalReminder.builder().numberOfTimeUnits(0).timeUnit("timeUnit").build()
            )
        assertThat(externalEmailReminderSchedule.shouldIncludeInviteDescription()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalEmailReminderSchedule =
            ExternalEmailReminderSchedule.builder()
                .addReminder(
                    ExternalReminder.builder().numberOfTimeUnits(0).timeUnit("timeUnit").build()
                )
                .shouldIncludeInviteDescription(true)
                .build()

        val roundtrippedExternalEmailReminderSchedule =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalEmailReminderSchedule),
                jacksonTypeRef<ExternalEmailReminderSchedule>(),
            )

        assertThat(roundtrippedExternalEmailReminderSchedule)
            .isEqualTo(externalEmailReminderSchedule)
    }
}
