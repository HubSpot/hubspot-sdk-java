// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActorServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchRead() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val actorServiceAsync = client.conversations().actors()

        val batchResponsePublicActorFuture =
            actorServiceAsync.batchRead(BatchInputString.builder().addInput("string").build())

        val batchResponsePublicActor = batchResponsePublicActorFuture.get()
        batchResponsePublicActor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val actorServiceAsync = client.conversations().actors()

        val publicActorFuture = actorServiceAsync.get("actorId")

        val publicActor = publicActorFuture.get()
        publicActor.validate()
    }
}
