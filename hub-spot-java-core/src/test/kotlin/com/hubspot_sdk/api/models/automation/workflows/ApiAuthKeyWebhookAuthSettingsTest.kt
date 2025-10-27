// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiAuthKeyWebhookAuthSettingsTest {

    @Test
    fun create() {
        val apiAuthKeyWebhookAuthSettings =
            ApiAuthKeyWebhookAuthSettings.builder()
                .location(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
                .name("name")
                .secretName("secretName")
                .type(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
                .build()

        assertThat(apiAuthKeyWebhookAuthSettings.location())
            .isEqualTo(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
        assertThat(apiAuthKeyWebhookAuthSettings.name()).isEqualTo("name")
        assertThat(apiAuthKeyWebhookAuthSettings.secretName()).isEqualTo("secretName")
        assertThat(apiAuthKeyWebhookAuthSettings.type())
            .isEqualTo(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiAuthKeyWebhookAuthSettings =
            ApiAuthKeyWebhookAuthSettings.builder()
                .location(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
                .name("name")
                .secretName("secretName")
                .type(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
                .build()

        val roundtrippedApiAuthKeyWebhookAuthSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiAuthKeyWebhookAuthSettings),
                jacksonTypeRef<ApiAuthKeyWebhookAuthSettings>(),
            )

        assertThat(roundtrippedApiAuthKeyWebhookAuthSettings)
            .isEqualTo(apiAuthKeyWebhookAuthSettings)
    }
}
