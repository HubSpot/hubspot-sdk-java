// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountUpdateParamsTest {

    @Test
    fun create() {
        ChannelAccountUpdateParams.builder()
            .channelId("channelId")
            .channelAccountId("channelAccountId")
            .authorized(true)
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountUpdateParams.builder()
                .channelId("channelId")
                .channelAccountId("channelAccountId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        assertThat(params._pathParam(1)).isEqualTo("channelAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ChannelAccountUpdateParams.builder()
                .channelId("channelId")
                .channelAccountId("channelAccountId")
                .authorized(true)
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.authorized()).contains(true)
        assertThat(body.name()).contains("name")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelAccountUpdateParams.builder()
                .channelId("channelId")
                .channelAccountId("channelAccountId")
                .build()

        val body = params._body()
    }
}
