// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.hubspot_sdk.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendSendEventBatchParamsTest {

    @Test
    fun create() {
        SendSendEventBatchParams.builder()
            .batchedBehavioralEventHttpCompletionRequest(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SendSendEventBatchParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SendSendEventBatchParams.builder()
                .batchedBehavioralEventHttpCompletionRequest(
                    BatchedBehavioralEventHttpCompletionRequest.builder()
                        .addInput(
                            BehavioralEventHttpCompletionRequest.builder()
                                .eventName("eventName")
                                .properties(
                                    BehavioralEventHttpCompletionRequest.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchedBehavioralEventHttpCompletionRequest.builder()
                    .addInput(
                        BehavioralEventHttpCompletionRequest.builder()
                            .eventName("eventName")
                            .properties(
                                BehavioralEventHttpCompletionRequest.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
