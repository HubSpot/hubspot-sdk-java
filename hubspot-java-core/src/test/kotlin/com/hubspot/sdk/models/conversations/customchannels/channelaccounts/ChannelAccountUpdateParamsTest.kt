// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels.channelaccounts

import com.hubspot.sdk.models.conversations.customchannels.PublicChannelAccountUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountUpdateParamsTest {

    @Test
    fun create() {
        ChannelAccountUpdateParams.builder()
            .channelId(0)
            .channelAccountId(0L)
            .publicChannelAccountUpdateRequest(
                PublicChannelAccountUpdateRequest.builder().authorized(true).name("name").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountUpdateParams.builder()
                .channelId(0)
                .channelAccountId(0L)
                .publicChannelAccountUpdateRequest(
                    PublicChannelAccountUpdateRequest.builder().build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelAccountUpdateRequest.builder().authorized(true).name("name").build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelAccountUpdateParams.builder()
                .channelId(0)
                .channelAccountId(0L)
                .publicChannelAccountUpdateRequest(
                    PublicChannelAccountUpdateRequest.builder().build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(PublicChannelAccountUpdateRequest.builder().build())
    }
}
