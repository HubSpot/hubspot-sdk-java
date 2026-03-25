// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects.companies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyDeleteParamsTest {

    @Test
    fun create() {
        CompanyDeleteParams.builder().companyId("companyId").build()
    }

    @Test
    fun pathParams() {
        val params = CompanyDeleteParams.builder().companyId("companyId").build()

        assertThat(params._pathParam(0)).isEqualTo("companyId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
