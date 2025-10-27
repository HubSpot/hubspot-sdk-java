// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows.batch

import com.hubspot_sdk.api.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchGetDraftBatchParamsTest {

    @Test
    fun create() {
        BatchGetDraftBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchGetDraftBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BatchGetDraftBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
