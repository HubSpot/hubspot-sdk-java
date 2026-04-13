// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.rows

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.hubdb.BatchInputHubDbTableRowV3Request
import com.hubspot.sdk.models.cms.hubdb.HubDbTableRowV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowCreateBatchParamsTest {

    @Test
    fun create() {
        RowCreateBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputHubDbTableRowV3Request(
                BatchInputHubDbTableRowV3Request.builder()
                    .addInput(
                        HubDbTableRowV3Request.builder()
                            .childTableId(0L)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
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
            RowCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .childTableId(0L)
                                .displayIndex(0)
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
            RowCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .childTableId(0L)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3Request.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf<String, Any>()),
                                        )
                                        .build()
                                )
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
                            .childTableId(0L)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
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
            RowCreateBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3Request(
                    BatchInputHubDbTableRowV3Request.builder()
                        .addInput(
                            HubDbTableRowV3Request.builder()
                                .childTableId(0L)
                                .displayIndex(0)
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
                            .childTableId(0L)
                            .displayIndex(0)
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
