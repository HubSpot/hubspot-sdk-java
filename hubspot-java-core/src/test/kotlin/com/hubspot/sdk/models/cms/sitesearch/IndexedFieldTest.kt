// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexedFieldTest {

    @Test
    fun create() {
        val indexedField =
            IndexedField.builder()
                .metadataField(true)
                .name("name")
                .value(JsonValue.from(mapOf<String, Any>()))
                .addValue(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(indexedField.metadataField()).isEqualTo(true)
        assertThat(indexedField.name()).isEqualTo("name")
        assertThat(indexedField._value()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(indexedField.values()).containsExactly(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexedField =
            IndexedField.builder()
                .metadataField(true)
                .name("name")
                .value(JsonValue.from(mapOf<String, Any>()))
                .addValue(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedIndexedField =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexedField),
                jacksonTypeRef<IndexedField>(),
            )

        assertThat(roundtrippedIndexedField).isEqualTo(indexedField)
    }
}
