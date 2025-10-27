// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.mapping

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MappingGetIdMappingParamsTest {

    @Test
    fun create() {
        MappingGetIdMappingParams.builder().legacyListId("legacyListId").build()
    }

    @Test
    fun queryParams() {
        val params = MappingGetIdMappingParams.builder().legacyListId("legacyListId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("legacyListId", "legacyListId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MappingGetIdMappingParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
