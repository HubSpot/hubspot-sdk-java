// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalReminderTest {

    @Test
    fun create() {
        val externalReminder =
            ExternalReminder.builder()
                .numberOfTimeUnits(0)
                .timeUnit(ExternalReminder.TimeUnit.DAYS)
                .build()

        assertThat(externalReminder.numberOfTimeUnits()).isEqualTo(0)
        assertThat(externalReminder.timeUnit()).isEqualTo(ExternalReminder.TimeUnit.DAYS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalReminder =
            ExternalReminder.builder()
                .numberOfTimeUnits(0)
                .timeUnit(ExternalReminder.TimeUnit.DAYS)
                .build()

        val roundtrippedExternalReminder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalReminder),
                jacksonTypeRef<ExternalReminder>(),
            )

        assertThat(roundtrippedExternalReminder).isEqualTo(externalReminder)
    }
}
