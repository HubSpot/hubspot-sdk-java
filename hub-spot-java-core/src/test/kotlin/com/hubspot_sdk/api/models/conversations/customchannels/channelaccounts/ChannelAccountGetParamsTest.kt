// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountGetParamsTest {

    @Test
    fun create() {
        ChannelAccountGetParams.builder()
            .channelId("channelId")
            .channelAccountId("channelAccountId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountGetParams.builder()
                .channelId("channelId")
                .channelAccountId("channelAccountId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        assertThat(params._pathParam(1)).isEqualTo("channelAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
