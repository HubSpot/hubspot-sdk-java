// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountEgg
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountUpdateRequest
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.create(
                ChannelAccountCreateParams.builder()
                    .channelId("channelId")
                    .publicChannelAccountEgg(
                        PublicChannelAccountEgg.builder()
                            .authorized(true)
                            .inboxId("inboxId")
                            .name("name")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .build()
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.update(
                ChannelAccountUpdateParams.builder()
                    .channelId("channelId")
                    .channelAccountId("channelAccountId")
                    .publicChannelAccountUpdateRequest(
                        PublicChannelAccountUpdateRequest.builder()
                            .authorized(true)
                            .name("name")
                            .build()
                    )
                    .build()
            )

        val publicChannelAccount = publicChannelAccountFuture.get()
        publicChannelAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
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
