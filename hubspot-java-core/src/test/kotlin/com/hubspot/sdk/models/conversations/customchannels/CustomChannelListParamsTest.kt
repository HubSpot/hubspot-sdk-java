// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelListParamsTest {

    @Test
    fun create() {
        CustomChannelListParams.builder()
            .after("after")
            .defaultPageLength(0)
            .limit(0)
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomChannelListParams.builder()
                .after("after")
                .defaultPageLength(0)
                .limit(0)
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("defaultPageLength", "0")
                    .put("limit", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomChannelListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
