// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.appwebhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionResponseTest {

    @Test
    fun create() {
        val subscriptionResponse =
            SubscriptionResponse.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
                .eventTypeName("eventTypeName")
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(subscriptionResponse.id()).isEqualTo("id")
        assertThat(subscriptionResponse.active()).isEqualTo(true)
        assertThat(subscriptionResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscriptionResponse.eventType())
            .isEqualTo(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
        assertThat(subscriptionResponse.eventTypeName()).contains("eventTypeName")
        assertThat(subscriptionResponse.objectTypeId()).contains("objectTypeId")
        assertThat(subscriptionResponse.propertyName()).contains("propertyName")
        assertThat(subscriptionResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionResponse =
            SubscriptionResponse.builder()
                .id("id")
                .active(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventType(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
                .eventTypeName("eventTypeName")
                .objectTypeId("objectTypeId")
                .propertyName("propertyName")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedSubscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionResponse),
                jacksonTypeRef<SubscriptionResponse>(),
            )

        assertThat(roundtrippedSubscriptionResponse).isEqualTo(subscriptionResponse)
    }
}
