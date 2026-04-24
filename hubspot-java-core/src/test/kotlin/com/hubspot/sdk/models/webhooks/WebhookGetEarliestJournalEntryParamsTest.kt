// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetEarliestJournalEntryParamsTest {

    @Test
    fun create() {
        WebhookGetEarliestJournalEntryParams.builder().installPortalId(0).build()
    }

    @Test
    fun queryParams() {
        val params = WebhookGetEarliestJournalEntryParams.builder().installPortalId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookGetEarliestJournalEntryParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
