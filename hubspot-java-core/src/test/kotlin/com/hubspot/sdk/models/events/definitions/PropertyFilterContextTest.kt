// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PropertyFilterContextTest {

    @Test
    fun create() {
        val propertyFilterContext =
            PropertyFilterContext.builder().objectTypeId("objectTypeId").build()

        assertThat(propertyFilterContext.objectTypeId()).isEqualTo("objectTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val propertyFilterContext =
            PropertyFilterContext.builder().objectTypeId("objectTypeId").build()

        val roundtrippedPropertyFilterContext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(propertyFilterContext),
                jacksonTypeRef<PropertyFilterContext>(),
            )

        assertThat(roundtrippedPropertyFilterContext).isEqualTo(propertyFilterContext)
    }
}
