// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseSubscriptionResponseTest {

    @Test
    fun create() {
        val batchResponseSubscriptionResponse =
            BatchResponseSubscriptionResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SubscriptionResponse.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(SubscriptionResponse.EventType.CONTACT_PROPERTY_CHANGE)
                        .objectTypeId("objectTypeId")
                        .propertyName("propertyName")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSubscriptionResponse.Status.PENDING)
                .links(
                    BatchResponseSubscriptionResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseSubscriptionResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSubscriptionResponse.results())
            .containsExactly(
                SubscriptionResponse.builder()
                    .id("id")
                    .active(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventType(SubscriptionResponse.EventType.CONTACT_PROPERTY_CHANGE)
                    .objectTypeId("objectTypeId")
                    .propertyName("propertyName")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseSubscriptionResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSubscriptionResponse.status())
            .isEqualTo(BatchResponseSubscriptionResponse.Status.PENDING)
        assertThat(batchResponseSubscriptionResponse.links())
            .contains(
                BatchResponseSubscriptionResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseSubscriptionResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseSubscriptionResponse =
            BatchResponseSubscriptionResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SubscriptionResponse.builder()
                        .id("id")
                        .active(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventType(SubscriptionResponse.EventType.CONTACT_PROPERTY_CHANGE)
                        .objectTypeId("objectTypeId")
                        .propertyName("propertyName")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSubscriptionResponse.Status.PENDING)
                .links(
                    BatchResponseSubscriptionResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseSubscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseSubscriptionResponse),
                jacksonTypeRef<BatchResponseSubscriptionResponse>(),
            )

        assertThat(roundtrippedBatchResponseSubscriptionResponse)
            .isEqualTo(batchResponseSubscriptionResponse)
    }
}
