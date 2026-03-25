// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicChannelIntegrationChannelTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicChannelIntegrationChannel =
            CollectionResponseWithTotalPublicChannelIntegrationChannel.builder()
                .addResult(
                    PublicChannelIntegrationChannel.builder()
                        .id("id")
                        .capabilities(
                            PublicChannelIntegrationChannel.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                        .channelDescription("channelDescription")
                        .channelLogoUrl("channelLogoUrl")
                        .webhookUrl("webhookUrl")
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

        assertThat(collectionResponseWithTotalPublicChannelIntegrationChannel.results())
            .containsExactly(
                PublicChannelIntegrationChannel.builder()
                    .id("id")
                    .capabilities(
                        PublicChannelIntegrationChannel.Capabilities.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                    .channelDescription("channelDescription")
                    .channelLogoUrl("channelLogoUrl")
                    .webhookUrl("webhookUrl")
                    .build()
            )
        assertThat(collectionResponseWithTotalPublicChannelIntegrationChannel.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicChannelIntegrationChannel.paging())
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
        val collectionResponseWithTotalPublicChannelIntegrationChannel =
            CollectionResponseWithTotalPublicChannelIntegrationChannel.builder()
                .addResult(
                    PublicChannelIntegrationChannel.builder()
                        .id("id")
                        .capabilities(
                            PublicChannelIntegrationChannel.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                        .channelDescription("channelDescription")
                        .channelLogoUrl("channelLogoUrl")
                        .webhookUrl("webhookUrl")
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

        val roundtrippedCollectionResponseWithTotalPublicChannelIntegrationChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicChannelIntegrationChannel
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicChannelIntegrationChannel>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicChannelIntegrationChannel)
            .isEqualTo(collectionResponseWithTotalPublicChannelIntegrationChannel)
    }
}
