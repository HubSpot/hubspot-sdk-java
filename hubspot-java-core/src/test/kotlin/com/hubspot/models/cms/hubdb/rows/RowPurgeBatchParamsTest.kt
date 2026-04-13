// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import com.hubspot.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowPurgeBatchParamsTest {

    @Test
    fun create() {
        RowPurgeBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowPurgeBatchParams.builder()
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
            RowPurgeBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
