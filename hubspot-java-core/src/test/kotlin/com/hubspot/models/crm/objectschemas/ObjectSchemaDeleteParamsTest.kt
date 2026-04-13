// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objectschemas

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ObjectSchemaDeleteParamsTest {

    @Test
    fun create() {
        ObjectSchemaDeleteParams.builder().objectType("objectType").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = ObjectSchemaDeleteParams.builder().objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ObjectSchemaDeleteParams.builder().objectType("objectType").archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ObjectSchemaDeleteParams.builder().objectType("objectType").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
