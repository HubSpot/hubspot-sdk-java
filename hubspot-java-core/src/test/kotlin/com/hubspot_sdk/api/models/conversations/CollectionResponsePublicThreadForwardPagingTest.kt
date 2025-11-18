// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicThreadForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicThreadForwardPaging =
            CollectionResponsePublicThreadForwardPaging.builder()
                .addResult(
                    PublicThread.builder()
                        .id("id")
                        .archived(true)
                        .associatedContactId("associatedContactId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("inboxId")
                        .originalChannelAccountId("originalChannelAccountId")
                        .originalChannelId("originalChannelId")
                        .spam(true)
                        .status(PublicThread.Status.OPEN)
                        .assignedTo("assignedTo")
                        .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latestMessageReceivedTimestamp(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .latestMessageSentTimestamp(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .latestMessageTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadAssociations(
                            PublicThreadAssociations.builder()
                                .associatedTicketId("associatedTicketId")
                                .build()
                        )
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicThreadForwardPaging.results())
            .containsExactly(
                PublicThread.builder()
                    .id("id")
                    .archived(true)
                    .associatedContactId("associatedContactId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inboxId("inboxId")
                    .originalChannelAccountId("originalChannelAccountId")
                    .originalChannelId("originalChannelId")
                    .spam(true)
                    .status(PublicThread.Status.OPEN)
                    .assignedTo("assignedTo")
                    .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latestMessageReceivedTimestamp(
                        OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                    )
                    .latestMessageSentTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .latestMessageTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .threadAssociations(
                        PublicThreadAssociations.builder()
                            .associatedTicketId("associatedTicketId")
                            .build()
                    )
                    .build()
            )
        assertThat(collectionResponsePublicThreadForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicThreadForwardPaging =
            CollectionResponsePublicThreadForwardPaging.builder()
                .addResult(
                    PublicThread.builder()
                        .id("id")
                        .archived(true)
                        .associatedContactId("associatedContactId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("inboxId")
                        .originalChannelAccountId("originalChannelAccountId")
                        .originalChannelId("originalChannelId")
                        .spam(true)
                        .status(PublicThread.Status.OPEN)
                        .assignedTo("assignedTo")
                        .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .latestMessageReceivedTimestamp(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .latestMessageSentTimestamp(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        )
                        .latestMessageTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .threadAssociations(
                            PublicThreadAssociations.builder()
                                .associatedTicketId("associatedTicketId")
                                .build()
                        )
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicThreadForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicThreadForwardPaging),
                jacksonTypeRef<CollectionResponsePublicThreadForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicThreadForwardPaging)
            .isEqualTo(collectionResponsePublicThreadForwardPaging)
    }
}
