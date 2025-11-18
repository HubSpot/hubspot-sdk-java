// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalExternalLinkMetadataForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalExternalLinkMetadataForwardPaging =
            CollectionResponseWithTotalExternalLinkMetadataForwardPaging.builder()
                .addResult(
                    ExternalLinkMetadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultLink(true)
                        .link("link")
                        .organizerUserId("organizerUserId")
                        .slug("slug")
                        .type("type")
                        .addUserIdsOfLinkMember("string")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalExternalLinkMetadataForwardPaging.results())
            .containsExactly(
                ExternalLinkMetadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultLink(true)
                    .link("link")
                    .organizerUserId("organizerUserId")
                    .slug("slug")
                    .type("type")
                    .addUserIdsOfLinkMember("string")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseWithTotalExternalLinkMetadataForwardPaging.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalExternalLinkMetadataForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalExternalLinkMetadataForwardPaging =
            CollectionResponseWithTotalExternalLinkMetadataForwardPaging.builder()
                .addResult(
                    ExternalLinkMetadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultLink(true)
                        .link("link")
                        .organizerUserId("organizerUserId")
                        .slug("slug")
                        .type("type")
                        .addUserIdsOfLinkMember("string")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalExternalLinkMetadataForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalExternalLinkMetadataForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalExternalLinkMetadataForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalExternalLinkMetadataForwardPaging)
            .isEqualTo(collectionResponseWithTotalExternalLinkMetadataForwardPaging)
    }
}
