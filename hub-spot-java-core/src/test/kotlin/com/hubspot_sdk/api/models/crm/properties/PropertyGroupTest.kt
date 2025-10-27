// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGroupTest {

    @Test
    fun create() {
        val propertyGroup =
            PropertyGroup.builder()
                .archived(true)
                .displayOrder(-1)
                .label("My Property Group")
                .name("mypropertygroup")
                .build()

        assertThat(propertyGroup.archived()).isEqualTo(true)
        assertThat(propertyGroup.displayOrder()).isEqualTo(-1)
        assertThat(propertyGroup.label()).isEqualTo("My Property Group")
        assertThat(propertyGroup.name()).isEqualTo("mypropertygroup")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyGroup =
            PropertyGroup.builder()
                .archived(true)
                .displayOrder(-1)
                .label("My Property Group")
                .name("mypropertygroup")
                .build()

        val roundtrippedPropertyGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyGroup),
                jacksonTypeRef<PropertyGroup>(),
            )

        assertThat(roundtrippedPropertyGroup).isEqualTo(propertyGroup)
    }
}
