// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents.attendance

import com.hubspot.core.JsonValue
import com.hubspot.models.marketing.marketingevents.BatchInputMarketingEventSubscriber
import com.hubspot.models.marketing.marketingevents.MarketingEventSubscriber
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttendanceCreateByEventIdAndContactIdParamsTest {

    @Test
    fun create() {
        AttendanceCreateByEventIdAndContactIdParams.builder()
            .objectId("objectId")
            .subscriberState("subscriberState")
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
            AttendanceCreateByEventIdAndContactIdParams.builder()
                .objectId("objectId")
                .subscriberState("subscriberState")
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

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        assertThat(params._pathParam(1)).isEqualTo("subscriberState")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AttendanceCreateByEventIdAndContactIdParams.builder()
                .objectId("objectId")
                .subscriberState("subscriberState")
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
}
