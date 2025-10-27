// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiAppendObjectPropertyValueTest {

    @Test
    fun create() {
        val apiAppendObjectPropertyValue =
            ApiAppendObjectPropertyValue.builder()
                .appendPropertyName("firstname")
                .type(ApiAppendObjectPropertyValue.Type.APPEND_OBJECT_PROPERTY)
                .build()

        assertThat(apiAppendObjectPropertyValue.appendPropertyName()).isEqualTo("firstname")
        assertThat(apiAppendObjectPropertyValue.type())
            .isEqualTo(ApiAppendObjectPropertyValue.Type.APPEND_OBJECT_PROPERTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiAppendObjectPropertyValue =
            ApiAppendObjectPropertyValue.builder()
                .appendPropertyName("firstname")
                .type(ApiAppendObjectPropertyValue.Type.APPEND_OBJECT_PROPERTY)
                .build()

        val roundtrippedApiAppendObjectPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiAppendObjectPropertyValue),
                jacksonTypeRef<ApiAppendObjectPropertyValue>(),
            )

        assertThat(roundtrippedApiAppendObjectPropertyValue).isEqualTo(apiAppendObjectPropertyValue)
    }
}
