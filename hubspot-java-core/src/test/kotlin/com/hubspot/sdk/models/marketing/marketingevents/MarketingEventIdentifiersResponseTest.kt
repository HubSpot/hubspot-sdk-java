// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventIdentifiersResponseTest {

    @Test
    fun create() {
        val marketingEventIdentifiersResponse =
            MarketingEventIdentifiersResponse.builder()
                .externalEventId("externalEventId")
                .marketingEventName("marketingEventName")
                .objectId("objectId")
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .externalAccountId("externalAccountId")
                .build()

        assertThat(marketingEventIdentifiersResponse.externalEventId()).isEqualTo("externalEventId")
        assertThat(marketingEventIdentifiersResponse.marketingEventName())
            .isEqualTo("marketingEventName")
        assertThat(marketingEventIdentifiersResponse.objectId()).isEqualTo("objectId")
        assertThat(marketingEventIdentifiersResponse.appInfo())
            .contains(AppInfo.builder().id("id").name("name").build())
        assertThat(marketingEventIdentifiersResponse.externalAccountId())
            .contains("externalAccountId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventIdentifiersResponse =
            MarketingEventIdentifiersResponse.builder()
                .externalEventId("externalEventId")
                .marketingEventName("marketingEventName")
                .objectId("objectId")
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .externalAccountId("externalAccountId")
                .build()

        val roundtrippedMarketingEventIdentifiersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventIdentifiersResponse),
                jacksonTypeRef<MarketingEventIdentifiersResponse>(),
            )

        assertThat(roundtrippedMarketingEventIdentifiersResponse)
            .isEqualTo(marketingEventIdentifiersResponse)
    }
}
