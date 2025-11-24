// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PauseSubscriptionRequestTest {

    @Test
    fun create() {
        val pauseSubscriptionRequest =
            PauseSubscriptionRequest.builder().pauseReason("pauseReason").build()

        assertThat(pauseSubscriptionRequest.pauseReason()).contains("pauseReason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pauseSubscriptionRequest =
            PauseSubscriptionRequest.builder().pauseReason("pauseReason").build()

        val roundtrippedPauseSubscriptionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pauseSubscriptionRequest),
                jacksonTypeRef<PauseSubscriptionRequest>(),
            )

        assertThat(roundtrippedPauseSubscriptionRequest).isEqualTo(pauseSubscriptionRequest)
    }
}
