// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.leads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LeadDeleteParamsTest {

    @Test
    fun create() {
        LeadDeleteParams.builder().leadsId("leadsId").build()
    }

    @Test
    fun pathParams() {
        val params = LeadDeleteParams.builder().leadsId("leadsId").build()

        assertThat(params._pathParam(0)).isEqualTo("leadsId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
