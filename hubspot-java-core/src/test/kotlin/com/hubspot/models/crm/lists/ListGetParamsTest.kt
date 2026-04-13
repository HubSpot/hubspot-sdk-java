// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListGetParamsTest {

    @Test
    fun create() {
        ListGetParams.builder().listId("listId").includeFilters(true).build()
    }

    @Test
    fun pathParams() {
        val params = ListGetParams.builder().listId("listId").build()

        assertThat(params._pathParam(0)).isEqualTo("listId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = ListGetParams.builder().listId("listId").includeFilters(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("includeFilters", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListGetParams.builder().listId("listId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
