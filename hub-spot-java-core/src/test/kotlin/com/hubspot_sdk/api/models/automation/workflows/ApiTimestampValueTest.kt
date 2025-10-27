// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiTimestampValueTest {

    @Test
    fun create() {
        val apiTimestampValue =
            ApiTimestampValue.builder()
                .timestampType(ApiTimestampValue.TimestampType.EXECUTION_TIME)
                .type(ApiTimestampValue.Type.TIMESTAMP)
                .build()

        assertThat(apiTimestampValue.timestampType())
            .isEqualTo(ApiTimestampValue.TimestampType.EXECUTION_TIME)
        assertThat(apiTimestampValue.type()).isEqualTo(ApiTimestampValue.Type.TIMESTAMP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiTimestampValue =
            ApiTimestampValue.builder()
                .timestampType(ApiTimestampValue.TimestampType.EXECUTION_TIME)
                .type(ApiTimestampValue.Type.TIMESTAMP)
                .build()

        val roundtrippedApiTimestampValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiTimestampValue),
                jacksonTypeRef<ApiTimestampValue>(),
            )

        assertThat(roundtrippedApiTimestampValue).isEqualTo(apiTimestampValue)
    }
}
