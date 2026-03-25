// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountStagingTokenUpdateRequest
import com.hubspot_sdk.api.models.conversations.customchannels.PublicDeliveryIdentifier
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountUpdateStagingTokenParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
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

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("accountToken")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }
}
