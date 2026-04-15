// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArrayFieldSchemaTest {

    @Test
    fun create() {
        val arrayFieldSchema =
            ArrayFieldSchema.builder()
                .items(
                    IntegerFieldSchema.builder()
                        .type(IntegerFieldSchema.Type.INTEGER)
                        .maximum(0)
                        .minimum(0)
                        .build()
                )
                .type(ArrayFieldSchema.Type.ARRAY)
                .build()

        assertThat(arrayFieldSchema.items())
            .isEqualTo(
                ArrayFieldSchema.Items.ofIntegerFieldSchema(
                    IntegerFieldSchema.builder()
                        .type(IntegerFieldSchema.Type.INTEGER)
                        .maximum(0)
                        .minimum(0)
                        .build()
                )
            )
        assertThat(arrayFieldSchema.type()).isEqualTo(ArrayFieldSchema.Type.ARRAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arrayFieldSchema =
            ArrayFieldSchema.builder()
                .items(
                    IntegerFieldSchema.builder()
                        .type(IntegerFieldSchema.Type.INTEGER)
                        .maximum(0)
                        .minimum(0)
                        .build()
                )
                .type(ArrayFieldSchema.Type.ARRAY)
                .build()

        val roundtrippedArrayFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(arrayFieldSchema),
                jacksonTypeRef<ArrayFieldSchema>(),
            )

        assertThat(roundtrippedArrayFieldSchema).isEqualTo(arrayFieldSchema)
    }
}
