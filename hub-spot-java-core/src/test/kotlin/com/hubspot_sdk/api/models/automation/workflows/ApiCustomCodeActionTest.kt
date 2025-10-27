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
                .actionId("1")
                .addInputField(
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
                .addOutputField(
                    ApiEnumerationOutputField.builder()
                        .name("name")
                        .addOption("string")
                        .type(ApiEnumerationOutputField.Type.ENUMERATION)
                        .build()
                )
                .runtime("PYTHON39")
                .addSecretName("string")
                .sourceCode(
                    "def main(event):   # Use inputs to get data from any action in your workflow and use it in your code instead of having to use the HubSpot API.   email = event[\"inputFields\"][\"email\"]   # Return the output data that can be used in later actions in your workflow.   return {     \"outputFields\": {       \"email\": email     }   }"
                )
                .type(ApiCustomCodeAction.Type.CUSTOM_CODE)
                .connection(
                    ApiConnection.builder()
                        .edgeType("edgeType")
                        .nextActionId("nextActionId")
                        .build()
                )
                .build()

        assertThat(apiCustomCodeAction.actionId()).isEqualTo("1")
        assertThat(apiCustomCodeAction.inputFields())
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
        assertThat(apiCustomCodeAction.outputFields())
            .containsExactly(
                ApiEnumerationOutputField.builder()
                    .name("name")
                    .addOption("string")
                    .type(ApiEnumerationOutputField.Type.ENUMERATION)
                    .build()
            )
        assertThat(apiCustomCodeAction.runtime()).isEqualTo("PYTHON39")
        assertThat(apiCustomCodeAction.secretNames()).containsExactly("string")
        assertThat(apiCustomCodeAction.sourceCode())
            .isEqualTo(
                "def main(event):   # Use inputs to get data from any action in your workflow and use it in your code instead of having to use the HubSpot API.   email = event[\"inputFields\"][\"email\"]   # Return the output data that can be used in later actions in your workflow.   return {     \"outputFields\": {       \"email\": email     }   }"
            )
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
                .actionId("1")
                .addInputField(
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
                .addOutputField(
                    ApiEnumerationOutputField.builder()
                        .name("name")
                        .addOption("string")
                        .type(ApiEnumerationOutputField.Type.ENUMERATION)
                        .build()
                )
                .runtime("PYTHON39")
                .addSecretName("string")
                .sourceCode(
                    "def main(event):   # Use inputs to get data from any action in your workflow and use it in your code instead of having to use the HubSpot API.   email = event[\"inputFields\"][\"email\"]   # Return the output data that can be used in later actions in your workflow.   return {     \"outputFields\": {       \"email\": email     }   }"
                )
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
