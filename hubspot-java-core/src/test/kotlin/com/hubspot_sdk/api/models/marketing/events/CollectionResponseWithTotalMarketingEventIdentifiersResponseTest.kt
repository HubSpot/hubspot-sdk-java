// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalMarketingEventIdentifiersResponseTest {

    @Test
    fun create() {
        val collectionResponseWithTotalMarketingEventIdentifiersResponse =
            CollectionResponseWithTotalMarketingEventIdentifiersResponse.builder()
                .addResult(
                    MarketingEventIdentifiersResponse.builder()
                        .externalEventId("externalEventId")
                        .marketingEventName("marketingEventName")
                        .objectId("objectId")
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .externalAccountId("externalAccountId")
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

        assertThat(collectionResponseWithTotalMarketingEventIdentifiersResponse.results())
            .containsExactly(
                MarketingEventIdentifiersResponse.builder()
                    .externalEventId("externalEventId")
                    .marketingEventName("marketingEventName")
                    .objectId("objectId")
                    .appInfo(AppInfo.builder().id("id").name("name").build())
                    .externalAccountId("externalAccountId")
                    .build()
            )
        assertThat(collectionResponseWithTotalMarketingEventIdentifiersResponse.total())
            .isEqualTo(0)
        assertThat(collectionResponseWithTotalMarketingEventIdentifiersResponse.paging())
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
        val collectionResponseWithTotalMarketingEventIdentifiersResponse =
            CollectionResponseWithTotalMarketingEventIdentifiersResponse.builder()
                .addResult(
                    MarketingEventIdentifiersResponse.builder()
                        .externalEventId("externalEventId")
                        .marketingEventName("marketingEventName")
                        .objectId("objectId")
                        .appInfo(AppInfo.builder().id("id").name("name").build())
                        .externalAccountId("externalAccountId")
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

        val roundtrippedCollectionResponseWithTotalMarketingEventIdentifiersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalMarketingEventIdentifiersResponse
                ),
                jacksonTypeRef<CollectionResponseWithTotalMarketingEventIdentifiersResponse>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalMarketingEventIdentifiersResponse)
            .isEqualTo(collectionResponseWithTotalMarketingEventIdentifiersResponse)
    }
}
