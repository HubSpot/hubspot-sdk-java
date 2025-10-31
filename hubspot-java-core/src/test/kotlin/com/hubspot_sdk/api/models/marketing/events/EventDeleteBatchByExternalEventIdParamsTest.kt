// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDeleteBatchByExternalEventIdParamsTest {

    @Test
    fun create() {
        EventDeleteBatchByExternalEventIdParams.builder()
            .batchInputMarketingEventExternalUniqueIdentifier(
                BatchInputMarketingEventExternalUniqueIdentifier.builder()
                    .addInput(
                        MarketingEventExternalUniqueIdentifier.builder()
                            .appId(0)
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EventDeleteBatchByExternalEventIdParams.builder()
                .batchInputMarketingEventExternalUniqueIdentifier(
                    BatchInputMarketingEventExternalUniqueIdentifier.builder()
                        .addInput(
                            MarketingEventExternalUniqueIdentifier.builder()
                                .appId(0)
                                .externalAccountId("externalAccountId")
                                .externalEventId("externalEventId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputMarketingEventExternalUniqueIdentifier.builder()
                    .addInput(
                        MarketingEventExternalUniqueIdentifier.builder()
                            .appId(0)
                            .externalAccountId("externalAccountId")
                            .externalEventId("externalEventId")
                            .build()
                    )
                    .build()
            )
    }
}
