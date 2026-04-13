// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.rows

import com.hubspot.sdk.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowGetDraftBatchParamsTest {

    @Test
    fun create() {
        RowGetDraftBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowGetDraftBatchParams.builder()
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
            RowGetDraftBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
