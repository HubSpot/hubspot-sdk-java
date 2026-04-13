// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.webhooks

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetJournalBatchAfterOffsetParamsTest {

    @Test
    fun create() {
        WebhookGetJournalBatchAfterOffsetParams.builder()
            .offset("offset")
            .count(1)
            .installPortalId(0)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WebhookGetJournalBatchAfterOffsetParams.builder().offset("offset").count(1).build()

        assertThat(params._pathParam(0)).isEqualTo("offset")
        assertThat(params._pathParam(1)).isEqualTo("1")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            WebhookGetJournalBatchAfterOffsetParams.builder()
                .offset("offset")
                .count(1)
                .installPortalId(0)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            WebhookGetJournalBatchAfterOffsetParams.builder().offset("offset").count(1).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
