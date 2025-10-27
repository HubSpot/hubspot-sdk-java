// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.VersionUser
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionContentFolderTest {

    @Test
    fun create() {
        val versionContentFolder =
            VersionContentFolder.builder()
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

        assertThat(versionContentFolder.id()).isEqualTo("id")
        assertThat(versionContentFolder.object_())
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
        assertThat(versionContentFolder.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(versionContentFolder.user())
            .isEqualTo(VersionUser.builder().id("id").email("email").fullName("fullName").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionContentFolder =
            VersionContentFolder.builder()
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

        val roundtrippedVersionContentFolder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionContentFolder),
                jacksonTypeRef<VersionContentFolder>(),
            )

        assertThat(roundtrippedVersionContentFolder).isEqualTo(versionContentFolder)
    }
}
