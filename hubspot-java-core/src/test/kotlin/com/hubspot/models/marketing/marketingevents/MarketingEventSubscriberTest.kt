// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventSubscriberTest {

    @Test
    fun create() {
        val marketingEventSubscriber =
            MarketingEventSubscriber.builder()
                .interactionDateTime(0L)
                .properties(
                    MarketingEventSubscriber.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .vid(0)
                .build()

        assertThat(marketingEventSubscriber.interactionDateTime()).isEqualTo(0L)
        assertThat(marketingEventSubscriber.properties())
            .isEqualTo(
                MarketingEventSubscriber.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(marketingEventSubscriber.vid()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventSubscriber =
            MarketingEventSubscriber.builder()
                .interactionDateTime(0L)
                .properties(
                    MarketingEventSubscriber.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .vid(0)
                .build()

        val roundtrippedMarketingEventSubscriber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventSubscriber),
                jacksonTypeRef<MarketingEventSubscriber>(),
            )

        assertThat(roundtrippedMarketingEventSubscriber).isEqualTo(marketingEventSubscriber)
    }
}
