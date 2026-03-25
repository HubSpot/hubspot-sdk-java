// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyNameTest {

    @Test
    fun create() {
        val propertyName = PropertyName.builder().name("name").build()

        assertThat(propertyName.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyName = PropertyName.builder().name("name").build()

        val roundtrippedPropertyName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyName),
                jacksonTypeRef<PropertyName>(),
            )

        assertThat(roundtrippedPropertyName).isEqualTo(propertyName)
    }
}
