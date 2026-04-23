// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.subscriberstate

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventSubscriber
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventSubscriber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberStateRecordByIdParamsTest {

    @Test
    fun create() {
        SubscriberStateRecordByIdParams.builder()
            .externalEventId("externalEventId")
            .subscriberState("subscriberState")
            .externalAccountId("externalAccountId")
            .batchInputMarketingEventSubscriber(
                BatchInputMarketingEventSubscriber.builder()
                    .addInput(
                        MarketingEventSubscriber.builder()
                            .interactionDateTime(0L)
                            .properties(
                                MarketingEventSubscriber.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .vid(0L)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriberStateRecordByIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder()
                                .interactionDateTime(0L)
                                .properties(
                                    MarketingEventSubscriber.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .vid(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        assertThat(params._pathParam(1)).isEqualTo("subscriberState")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SubscriberStateRecordByIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder()
                                .interactionDateTime(0L)
                                .properties(
                                    MarketingEventSubscriber.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .vid(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }

    @Test
    fun body() {
        val params =
            SubscriberStateRecordByIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder()
                                .interactionDateTime(0L)
                                .properties(
                                    MarketingEventSubscriber.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .vid(0L)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputMarketingEventSubscriber.builder()
                    .addInput(
                        MarketingEventSubscriber.builder()
                            .interactionDateTime(0L)
                            .properties(
                                MarketingEventSubscriber.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .vid(0L)
                            .build()
                    )
                    .build()
            )
    }
}
