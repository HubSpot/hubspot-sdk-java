// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.extensions.videoconferencing.settings

import com.hubspot_sdk.api.models.crm.extensions.videoconferencing.ExternalSettings
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateParamsTest {

    @Test
    fun create() {
        SettingUpdateParams.builder()
            .appId(0)
            .externalSettings(
                ExternalSettings.builder()
                    .createMeetingUrl("https://example.com/create-meeting")
                    .deleteMeetingUrl("https://example.com/delete-meeting")
                    .fetchAccountsUri("fetchAccountsUri")
                    .updateMeetingUrl("https://example.com/update-meeting")
                    .userVerifyUrl("https://example.com/user-verify")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder()
                        .createMeetingUrl("https://example.com/create-meeting")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SettingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder()
                        .createMeetingUrl("https://example.com/create-meeting")
                        .deleteMeetingUrl("https://example.com/delete-meeting")
                        .fetchAccountsUri("fetchAccountsUri")
                        .updateMeetingUrl("https://example.com/update-meeting")
                        .userVerifyUrl("https://example.com/user-verify")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalSettings.builder()
                    .createMeetingUrl("https://example.com/create-meeting")
                    .deleteMeetingUrl("https://example.com/delete-meeting")
                    .fetchAccountsUri("fetchAccountsUri")
                    .updateMeetingUrl("https://example.com/update-meeting")
                    .userVerifyUrl("https://example.com/user-verify")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SettingUpdateParams.builder()
                .appId(0)
                .externalSettings(
                    ExternalSettings.builder()
                        .createMeetingUrl("https://example.com/create-meeting")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ExternalSettings.builder()
                    .createMeetingUrl("https://example.com/create-meeting")
                    .build()
            )
    }
}
