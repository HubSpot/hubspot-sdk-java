// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGroupCreateTest {

    @Test
    fun create() {
        val propertyGroupCreate =
            PropertyGroupCreate.builder().label("label").name("name").displayOrder(0).build()

        assertThat(propertyGroupCreate.label()).isEqualTo("label")
        assertThat(propertyGroupCreate.name()).isEqualTo("name")
        assertThat(propertyGroupCreate.displayOrder()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyGroupCreate =
            PropertyGroupCreate.builder().label("label").name("name").displayOrder(0).build()

        val roundtrippedPropertyGroupCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyGroupCreate),
                jacksonTypeRef<PropertyGroupCreate>(),
            )

        assertThat(roundtrippedPropertyGroupCreate).isEqualTo(propertyGroupCreate)
    }
}
