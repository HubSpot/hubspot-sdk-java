// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiWebhookActionTest {

    @Test
    fun create() {
        val apiWebhookAction =
            ApiWebhookAction.builder()
                .actionId("1")
                .method(ApiWebhookAction.Method.POST)
                .addQueryParam(
                    ApiInputVariable.builder()
                        .name("name")
                        .value(
                            ApiActionDataValue.builder()
                                .actionId("1")
                                .dataKey("hs_execution_state")
                                .type(ApiActionDataValue.Type.FIELD_DATA)
                                .build()
                        )
                        .build()
                )
                .type(ApiWebhookAction.Type.WEBHOOK)
                .webhookUrl("https://example.com/test_webhook")
                .authSettings(
                    ApiAuthKeyWebhookAuthSettings.builder()
                        .location(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
                        .name("name")
                        .secretName("secretName")
                        .type(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
                        .build()
                )
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        assertThat(apiWebhookAction.actionId()).isEqualTo("1")
        assertThat(apiWebhookAction.method()).isEqualTo(ApiWebhookAction.Method.POST)
        assertThat(apiWebhookAction.queryParams())
            .containsExactly(
                ApiInputVariable.builder()
                    .name("name")
                    .value(
                        ApiActionDataValue.builder()
                            .actionId("1")
                            .dataKey("hs_execution_state")
                            .type(ApiActionDataValue.Type.FIELD_DATA)
                            .build()
                    )
                    .build()
            )
        assertThat(apiWebhookAction.type()).isEqualTo(ApiWebhookAction.Type.WEBHOOK)
        assertThat(apiWebhookAction.webhookUrl()).isEqualTo("https://example.com/test_webhook")
        assertThat(apiWebhookAction.authSettings())
            .contains(
                ApiWebhookAction.AuthSettings.ofApiAuthKeyWebhook(
                    ApiAuthKeyWebhookAuthSettings.builder()
                        .location(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
                        .name("name")
                        .secretName("secretName")
                        .type(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
                        .build()
                )
            )
        assertThat(apiWebhookAction.connection())
            .contains(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiWebhookAction =
            ApiWebhookAction.builder()
                .actionId("1")
                .method(ApiWebhookAction.Method.POST)
                .addQueryParam(
                    ApiInputVariable.builder()
                        .name("name")
                        .value(
                            ApiActionDataValue.builder()
                                .actionId("1")
                                .dataKey("hs_execution_state")
                                .type(ApiActionDataValue.Type.FIELD_DATA)
                                .build()
                        )
                        .build()
                )
                .type(ApiWebhookAction.Type.WEBHOOK)
                .webhookUrl("https://example.com/test_webhook")
                .authSettings(
                    ApiAuthKeyWebhookAuthSettings.builder()
                        .location(ApiAuthKeyWebhookAuthSettings.Location.HEADER)
                        .name("name")
                        .secretName("secretName")
                        .type(ApiAuthKeyWebhookAuthSettings.Type.AUTH_KEY)
                        .build()
                )
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        val roundtrippedApiWebhookAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiWebhookAction),
                jacksonTypeRef<ApiWebhookAction>(),
            )

        assertThat(roundtrippedApiWebhookAction).isEqualTo(apiWebhookAction)
    }
}
