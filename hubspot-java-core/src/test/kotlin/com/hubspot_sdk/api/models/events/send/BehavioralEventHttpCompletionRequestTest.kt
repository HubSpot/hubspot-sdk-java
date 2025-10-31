// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BehavioralEventHttpCompletionRequestTest {

    @Test
    fun create() {
        val behavioralEventHttpCompletionRequest =
            BehavioralEventHttpCompletionRequest.builder()
                .eventName("eventName")
                .email("email")
                .objectId("objectId")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    BehavioralEventHttpCompletionRequest.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .utk("utk")
                .uuid("uuid")
                .build()

        assertThat(behavioralEventHttpCompletionRequest.eventName()).isEqualTo("eventName")
        assertThat(behavioralEventHttpCompletionRequest.email()).contains("email")
        assertThat(behavioralEventHttpCompletionRequest.objectId()).contains("objectId")
        assertThat(behavioralEventHttpCompletionRequest.occurredAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(behavioralEventHttpCompletionRequest.properties())
            .contains(
                BehavioralEventHttpCompletionRequest.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(behavioralEventHttpCompletionRequest.utk()).contains("utk")
        assertThat(behavioralEventHttpCompletionRequest.uuid()).contains("uuid")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val behavioralEventHttpCompletionRequest =
            BehavioralEventHttpCompletionRequest.builder()
                .eventName("eventName")
                .email("email")
                .objectId("objectId")
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    BehavioralEventHttpCompletionRequest.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .utk("utk")
                .uuid("uuid")
                .build()

        val roundtrippedBehavioralEventHttpCompletionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(behavioralEventHttpCompletionRequest),
                jacksonTypeRef<BehavioralEventHttpCompletionRequest>(),
            )

        assertThat(roundtrippedBehavioralEventHttpCompletionRequest)
            .isEqualTo(behavioralEventHttpCompletionRequest)
    }
}
