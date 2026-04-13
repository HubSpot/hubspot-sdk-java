// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.attendance

import com.hubspot.core.JsonValue
import com.hubspot.core.http.QueryParams
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventEmailSubscriber
import com.hubspot.models.marketing.marketingevents.MarketingEventEmailSubscriber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttendanceCreateByExternalEventIdAndEmailParamsTest {

    @Test
    fun create() {
        AttendanceCreateByExternalEventIdAndEmailParams.builder()
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
            AttendanceCreateByExternalEventIdAndEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
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
            AttendanceCreateByExternalEventIdAndEmailParams.builder()
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
    fun queryParamsWithoutOptionalFields() {
        val params =
            AttendanceCreateByExternalEventIdAndEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
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

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AttendanceCreateByExternalEventIdAndEmailParams.builder()
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AttendanceCreateByExternalEventIdAndEmailParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
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
