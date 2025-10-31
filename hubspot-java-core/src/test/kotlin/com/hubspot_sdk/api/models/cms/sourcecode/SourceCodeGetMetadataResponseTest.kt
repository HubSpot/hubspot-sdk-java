// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeGetMetadataResponseTest {

    @Test
    fun create() {
        val sourceCodeGetMetadataResponse =
            SourceCodeGetMetadataResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        assertThat(sourceCodeGetMetadataResponse.id()).isEqualTo("id")
        assertThat(sourceCodeGetMetadataResponse.createdAt()).isEqualTo(0L)
        assertThat(sourceCodeGetMetadataResponse.folder()).isEqualTo(true)
        assertThat(sourceCodeGetMetadataResponse.name()).isEqualTo("name")
        assertThat(sourceCodeGetMetadataResponse.updatedAt()).isEqualTo(0L)
        assertThat(sourceCodeGetMetadataResponse.archivedAt()).contains(0L)
        assertThat(sourceCodeGetMetadataResponse.children().getOrNull()).containsExactly("string")
        assertThat(sourceCodeGetMetadataResponse.hash()).contains("hash")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceCodeGetMetadataResponse =
            SourceCodeGetMetadataResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        val roundtrippedSourceCodeGetMetadataResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceCodeGetMetadataResponse),
                jacksonTypeRef<SourceCodeGetMetadataResponse>(),
            )

        assertThat(roundtrippedSourceCodeGetMetadataResponse)
            .isEqualTo(sourceCodeGetMetadataResponse)
    }
}
