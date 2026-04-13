// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventEmailSubscriberTest {

    @Test
    fun create() {
        val batchInputMarketingEventEmailSubscriber =
            BatchInputMarketingEventEmailSubscriber.builder()
                .addInput(
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
                )
                .build()

        assertThat(batchInputMarketingEventEmailSubscriber.inputs())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventEmailSubscriber =
            BatchInputMarketingEventEmailSubscriber.builder()
                .addInput(
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
