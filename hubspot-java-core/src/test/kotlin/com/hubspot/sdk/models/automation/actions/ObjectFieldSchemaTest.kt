// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectFieldSchemaTest {

    @Test
    fun create() {
        val objectFieldSchema =
            ObjectFieldSchema.builder()
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(ObjectFieldSchema.Type.OBJECT)
                .build()

        assertThat(objectFieldSchema._properties()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(objectFieldSchema.type()).isEqualTo(ObjectFieldSchema.Type.OBJECT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val objectFieldSchema =
            ObjectFieldSchema.builder()
                .properties(JsonValue.from(mapOf<String, Any>()))
                .type(ObjectFieldSchema.Type.OBJECT)
                .build()

        val roundtrippedObjectFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(objectFieldSchema),
                jacksonTypeRef<ObjectFieldSchema>(),
            )

        assertThat(roundtrippedObjectFieldSchema).isEqualTo(objectFieldSchema)
    }
}
