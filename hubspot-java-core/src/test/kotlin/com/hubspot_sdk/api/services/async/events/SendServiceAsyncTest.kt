// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SendServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchSend() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.batchSend(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun send() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.send(
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

        val response = future.get()
    }
}
