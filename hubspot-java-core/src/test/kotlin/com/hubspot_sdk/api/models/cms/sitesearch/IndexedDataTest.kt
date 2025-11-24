// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IndexedDataTest {

    @Test
    fun create() {
        val indexedData =
            IndexedData.builder()
                .id("id")
                .fields(
                    IndexedData.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "metadataField" to true,
                                    "name" to "name",
                                    "value" to mapOf<String, Any>(),
                                    "values" to listOf(mapOf<String, Any>()),
                                )
                            ),
                        )
                        .build()
                )
                .type(IndexedData.Type.BLOG_POST)
                .build()

        assertThat(indexedData.id()).isEqualTo("id")
        assertThat(indexedData.fields())
            .isEqualTo(
                IndexedData.Fields.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(
                            mapOf(
                                "metadataField" to true,
                                "name" to "name",
                                "value" to mapOf<String, Any>(),
                                "values" to listOf(mapOf<String, Any>()),
                            )
                        ),
                    )
                    .build()
            )
        assertThat(indexedData.type()).isEqualTo(IndexedData.Type.BLOG_POST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val indexedData =
            IndexedData.builder()
                .id("id")
                .fields(
                    IndexedData.Fields.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(
                                mapOf(
                                    "metadataField" to true,
                                    "name" to "name",
                                    "value" to mapOf<String, Any>(),
                                    "values" to listOf(mapOf<String, Any>()),
                                )
                            ),
                        )
                        .build()
                )
                .type(IndexedData.Type.BLOG_POST)
                .build()

        val roundtrippedIndexedData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(indexedData),
                jacksonTypeRef<IndexedData>(),
            )

        assertThat(roundtrippedIndexedData).isEqualTo(indexedData)
    }
}
