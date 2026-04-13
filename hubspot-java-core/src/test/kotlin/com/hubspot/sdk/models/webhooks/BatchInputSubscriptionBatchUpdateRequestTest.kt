// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputSubscriptionBatchUpdateRequestTest {

    @Test
    fun create() {
        val batchInputSubscriptionBatchUpdateRequest =
            BatchInputSubscriptionBatchUpdateRequest.builder()
                .addInput(SubscriptionBatchUpdateRequest.builder().id(0).active(true).build())
                .build()

        assertThat(batchInputSubscriptionBatchUpdateRequest.inputs())
            .containsExactly(SubscriptionBatchUpdateRequest.builder().id(0).active(true).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputSubscriptionBatchUpdateRequest =
            BatchInputSubscriptionBatchUpdateRequest.builder()
                .addInput(SubscriptionBatchUpdateRequest.builder().id(0).active(true).build())
                .build()

        val roundtrippedBatchInputSubscriptionBatchUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputSubscriptionBatchUpdateRequest),
                jacksonTypeRef<BatchInputSubscriptionBatchUpdateRequest>(),
            )

        assertThat(roundtrippedBatchInputSubscriptionBatchUpdateRequest)
            .isEqualTo(batchInputSubscriptionBatchUpdateRequest)
    }
}
