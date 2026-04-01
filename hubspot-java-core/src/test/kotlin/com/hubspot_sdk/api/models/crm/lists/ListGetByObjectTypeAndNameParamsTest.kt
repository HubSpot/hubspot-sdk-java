// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListGetByObjectTypeAndNameParamsTest {

    @Test
    fun create() {
        ListGetByObjectTypeAndNameParams.builder()
            .objectTypeId("objectTypeId")
            .listName("listName")
            .includeFilters(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ListGetByObjectTypeAndNameParams.builder()
                .objectTypeId("objectTypeId")
                .listName("listName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("objectTypeId")
        assertThat(params._pathParam(1)).isEqualTo("listName")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ListGetByObjectTypeAndNameParams.builder()
                .objectTypeId("objectTypeId")
                .listName("listName")
                .includeFilters(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("includeFilters", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            ListGetByObjectTypeAndNameParams.builder()
                .objectTypeId("objectTypeId")
                .listName("listName")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
