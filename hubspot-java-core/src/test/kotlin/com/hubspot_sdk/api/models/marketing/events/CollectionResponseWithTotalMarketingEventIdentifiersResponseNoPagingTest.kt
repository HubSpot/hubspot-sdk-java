// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
            CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging.builder()
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
                .build()

        assertThat(collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging.results())
            .containsExactly(
                MarketingEventIdentifiersResponse.builder()
                    .externalEventId("externalEventId")
                    .marketingEventName("marketingEventName")
                    .objectId("objectId")
                    .appInfo(AppInfo.builder().id("id").name("name").build())
                    .externalAccountId("externalAccountId")
                    .build()
            )
        assertThat(collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging.total())
            .isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
            CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging.builder()
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
                .build()

        val roundtrippedCollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging
                ),
                jacksonTypeRef<
                    CollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging
                >(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging)
            .isEqualTo(collectionResponseWithTotalMarketingEventIdentifiersResponseNoPaging)
    }
}
