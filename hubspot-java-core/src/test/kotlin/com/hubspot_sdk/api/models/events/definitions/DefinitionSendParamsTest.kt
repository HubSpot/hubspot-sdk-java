// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.definitions

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.events.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionSendParamsTest {

    @Test
    fun create() {
        DefinitionSendParams.builder()
            .behavioralEventHttpCompletionRequest(
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
    }

    @Test
    fun body() {
        val params =
            DefinitionSendParams.builder()
                .behavioralEventHttpCompletionRequest(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DefinitionSendParams.builder()
                .behavioralEventHttpCompletionRequest(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BehavioralEventHttpCompletionRequest.builder()
                    .eventName("eventName")
                    .properties(
                        BehavioralEventHttpCompletionRequest.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
    }
}
