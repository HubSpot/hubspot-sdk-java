// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooksubscriptions

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookSubscriptionGetJournalEarliestParamsTest {

    @Test
    fun create() {
        WebhookSubscriptionGetJournalEarliestParams.builder().installPortalId(0).build()
    }

    @Test
    fun queryParams() {
        val params =
            WebhookSubscriptionGetJournalEarliestParams.builder().installPortalId(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookSubscriptionGetJournalEarliestParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
