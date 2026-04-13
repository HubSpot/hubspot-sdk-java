// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListGetIdMappingParamsTest {

    @Test
    fun create() {
        ListGetIdMappingParams.builder().legacyListId("legacyListId").build()
    }

    @Test
    fun queryParams() {
        val params = ListGetIdMappingParams.builder().legacyListId("legacyListId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("legacyListId", "legacyListId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListGetIdMappingParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
