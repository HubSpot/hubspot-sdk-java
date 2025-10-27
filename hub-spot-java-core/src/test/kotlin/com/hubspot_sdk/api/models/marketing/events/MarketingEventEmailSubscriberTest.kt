// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

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
                .email("email")
                .interactionDateTime(0L)
                .contactProperties(
                    MarketingEventEmailSubscriber.ContactProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .properties(
                    MarketingEventEmailSubscriber.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(marketingEventEmailSubscriber.email()).isEqualTo("email")
        assertThat(marketingEventEmailSubscriber.interactionDateTime()).isEqualTo(0L)
        assertThat(marketingEventEmailSubscriber.contactProperties())
            .contains(
                MarketingEventEmailSubscriber.ContactProperties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(marketingEventEmailSubscriber.properties())
            .contains(
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
                .email("email")
                .interactionDateTime(0L)
                .contactProperties(
                    MarketingEventEmailSubscriber.ContactProperties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
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
