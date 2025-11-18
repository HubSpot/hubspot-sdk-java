// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountListParamsTest {

    @Test
    fun create() {
        ChannelAccountListParams.builder()
            .channelId(0)
            .after("after")
            .archived(true)
            .defaultPageLength(0)
            .addDeliveryIdentifierType("string")
            .addDeliveryIdentifierValue("string")
            .limit(0)
            .addSort("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ChannelAccountListParams.builder().channelId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ChannelAccountListParams.builder()
                .channelId(0)
                .after("after")
                .archived(true)
                .defaultPageLength(0)
                .addDeliveryIdentifierType("string")
                .addDeliveryIdentifierValue("string")
                .limit(0)
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("defaultPageLength", "0")
                    .put("deliveryIdentifierType", listOf("string").joinToString(","))
                    .put("deliveryIdentifierValue", listOf("string").joinToString(","))
                    .put("limit", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChannelAccountListParams.builder().channelId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
