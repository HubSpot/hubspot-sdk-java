// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionListResponseTest {

    @Test
    fun create() {
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .addResult(
                    SubscriptionResponse.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
                        .objectTypeId("objectTypeId")
                        .propertyName("propertyName")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(subscriptionListResponse.results())
            .containsExactly(
                SubscriptionResponse.builder()
                    .id("id")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventType(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscriptionListResponse =
            SubscriptionListResponse.builder()
                .addResult(
                    SubscriptionResponse.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(SubscriptionResponse.EventType.COMPANY_ASSOCIATION_CHANGE)
                        .objectTypeId("objectTypeId")
                        .propertyName("propertyName")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedSubscriptionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscriptionListResponse),
                jacksonTypeRef<SubscriptionListResponse>(),
            )

        assertThat(roundtrippedSubscriptionListResponse).isEqualTo(subscriptionListResponse)
    }
}
