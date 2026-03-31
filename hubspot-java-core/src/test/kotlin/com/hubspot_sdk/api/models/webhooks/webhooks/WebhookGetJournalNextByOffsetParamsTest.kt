// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.webhooks.webhooks

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetJournalNextByOffsetParamsTest {

    @Test
    fun create() {
        WebhookGetJournalNextByOffsetParams.builder().offset("offset").installPortalId(0).build()
    }

    @Test
    fun pathParams() {
        val params = WebhookGetJournalNextByOffsetParams.builder().offset("offset").build()

        assertThat(params._pathParam(0)).isEqualTo("offset")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WebhookGetJournalNextByOffsetParams.builder()
                .offset("offset")
                .installPortalId(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WebhookGetJournalNextByOffsetParams.builder().offset("offset").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
