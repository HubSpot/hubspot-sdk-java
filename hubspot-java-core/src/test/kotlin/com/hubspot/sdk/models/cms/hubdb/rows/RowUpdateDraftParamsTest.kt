// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.rows

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.hubdb.HubDbTableRowV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowUpdateDraftParamsTest {

    @Test
    fun create() {
        RowUpdateDraftParams.builder()
            .tableIdOrName("tableIdOrName")
            .rowId("321669910225")
            .hubDbTableRowV3Request(
                HubDbTableRowV3Request.builder()
                    .childTableId(0L)
                    .displayIndex(0)
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .path("path")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
                        .childTableId(0L)
                        .displayIndex(0)
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        assertThat(params._pathParam(1)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RowUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
                        .childTableId(0L)
                        .displayIndex(0)
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableRowV3Request.builder()
                    .childTableId(0L)
                    .displayIndex(0)
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .path("path")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RowUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
                        .childTableId(0L)
                        .displayIndex(0)
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableRowV3Request.builder()
                    .childTableId(0L)
                    .displayIndex(0)
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
    }
}
