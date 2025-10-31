// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SendServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun send() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sendService = client.events().send()

        sendService.send(
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
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun sendBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sendService = client.events().send()

        sendService.sendBatch(
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
    }
}
