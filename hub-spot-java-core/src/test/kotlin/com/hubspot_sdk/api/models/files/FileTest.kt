// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .id("id")
                .access(File.Access.PUBLIC_INDEXABLE)
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultHostingUrl("defaultHostingUrl")
                .encoding("encoding")
                .expiresAt(0L)
                .extension("extension")
                .fileMd5("fileMd5")
                .height(0)
                .isUsableInContent(true)
                .name("name")
                .parentFolderId("parentFolderId")
                .path("path")
                .size(0L)
                .sourceGroup("sourceGroup")
                .type("type")
                .url("url")
                .width(0)
                .build()

        assertThat(file.id()).isEqualTo("id")
        assertThat(file.access()).isEqualTo(File.Access.PUBLIC_INDEXABLE)
        assertThat(file.archived()).isEqualTo(true)
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.defaultHostingUrl()).contains("defaultHostingUrl")
        assertThat(file.encoding()).contains("encoding")
        assertThat(file.expiresAt()).contains(0L)
        assertThat(file.extension()).contains("extension")
        assertThat(file.fileMd5()).contains("fileMd5")
        assertThat(file.height()).contains(0)
        assertThat(file.isUsableInContent()).contains(true)
        assertThat(file.name()).contains("name")
        assertThat(file.parentFolderId()).contains("parentFolderId")
        assertThat(file.path()).contains("path")
        assertThat(file.size()).contains(0L)
        assertThat(file.sourceGroup()).contains("sourceGroup")
        assertThat(file.type()).contains("type")
        assertThat(file.url()).contains("url")
        assertThat(file.width()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val file =
            File.builder()
                .id("id")
                .access(File.Access.PUBLIC_INDEXABLE)
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .defaultHostingUrl("defaultHostingUrl")
                .encoding("encoding")
                .expiresAt(0L)
                .extension("extension")
                .fileMd5("fileMd5")
                .height(0)
                .isUsableInContent(true)
                .name("name")
                .parentFolderId("parentFolderId")
                .path("path")
                .size(0L)
                .sourceGroup("sourceGroup")
                .type("type")
                .url("url")
                .width(0)
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
