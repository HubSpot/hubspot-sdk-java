// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventSubscriberTest {

    @Test
    fun create() {
        val batchInputMarketingEventSubscriber =
            BatchInputMarketingEventSubscriber.builder()
                .addInput(
                    MarketingEventSubscriber.builder()
                        .interactionDateTime(0L)
                        .properties(
                            MarketingEventSubscriber.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .vid(0)
                        .build()
                )
                .build()

        assertThat(batchInputMarketingEventSubscriber.inputs())
            .containsExactly(
                MarketingEventSubscriber.builder()
                    .interactionDateTime(0L)
                    .properties(
                        MarketingEventSubscriber.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .vid(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventSubscriber =
            BatchInputMarketingEventSubscriber.builder()
                .addInput(
                    MarketingEventSubscriber.builder()
                        .interactionDateTime(0L)
                        .properties(
                            MarketingEventSubscriber.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .vid(0)
                        .build()
                )
                .build()

        val roundtrippedBatchInputMarketingEventSubscriber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventSubscriber),
                jacksonTypeRef<BatchInputMarketingEventSubscriber>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventSubscriber)
            .isEqualTo(batchInputMarketingEventSubscriber)
    }
}
