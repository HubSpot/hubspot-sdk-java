// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccountstagingtokens

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountStagingTokenUpdateParamsTest {

    @Test
    fun create() {
        ChannelAccountStagingTokenUpdateParams.builder()
            .channelId("channelId")
            .accountToken("accountToken")
            .accountName("accountName")
            .deliveryIdentifier(
                PublicDeliveryIdentifier.builder().type("type").value("value").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountStagingTokenUpdateParams.builder()
                .channelId("channelId")
                .accountToken("accountToken")
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
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
                .accountName("accountName")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountName()).isEqualTo("accountName")
        assertThat(body.deliveryIdentifier())
            .isEqualTo(PublicDeliveryIdentifier.builder().type("type").value("value").build())
    }
}
