// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetParamsTest {

    @Test
    fun create() {
        MessageGetParams.builder().channelId("channelId").messageId("messageId").build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageGetParams.builder().channelId("channelId").messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
