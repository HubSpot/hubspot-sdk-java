// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiActionDataValueTest {

    @Test
    fun create() {
        val apiActionDataValue =
            ApiActionDataValue.builder()
                .actionId("1")
                .dataKey("hs_execution_state")
                .type(ApiActionDataValue.Type.FIELD_DATA)
                .build()

        assertThat(apiActionDataValue.actionId()).isEqualTo("1")
        assertThat(apiActionDataValue.dataKey()).isEqualTo("hs_execution_state")
        assertThat(apiActionDataValue.type()).isEqualTo(ApiActionDataValue.Type.FIELD_DATA)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiActionDataValue =
            ApiActionDataValue.builder()
                .actionId("1")
                .dataKey("hs_execution_state")
                .type(ApiActionDataValue.Type.FIELD_DATA)
                .build()

        val roundtrippedApiActionDataValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiActionDataValue),
                jacksonTypeRef<ApiActionDataValue>(),
            )

        assertThat(roundtrippedApiActionDataValue).isEqualTo(apiActionDataValue)
    }
}
