// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.inboxes

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboxGetParamsTest {

    @Test
    fun create() {
        InboxGetParams.builder().inboxId(0).archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = InboxGetParams.builder().inboxId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = InboxGetParams.builder().inboxId(0).archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InboxGetParams.builder().inboxId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
