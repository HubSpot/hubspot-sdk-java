// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sourcecode

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssetFileMetadataTest {

    @Test
    fun create() {
        val assetFileMetadata =
            AssetFileMetadata.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        assertThat(assetFileMetadata.id()).isEqualTo("id")
        assertThat(assetFileMetadata.createdAt()).isEqualTo(0L)
        assertThat(assetFileMetadata.folder()).isEqualTo(true)
        assertThat(assetFileMetadata.name()).isEqualTo("name")
        assertThat(assetFileMetadata.updatedAt()).isEqualTo(0L)
        assertThat(assetFileMetadata.archivedAt()).contains(0L)
        assertThat(assetFileMetadata.children().getOrNull()).containsExactly("string")
        assertThat(assetFileMetadata.hash()).contains("hash")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assetFileMetadata =
            AssetFileMetadata.builder()
                .id("id")
                .createdAt(0L)
                .folder(true)
                .name("name")
                .updatedAt(0L)
                .archivedAt(0L)
                .addChild("string")
                .hash("hash")
                .build()

        val roundtrippedAssetFileMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assetFileMetadata),
                jacksonTypeRef<AssetFileMetadata>(),
            )

        assertThat(roundtrippedAssetFileMetadata).isEqualTo(assetFileMetadata)
    }
}
