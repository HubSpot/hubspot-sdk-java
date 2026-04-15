// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventExternalUniqueIdentifierTest {

    @Test
    fun create() {
        val batchInputMarketingEventExternalUniqueIdentifier =
            BatchInputMarketingEventExternalUniqueIdentifier.builder()
                .addInput(
                    MarketingEventExternalUniqueIdentifier.builder()
                        .appId(0)
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .build()
                )
                .build()

        assertThat(batchInputMarketingEventExternalUniqueIdentifier.inputs())
            .containsExactly(
                MarketingEventExternalUniqueIdentifier.builder()
                    .appId(0)
                    .externalAccountId("externalAccountId")
                    .externalEventId("externalEventId")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventExternalUniqueIdentifier =
            BatchInputMarketingEventExternalUniqueIdentifier.builder()
                .addInput(
                    MarketingEventExternalUniqueIdentifier.builder()
                        .appId(0)
                        .externalAccountId("externalAccountId")
                        .externalEventId("externalEventId")
                        .build()
                )
                .build()

        val roundtrippedBatchInputMarketingEventExternalUniqueIdentifier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventExternalUniqueIdentifier),
                jacksonTypeRef<BatchInputMarketingEventExternalUniqueIdentifier>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventExternalUniqueIdentifier)
            .isEqualTo(batchInputMarketingEventExternalUniqueIdentifier)
    }
}
