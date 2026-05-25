// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegerFieldSchemaTest {

    @Test
    fun create() {
        val integerFieldSchema =
            IntegerFieldSchema.builder()
                .type(IntegerFieldSchema.Type.INTEGER)
                .maximum(0)
                .minimum(0)
                .build()

        assertThat(integerFieldSchema.type()).isEqualTo(IntegerFieldSchema.Type.INTEGER)
        assertThat(integerFieldSchema.maximum()).contains(0)
        assertThat(integerFieldSchema.minimum()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val integerFieldSchema =
            IntegerFieldSchema.builder()
                .type(IntegerFieldSchema.Type.INTEGER)
                .maximum(0)
                .minimum(0)
                .build()

        val roundtrippedIntegerFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(integerFieldSchema),
                jacksonTypeRef<IntegerFieldSchema>(),
            )

        assertThat(roundtrippedIntegerFieldSchema).isEqualTo(integerFieldSchema)
    }
}
