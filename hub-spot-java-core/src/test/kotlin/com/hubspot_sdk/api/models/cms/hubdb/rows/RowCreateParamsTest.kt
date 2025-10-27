// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowCreateParamsTest {

    @Test
    fun create() {
        RowCreateParams.builder()
            .tableIdOrName("tableIdOrName")
            .hubDbTableRowV3Request(
                HubDbTableRowV3Request.builder()
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .childTableId(0L)
                    .displayIndex(0)
                    .name("name")
                    .path("path")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowCreateParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
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
            RowCreateParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
                        .values(
                            HubDbTableRowV3Request.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .childTableId(0L)
                        .displayIndex(0)
                        .name("name")
                        .path("path")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableRowV3Request.builder()
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .childTableId(0L)
                    .displayIndex(0)
                    .name("name")
                    .path("path")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RowCreateParams.builder()
                .tableIdOrName("tableIdOrName")
                .hubDbTableRowV3Request(
                    HubDbTableRowV3Request.builder()
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
                    .values(
                        HubDbTableRowV3Request.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
    }
}
