// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicListFolderTest {

    @Test
    fun create() {
        val publicListFolder =
            PublicListFolder.builder()
                .id("id")
                .addChildList(0)
                .childNodes(listOf())
                .parentFolderId("parentFolderId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedContentsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId(0)
                .build()

        assertThat(publicListFolder.id()).isEqualTo("id")
        assertThat(publicListFolder.childLists()).containsExactly(0)
        assertThat(publicListFolder.childNodes()).containsExactly()
        assertThat(publicListFolder.parentFolderId()).isEqualTo("parentFolderId")
        assertThat(publicListFolder.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicListFolder.name()).contains("name")
        assertThat(publicListFolder.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicListFolder.updatedContentsAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicListFolder.userId()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicListFolder =
            PublicListFolder.builder()
                .id("id")
                .addChildList(0)
                .childNodes(listOf())
                .parentFolderId("parentFolderId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedContentsAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .userId(0)
                .build()

        val roundtrippedPublicListFolder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicListFolder),
                jacksonTypeRef<PublicListFolder>(),
            )

        assertThat(roundtrippedPublicListFolder).isEqualTo(publicListFolder)
    }
}
