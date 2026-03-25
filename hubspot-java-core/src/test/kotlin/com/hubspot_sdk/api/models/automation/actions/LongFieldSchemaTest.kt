// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LongFieldSchemaTest {

    @Test
    fun create() {
        val longFieldSchema =
            LongFieldSchema.builder()
                .type(LongFieldSchema.Type.LONG)
                .maximum(0L)
                .minimum(0L)
                .build()

        assertThat(longFieldSchema.type()).isEqualTo(LongFieldSchema.Type.LONG)
        assertThat(longFieldSchema.maximum()).contains(0L)
        assertThat(longFieldSchema.minimum()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val longFieldSchema =
            LongFieldSchema.builder()
                .type(LongFieldSchema.Type.LONG)
                .maximum(0L)
                .minimum(0L)
                .build()

        val roundtrippedLongFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(longFieldSchema),
                jacksonTypeRef<LongFieldSchema>(),
            )

        assertThat(roundtrippedLongFieldSchema).isEqualTo(longFieldSchema)
    }
}
