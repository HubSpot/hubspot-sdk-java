// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelAccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().channelAccounts()

        val collectionResponseWithTotalPublicChannelAccountForwardPagingFuture =
            channelAccountServiceAsync.list()

        val collectionResponseWithTotalPublicChannelAccountForwardPaging =
            collectionResponseWithTotalPublicChannelAccountForwardPagingFuture.get()
        collectionResponseWithTotalPublicChannelAccountForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().channelAccounts()

        val conversationsPublicChannelAccountFuture =
            channelAccountServiceAsync.get("channelAccountId")

        val conversationsPublicChannelAccount = conversationsPublicChannelAccountFuture.get()
        conversationsPublicChannelAccount.validate()
    }
}
