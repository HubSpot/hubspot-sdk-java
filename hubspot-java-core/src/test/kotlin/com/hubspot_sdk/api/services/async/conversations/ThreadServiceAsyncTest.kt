// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicThreadUpdateRequest
import com.hubspot_sdk.api.models.conversations.threads.ThreadGetParams
import com.hubspot_sdk.api.models.conversations.threads.ThreadUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ThreadServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadServiceAsync = client.conversations().threads()

        val publicThreadFuture =
            threadServiceAsync.update(
                ThreadUpdateParams.builder()
                    .threadId(0L)
                    .queryArchived(true)
                    .publicThreadUpdateRequest(
                        PublicThreadUpdateRequest.builder()
                            .archived(true)
                            .status(PublicThreadUpdateRequest.Status.OPEN)
                            .build()
                    )
                    .build()
            )

        val publicThread = publicThreadFuture.get()
        publicThread.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadServiceAsync = client.conversations().threads()

        val pageFuture = threadServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadServiceAsync = client.conversations().threads()

        val future = threadServiceAsync.delete(0L)

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val threadServiceAsync = client.conversations().threads()

        val publicThreadFuture =
            threadServiceAsync.get(
                ThreadGetParams.builder()
                    .threadId(0L)
                    .archived(true)
                    .addAssociation(ThreadGetParams.Association.TICKET)
                    .property("property")
                    .build()
            )

        val publicThread = publicThreadFuture.get()
        publicThread.validate()
    }
}
