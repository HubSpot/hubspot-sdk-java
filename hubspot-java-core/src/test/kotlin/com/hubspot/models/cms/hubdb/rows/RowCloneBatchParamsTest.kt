// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import com.hubspot.models.cms.hubdb.BatchInputHubDbTableRowBatchCloneRequest
import com.hubspot.models.cms.hubdb.HubDbTableRowBatchCloneRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowCloneBatchParamsTest {

    @Test
    fun create() {
        RowCloneBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputHubDbTableRowBatchCloneRequest(
                BatchInputHubDbTableRowBatchCloneRequest.builder()
                    .addInput(
                        HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowCloneBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowBatchCloneRequest(
                    BatchInputHubDbTableRowBatchCloneRequest.builder()
                        .addInput(HubDbTableRowBatchCloneRequest.builder().id("id").build())
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RowCloneBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowBatchCloneRequest(
                    BatchInputHubDbTableRowBatchCloneRequest.builder()
                        .addInput(
                            HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputHubDbTableRowBatchCloneRequest.builder()
                    .addInput(
                        HubDbTableRowBatchCloneRequest.builder().id("id").name("name").build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RowCloneBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowBatchCloneRequest(
                    BatchInputHubDbTableRowBatchCloneRequest.builder()
                        .addInput(HubDbTableRowBatchCloneRequest.builder().id("id").build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputHubDbTableRowBatchCloneRequest.builder()
                    .addInput(HubDbTableRowBatchCloneRequest.builder().id("id").build())
                    .build()
            )
    }
}
