// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.webhooks

import com.hubspot.core.http.QueryParams
import com.hubspot.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookGetLocalJournalBatchParamsTest {

    @Test
    fun create() {
        WebhookGetLocalJournalBatchParams.builder()
            .installPortalId(0)
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WebhookGetLocalJournalBatchParams.builder()
                .installPortalId(0)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("installPortalId", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            WebhookGetLocalJournalBatchParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            WebhookGetLocalJournalBatchParams.builder()
                .installPortalId(0)
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WebhookGetLocalJournalBatchParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
