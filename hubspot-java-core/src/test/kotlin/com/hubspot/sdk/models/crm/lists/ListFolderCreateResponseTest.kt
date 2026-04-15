// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListFolderCreateResponseTest {

    @Test
    fun create() {
        val listFolderCreateResponse =
            ListFolderCreateResponse.builder()
                .folder(
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
                )
                .build()

        assertThat(listFolderCreateResponse.folder())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listFolderCreateResponse =
            ListFolderCreateResponse.builder()
                .folder(
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
                )
                .build()

        val roundtrippedListFolderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listFolderCreateResponse),
                jacksonTypeRef<ListFolderCreateResponse>(),
            )

        assertThat(roundtrippedListFolderCreateResponse).isEqualTo(listFolderCreateResponse)
    }
}
