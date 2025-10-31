// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormGetParamsTest {

    @Test
    fun create() {
        FormGetParams.builder().formId("formId").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = FormGetParams.builder().formId("formId").build()

        assertThat(params._pathParam(0)).isEqualTo("formId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = FormGetParams.builder().formId("formId").archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FormGetParams.builder().formId("formId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
