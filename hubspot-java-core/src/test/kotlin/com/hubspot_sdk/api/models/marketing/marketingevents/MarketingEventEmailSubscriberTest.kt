// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventEmailSubscriberTest {

    @Test
    fun create() {
        val marketingEventEmailSubscriber =
            MarketingEventEmailSubscriber.builder()
                .contactProperties(
                    MarketingEventEmailSubscriber.ContactProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .email("email")
                .interactionDateTime(0L)
                .properties(
                    MarketingEventEmailSubscriber.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(marketingEventEmailSubscriber.contactProperties())
            .isEqualTo(
                MarketingEventEmailSubscriber.ContactProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(marketingEventEmailSubscriber.email()).isEqualTo("email")
        assertThat(marketingEventEmailSubscriber.interactionDateTime()).isEqualTo(0L)
        assertThat(marketingEventEmailSubscriber.properties())
            .isEqualTo(
                MarketingEventEmailSubscriber.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventEmailSubscriber =
            MarketingEventEmailSubscriber.builder()
                .contactProperties(
                    MarketingEventEmailSubscriber.ContactProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .email("email")
                .interactionDateTime(0L)
                .properties(
                    MarketingEventEmailSubscriber.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedMarketingEventEmailSubscriber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventEmailSubscriber),
                jacksonTypeRef<MarketingEventEmailSubscriber>(),
            )

        assertThat(roundtrippedMarketingEventEmailSubscriber)
            .isEqualTo(marketingEventEmailSubscriber)
    }
}
