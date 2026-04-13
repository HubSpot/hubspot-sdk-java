// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGroupTest {

    @Test
    fun create() {
        val propertyGroup =
            PropertyGroup.builder()
                .archived(true)
                .label("label")
                .name("name")
                .displayOrder(0)
                .build()

        assertThat(propertyGroup.archived()).isEqualTo(true)
        assertThat(propertyGroup.label()).isEqualTo("label")
        assertThat(propertyGroup.name()).isEqualTo("name")
        assertThat(propertyGroup.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyGroup =
            PropertyGroup.builder()
                .archived(true)
                .label("label")
                .name("name")
                .displayOrder(0)
                .build()

        val roundtrippedPropertyGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyGroup),
                jacksonTypeRef<PropertyGroup>(),
            )

        assertThat(roundtrippedPropertyGroup).isEqualTo(propertyGroup)
    }
}
