// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentFolderTest {

    @Test
    fun create() {
        val contentFolder =
            ContentFolder.builder()
                .id("id")
                .category(0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .parentFolderId(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(contentFolder.id()).isEqualTo("id")
        assertThat(contentFolder.category()).isEqualTo(0)
        assertThat(contentFolder.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentFolder.deletedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentFolder.name()).isEqualTo("name")
        assertThat(contentFolder.parentFolderId()).isEqualTo(0L)
        assertThat(contentFolder.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentFolder =
            ContentFolder.builder()
                .id("id")
                .category(0)
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .parentFolderId(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedContentFolder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentFolder),
                jacksonTypeRef<ContentFolder>(),
            )

        assertThat(roundtrippedContentFolder).isEqualTo(contentFolder)
    }
}
