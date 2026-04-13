// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.videoconferencing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalSettingsTest {

    @Test
    fun create() {
        val externalSettings =
            ExternalSettings.builder()
                .createMeetingUrl("createMeetingUrl")
                .deleteMeetingUrl("deleteMeetingUrl")
                .fetchAccountsUri("fetchAccountsUri")
                .updateMeetingUrl("updateMeetingUrl")
                .userVerifyUrl("userVerifyUrl")
                .build()

        assertThat(externalSettings.createMeetingUrl()).isEqualTo("createMeetingUrl")
        assertThat(externalSettings.deleteMeetingUrl()).contains("deleteMeetingUrl")
        assertThat(externalSettings.fetchAccountsUri()).contains("fetchAccountsUri")
        assertThat(externalSettings.updateMeetingUrl()).contains("updateMeetingUrl")
        assertThat(externalSettings.userVerifyUrl()).contains("userVerifyUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalSettings =
            ExternalSettings.builder()
                .createMeetingUrl("createMeetingUrl")
                .deleteMeetingUrl("deleteMeetingUrl")
                .fetchAccountsUri("fetchAccountsUri")
                .updateMeetingUrl("updateMeetingUrl")
                .userVerifyUrl("userVerifyUrl")
                .build()

        val roundtrippedExternalSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalSettings),
                jacksonTypeRef<ExternalSettings>(),
            )

        assertThat(roundtrippedExternalSettings).isEqualTo(externalSettings)
    }
}
