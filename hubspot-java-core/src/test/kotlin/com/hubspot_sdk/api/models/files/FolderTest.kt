// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderTest {

    @Test
    fun create() {
        val folder =
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

        assertThat(folder.id()).isEqualTo("id")
        assertThat(folder.archived()).isEqualTo(true)
        assertThat(folder.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(folder.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(folder.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(folder.name()).contains("name")
        assertThat(folder.parentFolderId()).contains("parentFolderId")
        assertThat(folder.path()).contains("path")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folder =
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

        val roundtrippedFolder =
            jsonMapper.readValue(jsonMapper.writeValueAsString(folder), jacksonTypeRef<Folder>())

        assertThat(roundtrippedFolder).isEqualTo(folder)
    }
}
