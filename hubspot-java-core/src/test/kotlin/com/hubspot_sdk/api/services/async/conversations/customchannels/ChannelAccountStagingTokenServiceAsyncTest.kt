// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelAccountStagingTokenServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountStagingTokenServiceAsync =
            client.conversations().customChannels().channelAccountStagingTokens()

        val publicChannelAccountStagingTokenFuture =
            channelAccountStagingTokenServiceAsync.update(
                ChannelAccountStagingTokenUpdateParams.builder()
                    .channelId("channelId")
                    .accountToken("accountToken")
                    .publicChannelAccountStagingTokenUpdateRequest(
                        PublicChannelAccountStagingTokenUpdateRequest.builder()
                            .accountName("accountName")
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

        val publicChannelAccountStagingToken = publicChannelAccountStagingTokenFuture.get()
        publicChannelAccountStagingToken.validate()
    }
}
