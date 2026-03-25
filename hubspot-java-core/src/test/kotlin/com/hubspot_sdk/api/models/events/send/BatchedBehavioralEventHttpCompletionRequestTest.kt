// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchedBehavioralEventHttpCompletionRequestTest {

    @Test
    fun create() {
        val batchedBehavioralEventHttpCompletionRequest =
            BatchedBehavioralEventHttpCompletionRequest.builder()
                .addInput(
                    BehavioralEventHttpCompletionRequest.builder()
                        .eventName("eventName")
                        .properties(
                            BehavioralEventHttpCompletionRequest.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .email("email")
                        .objectId("objectId")
                        .occurredAt(OffsetDateTime.parse("2026-01-20T21:14:16.512Z"))
                        .utk("utk")
                        .uuid("uuid")
                        .build()
                )
                .build()

        assertThat(batchedBehavioralEventHttpCompletionRequest.inputs())
            .containsExactly(
                BehavioralEventHttpCompletionRequest.builder()
                    .eventName("eventName")
                    .properties(
                        BehavioralEventHttpCompletionRequest.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .email("email")
                    .objectId("objectId")
                    .occurredAt(OffsetDateTime.parse("2026-01-20T21:14:16.512Z"))
                    .utk("utk")
                    .uuid("uuid")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchedBehavioralEventHttpCompletionRequest =
            BatchedBehavioralEventHttpCompletionRequest.builder()
                .addInput(
                    BehavioralEventHttpCompletionRequest.builder()
                        .eventName("eventName")
                        .properties(
                            BehavioralEventHttpCompletionRequest.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .email("email")
                        .objectId("objectId")
                        .occurredAt(OffsetDateTime.parse("2026-01-20T21:14:16.512Z"))
                        .utk("utk")
                        .uuid("uuid")
                        .build()
                )
                .build()

        val roundtrippedBatchedBehavioralEventHttpCompletionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchedBehavioralEventHttpCompletionRequest),
                jacksonTypeRef<BatchedBehavioralEventHttpCompletionRequest>(),
            )

        assertThat(roundtrippedBatchedBehavioralEventHttpCompletionRequest)
            .isEqualTo(batchedBehavioralEventHttpCompletionRequest)
    }
}
