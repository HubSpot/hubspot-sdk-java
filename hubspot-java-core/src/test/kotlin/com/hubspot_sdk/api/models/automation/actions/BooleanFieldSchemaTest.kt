// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BooleanFieldSchemaTest {

    @Test
    fun create() {
        val booleanFieldSchema =
            BooleanFieldSchema.builder().type(BooleanFieldSchema.Type.BOOLEAN).build()

        assertThat(booleanFieldSchema.type()).isEqualTo(BooleanFieldSchema.Type.BOOLEAN)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val booleanFieldSchema =
            BooleanFieldSchema.builder().type(BooleanFieldSchema.Type.BOOLEAN).build()

        val roundtrippedBooleanFieldSchema =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(booleanFieldSchema),
                jacksonTypeRef<BooleanFieldSchema>(),
            )

        assertThat(roundtrippedBooleanFieldSchema).isEqualTo(booleanFieldSchema)
    }
}
