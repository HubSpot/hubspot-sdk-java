// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StringFieldSchemaTest {

    @Test
    fun create() {
        val stringFieldSchema =
            StringFieldSchema.builder()
                .type(StringFieldSchema.Type.STRING)
                .format(StringFieldSchema.Format.DATE)
                .build()

        assertThat(stringFieldSchema.type()).isEqualTo(StringFieldSchema.Type.STRING)
        assertThat(stringFieldSchema.format()).contains(StringFieldSchema.Format.DATE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stringFieldSchema =
            StringFieldSchema.builder()
                .type(StringFieldSchema.Type.STRING)
                .format(StringFieldSchema.Format.DATE)
                .build()

        val roundtrippedStringFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stringFieldSchema),
                jacksonTypeRef<StringFieldSchema>(),
            )

        assertThat(roundtrippedStringFieldSchema).isEqualTo(stringFieldSchema)
    }
}
