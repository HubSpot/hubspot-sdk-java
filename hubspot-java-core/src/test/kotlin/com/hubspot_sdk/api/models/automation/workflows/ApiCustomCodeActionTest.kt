// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiCustomCodeActionTest {

    @Test
    fun create() {
        val apiCustomCodeAction =
            ApiCustomCodeAction.builder()
                .actionId("actionId")
                .addInputField(
                    ApiInputVariable.builder()
                        .name("name")
                        .value(
                            ApiActionDataValue.builder()
                                .actionId("actionId")
                                .dataKey("dataKey")
                                .type(ApiActionDataValue.Type.FIELD_DATA)
                                .build()
                        )
                        .build()
                )
                .addOutputField(
                    ApiEnumerationOutputField.builder()
                        .name("name")
                        .addOption("string")
                        .type(ApiEnumerationOutputField.Type.ENUMERATION)
                        .build()
                )
                .runtime("runtime")
                .addSecretName("string")
                .sourceCode("sourceCode")
                .type(ApiCustomCodeAction.Type.CUSTOM_CODE)
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        assertThat(apiCustomCodeAction.actionId()).isEqualTo("actionId")
        assertThat(apiCustomCodeAction.inputFields())
            .containsExactly(
                ApiInputVariable.builder()
                    .name("name")
                    .value(
                        ApiActionDataValue.builder()
                            .actionId("actionId")
                            .dataKey("dataKey")
                            .type(ApiActionDataValue.Type.FIELD_DATA)
                            .build()
                    )
                    .build()
            )
        assertThat(apiCustomCodeAction.outputFields())
            .containsExactly(
                ApiEnumerationOutputField.builder()
                    .name("name")
                    .addOption("string")
                    .type(ApiEnumerationOutputField.Type.ENUMERATION)
                    .build()
            )
        assertThat(apiCustomCodeAction.runtime()).isEqualTo("runtime")
        assertThat(apiCustomCodeAction.secretNames()).containsExactly("string")
        assertThat(apiCustomCodeAction.sourceCode()).isEqualTo("sourceCode")
        assertThat(apiCustomCodeAction.type()).isEqualTo(ApiCustomCodeAction.Type.CUSTOM_CODE)
        assertThat(apiCustomCodeAction.connection())
            .contains(
                ApiConnection.builder().edgeType("edgeType").nextActionId("nextActionId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiCustomCodeAction =
            ApiCustomCodeAction.builder()
                .actionId("actionId")
                .addInputField(
                    ApiInputVariable.builder()
                        .name("name")
                        .value(
                            ApiActionDataValue.builder()
                                .actionId("actionId")
                                .dataKey("dataKey")
                                .type(ApiActionDataValue.Type.FIELD_DATA)
                                .build()
                        )
                        .build()
                )
                .addOutputField(
                    ApiEnumerationOutputField.builder()
                        .name("name")
                        .addOption("string")
                        .type(ApiEnumerationOutputField.Type.ENUMERATION)
                        .build()
                )
                .runtime("runtime")
                .addSecretName("string")
                .sourceCode("sourceCode")
                .type(ApiCustomCodeAction.Type.CUSTOM_CODE)
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        val roundtrippedApiCustomCodeAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiCustomCodeAction),
                jacksonTypeRef<ApiCustomCodeAction>(),
            )

        assertThat(roundtrippedApiCustomCodeAction).isEqualTo(apiCustomCodeAction)
    }
}
