// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicChannelAccountForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicChannelAccountForwardPaging =
            CollectionResponseWithTotalPublicChannelAccountForwardPaging.builder()
                .addResult(
                    ConversationsPublicChannelAccount.builder()
                        .archived(true)
                        .id("id")
                        .active(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .authorized(true)
                        .channelId("channelId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .inboxId("inboxId")
                        .name("name")
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicChannelAccountForwardPaging.results())
            .containsExactly(
                ConversationsPublicChannelAccount.builder()
                    .archived(true)
                    .id("id")
                    .active(true)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .authorized(true)
                    .channelId("channelId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .inboxId("inboxId")
                    .name("name")
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicChannelAccountForwardPaging.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicChannelAccountForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicChannelAccountForwardPaging =
            CollectionResponseWithTotalPublicChannelAccountForwardPaging.builder()
                .addResult(
                    ConversationsPublicChannelAccount.builder()
                        .archived(true)
                        .id("id")
                        .active(true)
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .authorized(true)
                        .channelId("channelId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .inboxId("inboxId")
                        .name("name")
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicChannelAccountForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicChannelAccountForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicChannelAccountForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicChannelAccountForwardPaging)
            .isEqualTo(collectionResponseWithTotalPublicChannelAccountForwardPaging)
    }
}
