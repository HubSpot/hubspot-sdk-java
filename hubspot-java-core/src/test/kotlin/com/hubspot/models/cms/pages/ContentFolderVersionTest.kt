// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.VersionUser
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentFolderVersionTest {

    @Test
    fun create() {
        val contentFolderVersion =
            ContentFolderVersion.builder()
                .id("id")
                .object_(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        assertThat(contentFolderVersion.id()).isEqualTo("id")
        assertThat(contentFolderVersion.object_())
            .isEqualTo(
                ContentFolder.builder()
                    .id("id")
                    .category(0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(contentFolderVersion.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentFolderVersion.user())
            .isEqualTo(VersionUser.builder().id("id").email("email").fullName("fullName").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentFolderVersion =
            ContentFolderVersion.builder()
                .id("id")
                .object_(
                    ContentFolder.builder()
                        .id("id")
                        .category(0)
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .parentFolderId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        val roundtrippedContentFolderVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentFolderVersion),
                jacksonTypeRef<ContentFolderVersion>(),
            )

        assertThat(roundtrippedContentFolderVersion).isEqualTo(contentFolderVersion)
    }
}
