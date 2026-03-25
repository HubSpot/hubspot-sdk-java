// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelGetParamsTest {

    @Test
    fun create() {
        CustomChannelGetParams.builder().channelId(0).channelAccountId(0L).archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = CustomChannelGetParams.builder().channelId(0).channelAccountId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomChannelGetParams.builder()
                .channelId(0)
                .channelAccountId(0L)
                .archived(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomChannelGetParams.builder().channelId(0).channelAccountId(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
