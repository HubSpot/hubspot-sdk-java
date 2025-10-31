// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SendServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.send(
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
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.sendBatch(
                BatchedBehavioralEventHttpCompletionRequest.builder()
                    .addInput(
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
                    )
                    .build()
            )

        val response = future.get()
    }
}
