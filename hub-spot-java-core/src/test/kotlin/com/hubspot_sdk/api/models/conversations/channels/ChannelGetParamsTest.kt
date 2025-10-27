// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelGetParamsTest {

    @Test
    fun create() {
        ChannelGetParams.builder().channelId("channelId").build()
    }

    @Test
    fun pathParams() {
        val params = ChannelGetParams.builder().channelId("channelId").build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
