// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDeleteBatchParamsTest {

    @Test
    fun create() {
        EventDeleteBatchParams.builder()
            .batchInputMarketingEventPublicObjectIdDeleteRequest(
                BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                    .addInput(
                        MarketingEventPublicObjectIdDeleteRequest.builder()
                            .objectId("objectId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EventDeleteBatchParams.builder()
                .batchInputMarketingEventPublicObjectIdDeleteRequest(
                    BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                        .addInput(
                            MarketingEventPublicObjectIdDeleteRequest.builder()
                                .objectId("objectId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                    .addInput(
                        MarketingEventPublicObjectIdDeleteRequest.builder()
                            .objectId("objectId")
                            .build()
                    )
                    .build()
            )
    }
}
