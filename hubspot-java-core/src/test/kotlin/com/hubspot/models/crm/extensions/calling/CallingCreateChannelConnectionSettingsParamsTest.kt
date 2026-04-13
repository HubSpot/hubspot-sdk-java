// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallingCreateChannelConnectionSettingsParamsTest {

    @Test
    fun create() {
        CallingCreateChannelConnectionSettingsParams.builder()
            .appId(0)
            .channelConnectionSettingsRequest(
                ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallingCreateChannelConnectionSettingsParams.builder()
                .appId(0)
                .channelConnectionSettingsRequest(
                    ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallingCreateChannelConnectionSettingsParams.builder()
                .appId(0)
                .channelConnectionSettingsRequest(
                    ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(ChannelConnectionSettingsRequest.builder().isReady(true).url("url").build())
    }
}
