// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableGetParamsTest {

    @Test
    fun create() {
        TableGetParams.builder()
            .tableIdOrName("tableIdOrName")
            .archived(true)
            .includeForeignIds(true)
            .isGetLocalizedSchema(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = TableGetParams.builder().tableIdOrName("tableIdOrName").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            TableGetParams.builder()
                .tableIdOrName("tableIdOrName")
                .archived(true)
                .includeForeignIds(true)
                .isGetLocalizedSchema(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("includeForeignIds", "true")
                    .put("isGetLocalizedSchema", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TableGetParams.builder().tableIdOrName("tableIdOrName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
