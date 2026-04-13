// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.events

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.models.events.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SendServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchSend() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sendService = client.events().send()

        sendService.batchSend(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val sendService = client.events().send()

        sendService.send(
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
}
