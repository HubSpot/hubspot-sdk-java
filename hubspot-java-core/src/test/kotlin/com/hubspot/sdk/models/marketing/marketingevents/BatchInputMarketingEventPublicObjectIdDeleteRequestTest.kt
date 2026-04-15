// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventPublicObjectIdDeleteRequestTest {

    @Test
    fun create() {
        val batchInputMarketingEventPublicObjectIdDeleteRequest =
            BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                .addInput(
                    MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()
                )
                .build()

        assertThat(batchInputMarketingEventPublicObjectIdDeleteRequest.inputs())
            .containsExactly(
                MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventPublicObjectIdDeleteRequest =
            BatchInputMarketingEventPublicObjectIdDeleteRequest.builder()
                .addInput(
                    MarketingEventPublicObjectIdDeleteRequest.builder().objectId("objectId").build()
                )
                .build()

        val roundtrippedBatchInputMarketingEventPublicObjectIdDeleteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventPublicObjectIdDeleteRequest),
                jacksonTypeRef<BatchInputMarketingEventPublicObjectIdDeleteRequest>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventPublicObjectIdDeleteRequest)
            .isEqualTo(batchInputMarketingEventPublicObjectIdDeleteRequest)
    }
}
