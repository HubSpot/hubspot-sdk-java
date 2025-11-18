// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.inboxes

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxListParamsTest {

    @Test
    fun create() {
        InboxListParams.builder()
            .after("after")
            .archived(true)
            .defaultPageLength(0)
            .limit(0)
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InboxListParams.builder()
                .after("after")
                .archived(true)
                .defaultPageLength(0)
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
                    .put("limit", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboxListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
