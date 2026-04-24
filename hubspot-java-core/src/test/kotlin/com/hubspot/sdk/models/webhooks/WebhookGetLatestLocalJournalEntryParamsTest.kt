// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetLatestLocalJournalEntryParamsTest {

    @Test
    fun create() {
        WebhookGetLatestLocalJournalEntryParams.builder().installPortalId(0).build()
    }

    @Test
    fun queryParams() {
        val params = WebhookGetLatestLocalJournalEntryParams.builder().installPortalId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookGetLatestLocalJournalEntryParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
