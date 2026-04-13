// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateRequestTest {

    @Test
    fun create() {
        val subscriptionCreateRequest =
            SubscriptionCreateRequest.builder()
                .active(true)
                .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                .eventTypeName("eventTypeName")
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .build()

        assertThat(subscriptionCreateRequest.active()).isEqualTo(true)
        assertThat(subscriptionCreateRequest.eventType())
            .isEqualTo(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
        assertThat(subscriptionCreateRequest.eventTypeName()).contains("eventTypeName")
        assertThat(subscriptionCreateRequest.objectTypeId()).contains("objectTypeId")
        assertThat(subscriptionCreateRequest.propertyName()).contains("propertyName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionCreateRequest =
            SubscriptionCreateRequest.builder()
                .active(true)
                .eventType(SubscriptionCreateRequest.EventType.COMPANY_ASSOCIATION_CHANGE)
                .eventTypeName("eventTypeName")
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .build()

        val roundtrippedSubscriptionCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionCreateRequest),
                jacksonTypeRef<SubscriptionCreateRequest>(),
            )

        assertThat(roundtrippedSubscriptionCreateRequest).isEqualTo(subscriptionCreateRequest)
    }
}
