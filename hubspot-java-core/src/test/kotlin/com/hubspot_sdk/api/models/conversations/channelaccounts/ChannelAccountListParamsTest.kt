// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.channelaccounts

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountListParamsTest {

    @Test
    fun create() {
        ChannelAccountListParams.builder()
            .after("after")
            .archived(true)
            .addChannelId(0)
            .defaultPageLength(0)
            .addInboxId(0)
            .limit(0)
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChannelAccountListParams.builder()
                .after("after")
                .archived(true)
                .addChannelId(0)
                .defaultPageLength(0)
                .addInboxId(0)
                .limit(0)
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("channelId", listOf("0").joinToString(","))
                    .put("defaultPageLength", "0")
                    .put("inboxId", listOf("0").joinToString(","))
                    .put("limit", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChannelAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
