// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventDeleteBatchParamsTest {

    @Test
    fun create() {
        MarketingEventDeleteBatchParams.builder()
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
            MarketingEventDeleteBatchParams.builder()
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
