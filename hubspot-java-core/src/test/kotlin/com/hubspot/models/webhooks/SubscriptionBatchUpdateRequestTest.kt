// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionBatchUpdateRequestTest {

    @Test
    fun create() {
        val subscriptionBatchUpdateRequest =
            SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()

        assertThat(subscriptionBatchUpdateRequest.id()).isEqualTo(0)
        assertThat(subscriptionBatchUpdateRequest.active()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionBatchUpdateRequest =
            SubscriptionBatchUpdateRequest.builder().id(0).active(true).build()

        val roundtrippedSubscriptionBatchUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionBatchUpdateRequest),
                jacksonTypeRef<SubscriptionBatchUpdateRequest>(),
            )

        assertThat(roundtrippedSubscriptionBatchUpdateRequest)
            .isEqualTo(subscriptionBatchUpdateRequest)
    }
}
