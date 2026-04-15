// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalExternalLinkMetadataTest {

    @Test
    fun create() {
        val collectionResponseWithTotalExternalLinkMetadata =
            CollectionResponseWithTotalExternalLinkMetadata.builder()
                .addResult(
                    ExternalLinkMetadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultLink(true)
                        .link("link")
                        .organizerUserId("organizerUserId")
                        .slug("slug")
                        .type(ExternalLinkMetadata.Type.GROUP_CALENDAR)
                        .addUserIdsOfLinkMember("string")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalExternalLinkMetadata.results())
            .containsExactly(
                ExternalLinkMetadata.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .defaultLink(true)
                    .link("link")
                    .organizerUserId("organizerUserId")
                    .slug("slug")
                    .type(ExternalLinkMetadata.Type.GROUP_CALENDAR)
                    .addUserIdsOfLinkMember("string")
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseWithTotalExternalLinkMetadata.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalExternalLinkMetadata.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalExternalLinkMetadata =
            CollectionResponseWithTotalExternalLinkMetadata.builder()
                .addResult(
                    ExternalLinkMetadata.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .defaultLink(true)
                        .link("link")
                        .organizerUserId("organizerUserId")
                        .slug("slug")
                        .type(ExternalLinkMetadata.Type.GROUP_CALENDAR)
                        .addUserIdsOfLinkMember("string")
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalExternalLinkMetadata =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalExternalLinkMetadata),
                jacksonTypeRef<CollectionResponseWithTotalExternalLinkMetadata>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalExternalLinkMetadata)
            .isEqualTo(collectionResponseWithTotalExternalLinkMetadata)
    }
}
