// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SourceCodeUpsertResponseTest {

    @Test
    fun create() {
        val sourceCodeUpsertResponse =
            SourceCodeUpsertResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        assertThat(sourceCodeUpsertResponse.id()).isEqualTo("id")
        assertThat(sourceCodeUpsertResponse.createdAt()).isEqualTo(0L)
        assertThat(sourceCodeUpsertResponse.folder()).isEqualTo(true)
        assertThat(sourceCodeUpsertResponse.name()).isEqualTo("name")
        assertThat(sourceCodeUpsertResponse.updatedAt()).isEqualTo(0L)
        assertThat(sourceCodeUpsertResponse.archivedAt()).contains(0L)
        assertThat(sourceCodeUpsertResponse.children().getOrNull()).containsExactly("string")
        assertThat(sourceCodeUpsertResponse.hash()).contains("hash")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sourceCodeUpsertResponse =
            SourceCodeUpsertResponse.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        val roundtrippedSourceCodeUpsertResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sourceCodeUpsertResponse),
                jacksonTypeRef<SourceCodeUpsertResponse>(),
            )

        assertThat(roundtrippedSourceCodeUpsertResponse).isEqualTo(sourceCodeUpsertResponse)
    }
}
