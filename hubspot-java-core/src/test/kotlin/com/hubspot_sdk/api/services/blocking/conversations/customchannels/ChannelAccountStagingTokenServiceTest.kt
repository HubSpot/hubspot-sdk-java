// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.conversations.customchannels

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import com.hubspot_sdk.api.models.conversations.customchannels.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens.ChannelAccountStagingTokenUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ChannelAccountStagingTokenServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val channelAccountStagingTokenService =
            client.conversations().customChannels().channelAccountStagingTokens()

        val publicChannelAccountStagingToken =
            channelAccountStagingTokenService.update(
                ChannelAccountStagingTokenUpdateParams.builder()
                    .channelId(0)
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

        publicChannelAccountStagingToken.validate()
    }
}
