// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalGuestSettingsTest {

    @Test
    fun create() {
        val externalGuestSettings =
            ExternalGuestSettings.builder().canAddGuests(true).maxGuestCount(0).build()

        assertThat(externalGuestSettings.canAddGuests()).isEqualTo(true)
        assertThat(externalGuestSettings.maxGuestCount()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalGuestSettings =
            ExternalGuestSettings.builder().canAddGuests(true).maxGuestCount(0).build()

        val roundtrippedExternalGuestSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalGuestSettings),
                jacksonTypeRef<ExternalGuestSettings>(),
            )

        assertThat(roundtrippedExternalGuestSettings).isEqualTo(externalGuestSettings)
    }
}
