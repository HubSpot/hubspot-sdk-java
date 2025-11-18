// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.conversations.actors.ActorBatchReadParams
import com.hubspot_sdk.api.models.conversations.actors.ActorGetParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActorServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun batchRead() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val actorServiceAsync = client.conversations().actors()

        val batchResponsePublicActorFuture =
            actorServiceAsync.batchRead(
                ActorBatchReadParams.builder()
                    .property("property")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponsePublicActor = batchResponsePublicActorFuture.get()
        batchResponsePublicActor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val actorServiceAsync = client.conversations().actors()

        val publicActorFuture =
            actorServiceAsync.get(
                ActorGetParams.builder().actorId("actorId").property("property").build()
            )

        val publicActor = publicActorFuture.get()
        publicActor.validate()
    }
}
