// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileStatTest {

    @Test
    fun create() {
        val fileStat =
            FileStat.builder()
                .file(
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
                )
                .folder(
                    Folder.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .path("path")
                        .build()
                )
                .build()

        assertThat(fileStat.file())
            .contains(
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
            )
        assertThat(fileStat.folder())
            .contains(
                Folder.builder()
                    .id("id")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .path("path")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileStat =
            FileStat.builder()
                .file(
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
                )
                .folder(
                    Folder.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .path("path")
                        .build()
                )
                .build()

        val roundtrippedFileStat =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileStat),
                jacksonTypeRef<FileStat>(),
            )

        assertThat(roundtrippedFileStat).isEqualTo(fileStat)
    }
}
