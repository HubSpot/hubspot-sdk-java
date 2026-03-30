// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.rows

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowCloneDraftParamsTest {

    @Test
    fun create() {
        RowCloneDraftParams.builder()
            .tableIdOrName("tableIdOrName")
            .rowId("321669910225")
            .name("name")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        assertThat(params._pathParam(1)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RowCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .name("name")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("name", "name").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RowCloneDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
