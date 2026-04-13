// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetLatestJournalParamsTest {

    @Test
    fun create() {
        WebhookGetLatestJournalParams.builder().installPortalId(0).build()
    }

    @Test
    fun queryParams() {
        val params = WebhookGetLatestJournalParams.builder().installPortalId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookGetLatestJournalParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
