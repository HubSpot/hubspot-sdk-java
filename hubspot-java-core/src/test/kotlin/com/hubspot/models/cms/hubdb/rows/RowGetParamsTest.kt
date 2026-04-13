// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowGetParamsTest {

    @Test
    fun create() {
        RowGetParams.builder()
            .tableIdOrName("tableIdOrName")
            .rowId("321669910225")
            .archived(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RowGetParams.builder().tableIdOrName("tableIdOrName").rowId("321669910225").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        assertThat(params._pathParam(1)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RowGetParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .archived(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            RowGetParams.builder().tableIdOrName("tableIdOrName").rowId("321669910225").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
