// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyGroupUpdateTest {

    @Test
    fun create() {
        val propertyGroupUpdate =
            PropertyGroupUpdate.builder().displayOrder(0).label("label").build()

        assertThat(propertyGroupUpdate.displayOrder()).contains(0)
        assertThat(propertyGroupUpdate.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyGroupUpdate =
            PropertyGroupUpdate.builder().displayOrder(0).label("label").build()

        val roundtrippedPropertyGroupUpdate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyGroupUpdate),
                jacksonTypeRef<PropertyGroupUpdate>(),
            )

        assertThat(roundtrippedPropertyGroupUpdate).isEqualTo(propertyGroupUpdate)
    }
}
