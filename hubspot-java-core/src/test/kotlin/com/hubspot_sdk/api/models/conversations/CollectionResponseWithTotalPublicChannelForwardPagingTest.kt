// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalPublicChannelForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalPublicChannelForwardPaging =
            CollectionResponseWithTotalPublicChannelForwardPaging.builder()
                .addResult(PublicChannel.builder().id("id").name("name").build())
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalPublicChannelForwardPaging.results())
            .containsExactly(PublicChannel.builder().id("id").name("name").build())
        assertThat(collectionResponseWithTotalPublicChannelForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalPublicChannelForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalPublicChannelForwardPaging =
            CollectionResponseWithTotalPublicChannelForwardPaging.builder()
                .addResult(PublicChannel.builder().id("id").name("name").build())
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalPublicChannelForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalPublicChannelForwardPaging
                ),
                jacksonTypeRef<CollectionResponseWithTotalPublicChannelForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalPublicChannelForwardPaging)
            .isEqualTo(collectionResponseWithTotalPublicChannelForwardPaging)
    }
}
