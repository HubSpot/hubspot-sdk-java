// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.tables

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableResetDraftParamsTest {

    @Test
    fun create() {
        TableResetDraftParams.builder()
            .tableIdOrName("tableIdOrName")
            .includeForeignIds(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TableResetDraftParams.builder().tableIdOrName("tableIdOrName").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TableResetDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .includeForeignIds(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("includeForeignIds", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TableResetDraftParams.builder().tableIdOrName("tableIdOrName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
