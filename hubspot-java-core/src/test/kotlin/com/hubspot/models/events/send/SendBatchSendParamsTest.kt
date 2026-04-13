// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.send

import com.hubspot.core.JsonValue
import com.hubspot.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.models.events.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SendBatchSendParamsTest {

    @Test
    fun create() {
        SendBatchSendParams.builder()
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
                            .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            SendBatchSendParams.builder()
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
                                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                            .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
            SendBatchSendParams.builder()
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
