// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.rows

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import com.hubspot.sdk.models.cms.hubdb.HubDbTableRowV3BatchUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowReplaceBatchParamsTest {

    @Test
    fun create() {
        RowReplaceBatchParams.builder()
            .tableIdOrName("tableIdOrName")
            .batchInputHubDbTableRowV3BatchUpdateRequest(
                BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                    .addInput(
                        HubDbTableRowV3BatchUpdateRequest.builder()
                            .childTableId(0L)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
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
            RowReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0L)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
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
            RowReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0L)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
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
                            .childTableId(0L)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
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
            RowReplaceBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputHubDbTableRowV3BatchUpdateRequest(
                    BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                        .addInput(
                            HubDbTableRowV3BatchUpdateRequest.builder()
                                .childTableId(0L)
                                .displayIndex(0)
                                .values(
                                    HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(mapOf("foo" to "bar")),
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
                            .childTableId(0L)
                            .displayIndex(0)
                            .values(
                                HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf("foo" to "bar")),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
    }
}
