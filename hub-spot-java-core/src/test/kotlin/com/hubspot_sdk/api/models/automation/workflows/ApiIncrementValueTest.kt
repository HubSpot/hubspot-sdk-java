// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiIncrementValueTest {

    @Test
    fun create() {
        val apiIncrementValue =
            ApiIncrementValue.builder()
                .incrementAmount(2.0)
                .type(ApiIncrementValue.Type.INCREMENT)
                .build()

        assertThat(apiIncrementValue.incrementAmount()).isEqualTo(2.0)
        assertThat(apiIncrementValue.type()).isEqualTo(ApiIncrementValue.Type.INCREMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiIncrementValue =
            ApiIncrementValue.builder()
                .incrementAmount(2.0)
                .type(ApiIncrementValue.Type.INCREMENT)
                .build()

        val roundtrippedApiIncrementValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiIncrementValue),
                jacksonTypeRef<ApiIncrementValue>(),
            )

        assertThat(roundtrippedApiIncrementValue).isEqualTo(apiIncrementValue)
    }
}
