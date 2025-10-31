// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiInputVariableTest {

    @Test
    fun create() {
        val apiInputVariable =
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

        assertThat(apiInputVariable.name()).isEqualTo("name")
        assertThat(apiInputVariable.value())
            .isEqualTo(
                ApiInputVariable.Value.ofApiActionData(
                    ApiActionDataValue.builder()
                        .actionId("actionId")
                        .dataKey("dataKey")
                        .type(ApiActionDataValue.Type.FIELD_DATA)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiInputVariable =
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

        val roundtrippedApiInputVariable =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiInputVariable),
                jacksonTypeRef<ApiInputVariable>(),
            )

        assertThat(roundtrippedApiInputVariable).isEqualTo(apiInputVariable)
    }
}
