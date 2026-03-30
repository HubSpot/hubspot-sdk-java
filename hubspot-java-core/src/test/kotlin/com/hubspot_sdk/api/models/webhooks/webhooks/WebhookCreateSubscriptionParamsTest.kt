// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookCreateSubscriptionParamsTest {

    @Test
    fun create() {
        WebhookCreateSubscriptionParams.builder()
            .appId(0)
            .subscriptionCreateRequest(
                SubscriptionCreateRequest.builder()
                    .active(true)
                    .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                    .eventTypeName("eventTypeName")
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookCreateSubscriptionParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .active(true)
                        .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
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
            WebhookCreateSubscriptionParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .active(true)
                        .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                        .eventTypeName("eventTypeName")
                        .objectTypeId("objectTypeId")
                        .propertyName("propertyName")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionCreateRequest.builder()
                    .active(true)
                    .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                    .eventTypeName("eventTypeName")
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookCreateSubscriptionParams.builder()
                .appId(0)
                .subscriptionCreateRequest(
                    SubscriptionCreateRequest.builder()
                        .active(true)
                        .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                SubscriptionCreateRequest.builder()
                    .active(true)
                    .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                    .build()
            )
    }
}
