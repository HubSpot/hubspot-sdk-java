// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.emails

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailDeleteParamsTest {

    @Test
    fun create() {
        EmailDeleteParams.builder().emailId("emailId").archived(true).build()
    }

    @Test
    fun pathParams() {
        val params = EmailDeleteParams.builder().emailId("emailId").build()

        assertThat(params._pathParam(0)).isEqualTo("emailId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = EmailDeleteParams.builder().emailId("emailId").archived(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = EmailDeleteParams.builder().emailId("emailId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
