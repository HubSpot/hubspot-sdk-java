// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events.attendance

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.marketing.events.BatchInputMarketingEventSubscriber
import com.hubspot_sdk.api.models.marketing.events.MarketingEventSubscriber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttendanceCreateByExternalEventIdAndContactIdParamsTest {

    @Test
    fun create() {
        AttendanceCreateByExternalEventIdAndContactIdParams.builder()
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
                            .vid(0)
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AttendanceCreateByExternalEventIdAndContactIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder().interactionDateTime(0L).build()
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
            AttendanceCreateByExternalEventIdAndContactIdParams.builder()
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
                                .vid(0)
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
            AttendanceCreateByExternalEventIdAndContactIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder().interactionDateTime(0L).build()
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
            AttendanceCreateByExternalEventIdAndContactIdParams.builder()
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
                                .vid(0)
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
                            .vid(0)
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AttendanceCreateByExternalEventIdAndContactIdParams.builder()
                .externalEventId("externalEventId")
                .subscriberState("subscriberState")
                .batchInputMarketingEventSubscriber(
                    BatchInputMarketingEventSubscriber.builder()
                        .addInput(
                            MarketingEventSubscriber.builder().interactionDateTime(0L).build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputMarketingEventSubscriber.builder()
                    .addInput(MarketingEventSubscriber.builder().interactionDateTime(0L).build())
                    .build()
            )
    }
}
