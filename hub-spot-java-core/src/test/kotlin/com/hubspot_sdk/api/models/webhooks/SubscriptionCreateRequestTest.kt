// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateRequestTest {

    @Test
    fun create() {
        val subscriptionCreateRequest =
            SubscriptionCreateRequest.builder()
                .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                .active(true)
                .objectTypeId("objectTypeId")
                .propertyName("email")
                .build()

        assertThat(subscriptionCreateRequest.eventType())
            .isEqualTo(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
        assertThat(subscriptionCreateRequest.active()).contains(true)
        assertThat(subscriptionCreateRequest.objectTypeId()).contains("objectTypeId")
        assertThat(subscriptionCreateRequest.propertyName()).contains("email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCreateRequest =
            SubscriptionCreateRequest.builder()
                .eventType(SubscriptionCreateRequest.EventType.CONTACT_PROPERTY_CHANGE)
                .active(true)
                .objectTypeId("objectTypeId")
                .propertyName("email")
                .build()

        val roundtrippedSubscriptionCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCreateRequest),
                jacksonTypeRef<SubscriptionCreateRequest>(),
            )

        assertThat(roundtrippedSubscriptionCreateRequest).isEqualTo(subscriptionCreateRequest)
    }
}
