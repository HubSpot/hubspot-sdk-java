// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.videoconferencing

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalSettingsTest {

    @Test
    fun create() {
        val externalSettings =
            ExternalSettings.builder()
                .createMeetingUrl("https://example.com/create-meeting")
                .deleteMeetingUrl("https://example.com/delete-meeting")
                .fetchAccountsUri("fetchAccountsUri")
                .updateMeetingUrl("https://example.com/update-meeting")
                .userVerifyUrl("https://example.com/user-verify")
                .build()

        assertThat(externalSettings.createMeetingUrl())
            .isEqualTo("https://example.com/create-meeting")
        assertThat(externalSettings.deleteMeetingUrl())
            .contains("https://example.com/delete-meeting")
        assertThat(externalSettings.fetchAccountsUri()).contains("fetchAccountsUri")
        assertThat(externalSettings.updateMeetingUrl())
            .contains("https://example.com/update-meeting")
        assertThat(externalSettings.userVerifyUrl()).contains("https://example.com/user-verify")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalSettings =
            ExternalSettings.builder()
                .createMeetingUrl("https://example.com/create-meeting")
                .deleteMeetingUrl("https://example.com/delete-meeting")
                .fetchAccountsUri("fetchAccountsUri")
                .updateMeetingUrl("https://example.com/update-meeting")
                .userVerifyUrl("https://example.com/user-verify")
                .build()

        val roundtrippedExternalSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalSettings),
                jacksonTypeRef<ExternalSettings>(),
            )

        assertThat(roundtrippedExternalSettings).isEqualTo(externalSettings)
    }
}
