// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.settings

import com.hubspot_sdk.api.models.webhooks.SettingsChangeRequest
import com.hubspot_sdk.api.models.webhooks.ThrottlingSettings
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingUpdateParamsTest {

    @Test
    fun create() {
        SettingUpdateParams.builder()
            .appId(0)
            .settingsChangeRequest(
                SettingsChangeRequest.builder()
                    .targetUrl("https://www.example.com/hubspot/target")
                    .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingUpdateParams.builder()
                .appId(0)
                .settingsChangeRequest(
                    SettingsChangeRequest.builder()
                        .targetUrl("https://www.example.com/hubspot/target")
                        .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
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
                .settingsChangeRequest(
                    SettingsChangeRequest.builder()
                        .targetUrl("https://www.example.com/hubspot/target")
                        .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SettingsChangeRequest.builder()
                    .targetUrl("https://www.example.com/hubspot/target")
                    .throttling(ThrottlingSettings.builder().maxConcurrentRequests(10).build())
                    .build()
            )
    }
}
