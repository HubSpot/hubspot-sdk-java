// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListFolderFetchResponseTest {

    @Test
    fun create() {
        val listFolderFetchResponse =
            ListFolderFetchResponse.builder()
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

        assertThat(listFolderFetchResponse.folder())
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
        val listFolderFetchResponse =
            ListFolderFetchResponse.builder()
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

        val roundtrippedListFolderFetchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listFolderFetchResponse),
                jacksonTypeRef<ListFolderFetchResponse>(),
            )

        assertThat(roundtrippedListFolderFetchResponse).isEqualTo(listFolderFetchResponse)
    }
}
