// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArrayFieldSchemaTest {

    @Test
    fun create() {
        val arrayFieldSchema =
            ArrayFieldSchema.builder()
                .items(JsonValue.from(mapOf<String, Any>()))
                .type(ArrayFieldSchema.Type.ARRAY)
                .build()

        assertThat(arrayFieldSchema._items()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(arrayFieldSchema.type()).isEqualTo(ArrayFieldSchema.Type.ARRAY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arrayFieldSchema =
            ArrayFieldSchema.builder()
                .items(JsonValue.from(mapOf<String, Any>()))
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
