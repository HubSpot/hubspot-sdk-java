// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiStaticValueTest {

    @Test
    fun create() {
        val apiStaticValue =
            ApiStaticValue.builder()
                .staticValue("some value")
                .type(ApiStaticValue.Type.STATIC_VALUE)
                .build()

        assertThat(apiStaticValue.staticValue()).isEqualTo("some value")
        assertThat(apiStaticValue.type()).isEqualTo(ApiStaticValue.Type.STATIC_VALUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiStaticValue =
            ApiStaticValue.builder()
                .staticValue("some value")
                .type(ApiStaticValue.Type.STATIC_VALUE)
                .build()

        val roundtrippedApiStaticValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiStaticValue),
                jacksonTypeRef<ApiStaticValue>(),
            )

        assertThat(roundtrippedApiStaticValue).isEqualTo(apiStaticValue)
    }
}
