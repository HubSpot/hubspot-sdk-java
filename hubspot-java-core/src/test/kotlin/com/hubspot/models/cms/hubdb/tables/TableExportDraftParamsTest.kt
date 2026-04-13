// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.tables

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableExportDraftParamsTest {

    @Test
    fun create() {
        TableExportDraftParams.builder().tableIdOrName("tableIdOrName").format("format").build()
    }

    @Test
    fun pathParams() {
        val params = TableExportDraftParams.builder().tableIdOrName("tableIdOrName").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TableExportDraftParams.builder().tableIdOrName("tableIdOrName").format("format").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("format", "format").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TableExportDraftParams.builder().tableIdOrName("tableIdOrName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
