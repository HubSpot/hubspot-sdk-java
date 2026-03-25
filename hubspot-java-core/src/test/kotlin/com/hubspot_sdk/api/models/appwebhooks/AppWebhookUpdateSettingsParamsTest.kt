// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.appwebhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AppWebhookUpdateSettingsParamsTest {

    @Test
    fun create() {
        AppWebhookUpdateSettingsParams.builder()
            .appId(0)
            .settingsChangeRequest(
                SettingsChangeRequest.builder()
                    .targetUrl("targetUrl")
                    .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AppWebhookUpdateSettingsParams.builder()
                .appId(0)
                .settingsChangeRequest(
                    SettingsChangeRequest.builder()
                        .targetUrl("targetUrl")
                        .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
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
            AppWebhookUpdateSettingsParams.builder()
                .appId(0)
                .settingsChangeRequest(
                    SettingsChangeRequest.builder()
                        .targetUrl("targetUrl")
                        .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SettingsChangeRequest.builder()
                    .targetUrl("targetUrl")
                    .throttling(ThrottlingSettings.builder().maxConcurrentRequests(0).build())
                    .build()
            )
    }
}
