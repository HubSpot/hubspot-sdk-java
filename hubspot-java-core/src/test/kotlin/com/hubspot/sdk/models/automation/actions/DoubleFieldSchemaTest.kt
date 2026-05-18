// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DoubleFieldSchemaTest {

    @Test
    fun create() {
        val doubleFieldSchema =
            DoubleFieldSchema.builder()
                .type(DoubleFieldSchema.Type.ARRAY)
                .maximum(0.0)
                .minimum(0.0)
                .build()

        assertThat(doubleFieldSchema.type()).isEqualTo(DoubleFieldSchema.Type.ARRAY)
        assertThat(doubleFieldSchema.maximum()).contains(0.0)
        assertThat(doubleFieldSchema.minimum()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val doubleFieldSchema =
            DoubleFieldSchema.builder()
                .type(DoubleFieldSchema.Type.ARRAY)
                .maximum(0.0)
                .minimum(0.0)
                .build()

        val roundtrippedDoubleFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(doubleFieldSchema),
                jacksonTypeRef<DoubleFieldSchema>(),
            )

        assertThat(roundtrippedDoubleFieldSchema).isEqualTo(doubleFieldSchema)
    }
}
