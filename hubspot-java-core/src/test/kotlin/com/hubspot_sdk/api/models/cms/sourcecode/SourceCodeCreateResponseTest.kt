// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeCreateResponseTest {

    @Test
    fun create() {
        val sourceCodeCreateResponse =
            SourceCodeCreateResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        assertThat(sourceCodeCreateResponse.id()).isEqualTo("id")
        assertThat(sourceCodeCreateResponse.createdAt()).isEqualTo(0L)
        assertThat(sourceCodeCreateResponse.folder()).isEqualTo(true)
        assertThat(sourceCodeCreateResponse.name()).isEqualTo("name")
        assertThat(sourceCodeCreateResponse.updatedAt()).isEqualTo(0L)
        assertThat(sourceCodeCreateResponse.archivedAt()).contains(0L)
        assertThat(sourceCodeCreateResponse.children().getOrNull()).containsExactly("string")
        assertThat(sourceCodeCreateResponse.hash()).contains("hash")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceCodeCreateResponse =
            SourceCodeCreateResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        val roundtrippedSourceCodeCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceCodeCreateResponse),
                jacksonTypeRef<SourceCodeCreateResponse>(),
            )

        assertThat(roundtrippedSourceCodeCreateResponse).isEqualTo(sourceCodeCreateResponse)
    }
}
