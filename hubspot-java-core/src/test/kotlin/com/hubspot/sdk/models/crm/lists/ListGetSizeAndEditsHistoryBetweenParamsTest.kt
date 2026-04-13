// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListGetSizeAndEditsHistoryBetweenParamsTest {

    @Test
    fun create() {
        ListGetSizeAndEditsHistoryBetweenParams.builder()
            .listId("listId")
            .endDate("endDate")
            .startDate("startDate")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ListGetSizeAndEditsHistoryBetweenParams.builder().listId("listId").build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ListGetSizeAndEditsHistoryBetweenParams.builder()
                .listId("listId")
                .endDate("endDate")
                .startDate("startDate")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "endDate")
                    .put("startDate", "startDate")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListGetSizeAndEditsHistoryBetweenParams.builder().listId("listId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
