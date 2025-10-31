// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelServiceAsync = client.conversations().channels()

        val collectionResponseWithTotalPublicChannelForwardPagingFuture = channelServiceAsync.list()

        val collectionResponseWithTotalPublicChannelForwardPaging =
            collectionResponseWithTotalPublicChannelForwardPagingFuture.get()
        collectionResponseWithTotalPublicChannelForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelServiceAsync = client.conversations().channels()

        val publicChannelFuture = channelServiceAsync.get("channelId")

        val publicChannel = publicChannelFuture.get()
        publicChannel.validate()
    }
}
