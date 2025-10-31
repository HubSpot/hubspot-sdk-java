// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelAccountServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.create(
                ChannelAccountCreateParams.builder()
                    .channelId("channelId")
                    .authorized(true)
                    .inboxId("inboxId")
                    .name("name")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )

        val publicChannelAccount = publicChannelAccountFuture.get()
        publicChannelAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.update(
                ChannelAccountUpdateParams.builder()
                    .channelId("channelId")
                    .channelAccountId("channelAccountId")
                    .authorized(true)
                    .name("name")
                    .build()
            )

        val publicChannelAccount = publicChannelAccountFuture.get()
        publicChannelAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val collectionResponseWithTotalPublicChannelAccountForwardPagingFuture =
            channelAccountServiceAsync.list("channelId")

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
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.get(
                ChannelAccountGetParams.builder()
                    .channelId("channelId")
                    .channelAccountId("channelAccountId")
                    .build()
            )

        val publicChannelAccount = publicChannelAccountFuture.get()
        publicChannelAccount.validate()
    }
}
