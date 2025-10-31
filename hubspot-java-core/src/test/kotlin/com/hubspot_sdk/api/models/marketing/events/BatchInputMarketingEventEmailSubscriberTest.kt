// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventEmailSubscriberTest {

    @Test
    fun create() {
        val batchInputMarketingEventEmailSubscriber =
            BatchInputMarketingEventEmailSubscriber.builder()
                .addInput(
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
                )
                .build()

        assertThat(batchInputMarketingEventEmailSubscriber.inputs())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventEmailSubscriber =
            BatchInputMarketingEventEmailSubscriber.builder()
                .addInput(
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
                )
                .build()

        val roundtrippedBatchInputMarketingEventEmailSubscriber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventEmailSubscriber),
                jacksonTypeRef<BatchInputMarketingEventEmailSubscriber>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventEmailSubscriber)
            .isEqualTo(batchInputMarketingEventEmailSubscriber)
    }
}
