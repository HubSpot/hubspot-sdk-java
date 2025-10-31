// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.subscriptions

import com.hubspot_sdk.api.models.webhooks.SubscriptionCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .appId(0)
            .subscriptionCreateRequest(
                SubscriptionCreateRequest.builder()
                    .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                    .active(true)
                    .objectTypeId("objectTypeId")
                    .propertyName("email")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SubscriptionCreateParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                        .active(true)
                        .objectTypeId("objectTypeId")
                        .propertyName("email")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionCreateRequest.builder()
                    .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                    .active(true)
                    .objectTypeId("objectTypeId")
                    .propertyName("email")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionCreateRequest.builder()
                    .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                    .build()
            )
    }
}
