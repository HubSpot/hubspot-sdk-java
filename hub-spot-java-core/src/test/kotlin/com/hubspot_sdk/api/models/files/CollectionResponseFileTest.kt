// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.Paging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseFileTest {

    @Test
    fun create() {
        val collectionResponseFile =
            CollectionResponseFile.builder()
                .addResult(
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseFile.results())
            .containsExactly(
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
        assertThat(collectionResponseFile.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseFile =
            CollectionResponseFile.builder()
                .addResult(
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseFile),
                jacksonTypeRef<CollectionResponseFile>(),
            )

        assertThat(roundtrippedCollectionResponseFile).isEqualTo(collectionResponseFile)
    }
}
