// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.hubdb.rows

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RowListParamsTest {

    @Test
    fun create() {
        RowListParams.builder()
            .tableIdOrName("tableIdOrName")
            .after("after")
            .archived(true)
            .limit(0)
            .offset(0)
            .addProperty("string")
            .addSort("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = RowListParams.builder().tableIdOrName("tableIdOrName").build()

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            RowListParams.builder()
                .tableIdOrName("tableIdOrName")
                .after("after")
                .archived(true)
                .limit(0)
                .offset(0)
                .addProperty("string")
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("archived", "true")
                    .put("limit", "0")
                    .put("offset", "0")
                    .put("properties", listOf("string").joinToString(","))
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RowListParams.builder().tableIdOrName("tableIdOrName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
