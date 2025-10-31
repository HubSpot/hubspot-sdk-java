// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiSignatureWebhookAuthSettingsTest {

    @Test
    fun create() {
        val apiSignatureWebhookAuthSettings =
            ApiSignatureWebhookAuthSettings.builder()
                .appId(0)
                .type(ApiSignatureWebhookAuthSettings.Type.SIGNATURE)
                .build()

        assertThat(apiSignatureWebhookAuthSettings.appId()).isEqualTo(0)
        assertThat(apiSignatureWebhookAuthSettings.type())
            .isEqualTo(ApiSignatureWebhookAuthSettings.Type.SIGNATURE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiSignatureWebhookAuthSettings =
            ApiSignatureWebhookAuthSettings.builder()
                .appId(0)
                .type(ApiSignatureWebhookAuthSettings.Type.SIGNATURE)
                .build()

        val roundtrippedApiSignatureWebhookAuthSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiSignatureWebhookAuthSettings),
                jacksonTypeRef<ApiSignatureWebhookAuthSettings>(),
            )

        assertThat(roundtrippedApiSignatureWebhookAuthSettings)
            .isEqualTo(apiSignatureWebhookAuthSettings)
    }
}
