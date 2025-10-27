// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channelaccounts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountGetParamsTest {

    @Test
    fun create() {
        ChannelAccountGetParams.builder().channelAccountId("channelAccountId").build()
    }

    @Test
    fun pathParams() {
        val params = ChannelAccountGetParams.builder().channelAccountId("channelAccountId").build()

        assertThat(params._pathParam(0)).isEqualTo("channelAccountId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
