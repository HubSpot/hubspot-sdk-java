// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionPauseParamsTest {

    @Test
    fun create() {
        SubscriptionPauseParams.builder()
            .objectId(0L)
            .pauseSubscriptionRequest(
                PauseSubscriptionRequest.builder().pauseReason("pauseReason").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionPauseParams.builder()
                .objectId(0L)
                .pauseSubscriptionRequest(PauseSubscriptionRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionPauseParams.builder()
                .objectId(0L)
                .pauseSubscriptionRequest(
                    PauseSubscriptionRequest.builder().pauseReason("pauseReason").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PauseSubscriptionRequest.builder().pauseReason("pauseReason").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionPauseParams.builder()
                .objectId(0L)
                .pauseSubscriptionRequest(PauseSubscriptionRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PauseSubscriptionRequest.builder().build())
    }
}
