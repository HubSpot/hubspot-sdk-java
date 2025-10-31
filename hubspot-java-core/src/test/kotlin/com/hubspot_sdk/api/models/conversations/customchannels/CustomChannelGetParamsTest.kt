// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelGetParamsTest {

    @Test
    fun create() {
        CustomChannelGetParams.builder().channelId("channelId").build()
    }

    @Test
    fun pathParams() {
        val params = CustomChannelGetParams.builder().channelId("channelId").build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
