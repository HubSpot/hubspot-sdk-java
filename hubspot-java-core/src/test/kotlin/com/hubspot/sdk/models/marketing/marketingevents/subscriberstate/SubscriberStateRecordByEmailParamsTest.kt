// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents.subscriberstate

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.http.QueryParams
import com.hubspot.sdk.models.marketing.marketingevents.BatchInputMarketingEventEmailSubscriber
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventEmailSubscriber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriberStateRecordByEmailParamsTest {

    @Test
    fun create() {
        SubscriberStateRecordByEmailParams.builder()
            .externalEventId("externalEventId")
            .subscriberState("subscriberState")
            .externalAccountId("externalAccountId")
            .batchInputMarketingEventEmailSubscriber(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriberStateRecordByEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventEmailSubscriber(
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
            SubscriberStateRecordByEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventEmailSubscriber(
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
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }

    @Test
    fun body() {
        val params =
            SubscriberStateRecordByEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .externalAccountId("externalAccountId")
                .batchInputMarketingEventEmailSubscriber(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }
}
