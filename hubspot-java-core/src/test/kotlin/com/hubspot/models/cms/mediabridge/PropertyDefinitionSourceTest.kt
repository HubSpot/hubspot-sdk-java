// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyDefinitionSourceTest {

    @Test
    fun create() {
        val propertyDefinitionSource =
            PropertyDefinitionSource.builder()
                .type(PropertyDefinitionSource.Type.GLOBAL)
                .name("name")
                .build()

        assertThat(propertyDefinitionSource.type()).isEqualTo(PropertyDefinitionSource.Type.GLOBAL)
        assertThat(propertyDefinitionSource.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyDefinitionSource =
            PropertyDefinitionSource.builder()
                .type(PropertyDefinitionSource.Type.GLOBAL)
                .name("name")
                .build()

        val roundtrippedPropertyDefinitionSource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyDefinitionSource),
                jacksonTypeRef<PropertyDefinitionSource>(),
            )

        assertThat(roundtrippedPropertyDefinitionSource).isEqualTo(propertyDefinitionSource)
    }
}
