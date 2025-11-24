// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUnpauseParamsTest {

    @Test
    fun create() {
        SubscriptionUnpauseParams.builder()
            .objectId(0L)
            .unpauseRequest(UnpauseRequest.builder().proposedNextBillingDate(0L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionUnpauseParams.builder()
                .objectId(0L)
                .unpauseRequest(UnpauseRequest.builder().proposedNextBillingDate(0L).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUnpauseParams.builder()
                .objectId(0L)
                .unpauseRequest(UnpauseRequest.builder().proposedNextBillingDate(0L).build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UnpauseRequest.builder().proposedNextBillingDate(0L).build())
    }
}
