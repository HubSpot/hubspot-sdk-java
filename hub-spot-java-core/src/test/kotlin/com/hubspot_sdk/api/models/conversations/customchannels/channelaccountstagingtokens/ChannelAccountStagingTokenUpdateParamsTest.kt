// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountStagingTokenUpdateParamsTest {

    @Test
    fun create() {
        ChannelAccountStagingTokenUpdateParams.builder()
            .channelId("channelId")
            .accountToken("accountToken")
            .publicChannelAccountStagingTokenUpdateRequest(
                PublicChannelAccountStagingTokenUpdateRequest.builder()
                    .accountName("accountName")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountStagingTokenUpdateParams.builder()
                .channelId("channelId")
                .accountToken("accountToken")
                .publicChannelAccountStagingTokenUpdateRequest(
                    PublicChannelAccountStagingTokenUpdateRequest.builder()
                        .accountName("accountName")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        assertThat(params._pathParam(1)).isEqualTo("accountToken")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChannelAccountStagingTokenUpdateParams.builder()
                .channelId("channelId")
                .accountToken("accountToken")
                .publicChannelAccountStagingTokenUpdateRequest(
                    PublicChannelAccountStagingTokenUpdateRequest.builder()
                        .accountName("accountName")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelAccountStagingTokenUpdateRequest.builder()
                    .accountName("accountName")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
    }
}
