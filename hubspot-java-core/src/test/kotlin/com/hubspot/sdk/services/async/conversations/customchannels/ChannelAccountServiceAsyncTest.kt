// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.conversations.customchannels

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccountEgg
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccountUpdateRequest
import com.hubspot.sdk.models.conversations.customchannels.PublicDeliveryIdentifier
import com.hubspot.sdk.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot.sdk.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import com.hubspot.sdk.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateStagingTokenParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ChannelAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.create(
                ChannelAccountCreateParams.builder()
                    .channelId(0)
                    .publicChannelAccountEgg(
                        PublicChannelAccountEgg.builder()
                            .authorized(true)
                            .inboxId("inboxId")
                            .name("name")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountFuture =
            channelAccountServiceAsync.update(
                ChannelAccountUpdateParams.builder()
                    .channelId(0)
                    .channelAccountId(0L)
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val pageFuture = channelAccountServiceAsync.list(0)

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateStagingToken() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val channelAccountServiceAsync = client.conversations().customChannels().channelAccounts()

        val publicChannelAccountStagingTokenFuture =
            channelAccountServiceAsync.updateStagingToken(
                ChannelAccountUpdateStagingTokenParams.builder()
                    .channelId(0)
                    .accountToken("accountToken")
                    .publicChannelAccountStagingTokenUpdateRequest(
                        PublicChannelAccountStagingTokenUpdateRequest.builder()
                            .accountName("accountName")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                                    .value("value")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val publicChannelAccountStagingToken = publicChannelAccountStagingTokenFuture.get()
        publicChannelAccountStagingToken.validate()
    }
}
