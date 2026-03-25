// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.appwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPatchRequestTest {

    @Test
    fun create() {
        val subscriptionPatchRequest = SubscriptionPatchRequest.builder().active(true).build()

        assertThat(subscriptionPatchRequest.active()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionPatchRequest = SubscriptionPatchRequest.builder().active(true).build()

        val roundtrippedSubscriptionPatchRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionPatchRequest),
                jacksonTypeRef<SubscriptionPatchRequest>(),
            )

        assertThat(roundtrippedSubscriptionPatchRequest).isEqualTo(subscriptionPatchRequest)
    }
}
