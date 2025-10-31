// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.workflows

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiObjectPropertyValueTest {

    @Test
    fun create() {
        val apiObjectPropertyValue =
            ApiObjectPropertyValue.builder()
                .propertyName("propertyName")
                .type(ApiObjectPropertyValue.Type.OBJECT_PROPERTY)
                .build()

        assertThat(apiObjectPropertyValue.propertyName()).isEqualTo("propertyName")
        assertThat(apiObjectPropertyValue.type())
            .isEqualTo(ApiObjectPropertyValue.Type.OBJECT_PROPERTY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val apiObjectPropertyValue =
            ApiObjectPropertyValue.builder()
                .propertyName("propertyName")
                .type(ApiObjectPropertyValue.Type.OBJECT_PROPERTY)
                .build()

        val roundtrippedApiObjectPropertyValue =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(apiObjectPropertyValue),
                jacksonTypeRef<ApiObjectPropertyValue>(),
            )

        assertThat(roundtrippedApiObjectPropertyValue).isEqualTo(apiObjectPropertyValue)
    }
}
