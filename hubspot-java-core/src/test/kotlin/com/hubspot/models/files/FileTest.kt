// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileTest {

    @Test
    fun create() {
        val file =
            File.builder()
                .id("id")
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .access(File.Access.HIDDEN_INDEXABLE)
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
                .sourceGroup(File.SourceGroup.CONTENT)
                .type("type")
                .url("url")
                .width(0)
                .build()

        assertThat(file.id()).isEqualTo("id")
        assertThat(file.archived()).isEqualTo(true)
        assertThat(file.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(file.access()).contains(File.Access.HIDDEN_INDEXABLE)
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
        assertThat(file.sourceGroup()).contains(File.SourceGroup.CONTENT)
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
                .archived(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .access(File.Access.HIDDEN_INDEXABLE)
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
                .sourceGroup(File.SourceGroup.CONTENT)
                .type("type")
                .url("url")
                .width(0)
                .build()

        val roundtrippedFile =
            jsonMapper.readValue(jsonMapper.writeValueAsString(file), jacksonTypeRef<File>())

        assertThat(roundtrippedFile).isEqualTo(file)
    }
}
