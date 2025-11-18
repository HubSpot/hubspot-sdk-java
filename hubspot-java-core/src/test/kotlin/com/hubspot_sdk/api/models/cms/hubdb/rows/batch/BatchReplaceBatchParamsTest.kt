// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3BatchUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchReplaceBatchParamsTest {

    @Test
    fun create() {
        BatchReplaceBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputHubDbTableRowV3BatchUpdateRequest(
                BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                    .addInput(
                        HubDbTableRowV3BatchUpdateRequest.builder()
                            .childTableId(0)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .id("id")
                            .name("name")
                            .path("path")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BatchReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
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
            BatchReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .id("id")
                                .name("name")
                                .path("path")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                    .addInput(
                        HubDbTableRowV3BatchUpdateRequest.builder()
                            .childTableId(0)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .id("id")
                            .name("name")
                            .path("path")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                    .addInput(
                        HubDbTableRowV3BatchUpdateRequest.builder()
                            .childTableId(0)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
