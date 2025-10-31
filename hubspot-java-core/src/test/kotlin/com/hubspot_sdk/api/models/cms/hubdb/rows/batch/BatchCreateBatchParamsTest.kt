// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows.batch

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateBatchParamsTest {

    @Test
    fun create() {
        BatchCreateBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputHubDbTableRowV3Request(
                BatchInputHubDbTableRowV3Request.builder()
                    .addInput(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .childTableId(0L)
                            .displayIndex(0)
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
            BatchCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .values(
                                    HubDbTableRowV3Request.Values.builder()
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
            BatchCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .values(
                                    HubDbTableRowV3Request.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
                                .childTableId(0L)
                                .displayIndex(0)
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
                BatchInputHubDbTableRowV3Request.builder()
                    .addInput(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .childTableId(0L)
                            .displayIndex(0)
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
            BatchCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .values(
                                    HubDbTableRowV3Request.Values.builder()
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
                BatchInputHubDbTableRowV3Request.builder()
                    .addInput(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
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
