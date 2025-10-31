// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountCreateParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountGetParams
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts.ChannelAccountUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelAccountServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountService = client.conversations().customChannels().channelAccounts()

        val publicChannelAccount =
            channelAccountService.create(
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

        publicChannelAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountService = client.conversations().customChannels().channelAccounts()

        val publicChannelAccount =
            channelAccountService.update(
                ChannelAccountUpdateParams.builder()
                    .channelId("channelId")
                    .channelAccountId("channelAccountId")
                    .authorized(true)
                    .name("name")
                    .build()
            )

        publicChannelAccount.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountService = client.conversations().customChannels().channelAccounts()

        val collectionResponseWithTotalPublicChannelAccountForwardPaging =
            channelAccountService.list("channelId")

        collectionResponseWithTotalPublicChannelAccountForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountService = client.conversations().customChannels().channelAccounts()

        val publicChannelAccount =
            channelAccountService.get(
                ChannelAccountGetParams.builder()
                    .channelId("channelId")
                    .channelAccountId("channelAccountId")
                    .build()
            )

        publicChannelAccount.validate()
    }
}
