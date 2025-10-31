// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicInboxForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicInboxForwardPaging =
            CollectionResponseWithTotalPublicInboxForwardPaging.builder()
                .addResult(
                    PublicInbox.builder()
                        .archived(true)
                        .type("HELP_DESK")
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicInboxForwardPaging.results())
            .containsExactly(
                PublicInbox.builder()
                    .archived(true)
                    .type("HELP_DESK")
                    .id("id")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicInboxForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicInboxForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicInboxForwardPaging =
            CollectionResponseWithTotalPublicInboxForwardPaging.builder()
                .addResult(
                    PublicInbox.builder()
                        .archived(true)
                        .type("HELP_DESK")
                        .id("id")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicInboxForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalPublicInboxForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalPublicInboxForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicInboxForwardPaging)
            .isEqualTo(collectionResponseWithTotalPublicInboxForwardPaging)
    }
}
