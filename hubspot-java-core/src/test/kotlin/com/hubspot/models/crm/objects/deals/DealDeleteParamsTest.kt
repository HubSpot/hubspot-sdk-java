// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.deals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DealDeleteParamsTest {

    @Test
    fun create() {
        DealDeleteParams.builder().dealId("dealId").build()
    }

    @Test
    fun pathParams() {
        val params = DealDeleteParams.builder().dealId("dealId").build()

        assertThat(params._pathParam(0)).isEqualTo("dealId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
