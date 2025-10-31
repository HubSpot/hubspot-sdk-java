// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticAppendValueTest {

    @Test
    fun create() {
        val apiStaticAppendValue =
            ApiStaticAppendValue.builder()
                .staticAppendValue("some_value")
                .type(ApiStaticAppendValue.Type.STATIC_APPEND_VALUE)
                .build()

        assertThat(apiStaticAppendValue.staticAppendValue()).isEqualTo("some_value")
        assertThat(apiStaticAppendValue.type())
            .isEqualTo(ApiStaticAppendValue.Type.STATIC_APPEND_VALUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticAppendValue =
            ApiStaticAppendValue.builder()
                .staticAppendValue("some_value")
                .type(ApiStaticAppendValue.Type.STATIC_APPEND_VALUE)
                .build()

        val roundtrippedApiStaticAppendValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticAppendValue),
                jacksonTypeRef<ApiStaticAppendValue>(),
            )

        assertThat(roundtrippedApiStaticAppendValue).isEqualTo(apiStaticAppendValue)
    }
}
