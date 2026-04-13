// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.NextPage
import com.hubspot.models.Paging
import com.hubspot.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicChannelAccountTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicChannelAccount =
            CollectionResponseWithTotalPublicChannelAccount.builder()
                .addResult(
                    PublicChannelAccount.builder()
                        .id("id")
                        .active(true)
                        .archived(true)
                        .authorized(true)
                        .channelId("channelId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("inboxId")
                        .name("name")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder()
                                .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                .value("value")
                                .build()
                        )
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

        assertThat(collectionResponseWithTotalPublicChannelAccount.results())
            .containsExactly(
                PublicChannelAccount.builder()
                    .id("id")
                    .active(true)
                    .archived(true)
                    .authorized(true)
                    .channelId("channelId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .inboxId("inboxId")
                    .name("name")
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder()
                            .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                            .value("value")
                            .build()
                    )
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicChannelAccount.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicChannelAccount.paging())
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
        val collectionResponseWithTotalPublicChannelAccount =
            CollectionResponseWithTotalPublicChannelAccount.builder()
                .addResult(
                    PublicChannelAccount.builder()
                        .id("id")
                        .active(true)
                        .archived(true)
                        .authorized(true)
                        .channelId("channelId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .inboxId("inboxId")
                        .name("name")
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder()
                                .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                .value("value")
                                .build()
                        )
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

        val roundtrippedCollectionResponseWithTotalPublicChannelAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalPublicChannelAccount),
                jacksonTypeRef<CollectionResponseWithTotalPublicChannelAccount>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicChannelAccount)
            .isEqualTo(collectionResponseWithTotalPublicChannelAccount)
    }
}
