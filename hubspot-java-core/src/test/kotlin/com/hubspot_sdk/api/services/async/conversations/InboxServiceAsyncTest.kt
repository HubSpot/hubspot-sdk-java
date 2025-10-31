// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboxServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val inboxServiceAsync = client.conversations().inboxes()

        val collectionResponseWithTotalPublicInboxForwardPagingFuture = inboxServiceAsync.list()

        val collectionResponseWithTotalPublicInboxForwardPaging =
            collectionResponseWithTotalPublicInboxForwardPagingFuture.get()
        collectionResponseWithTotalPublicInboxForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val inboxServiceAsync = client.conversations().inboxes()

        val publicInboxFuture = inboxServiceAsync.get("inboxId")

        val publicInbox = publicInboxFuture.get()
        publicInbox.validate()
    }
}
