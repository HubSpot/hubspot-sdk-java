// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.automation.actions.definitions

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefinitionGetParamsTest {

    @Test
    fun create() {
        DefinitionGetParams.builder().appId(0).definitionId("definitionId").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = DefinitionGetParams.builder().appId(0).definitionId("definitionId").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("definitionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            DefinitionGetParams.builder()
                .appId(0)
                .definitionId("definitionId")
                .archived(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DefinitionGetParams.builder().appId(0).definitionId("definitionId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
