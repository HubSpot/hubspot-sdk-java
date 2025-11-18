// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
            CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(
                collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.results()
            )
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
        assertThat(collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
            CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging.builder()
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
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
                ),
                jacksonTypeRef<
                    CollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
                >(),
            )

        assertThat(
                roundtrippedCollectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging
            )
            .isEqualTo(collectionResponseWithTotalPublicChannelIntegrationChannelForwardPaging)
    }
}
