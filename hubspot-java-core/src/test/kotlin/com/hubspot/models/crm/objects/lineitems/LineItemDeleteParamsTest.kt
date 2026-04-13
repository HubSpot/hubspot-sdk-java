// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.lineitems

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LineItemDeleteParamsTest {

    @Test
    fun create() {
        LineItemDeleteParams.builder().lineItemId("lineItemId").build()
    }

    @Test
    fun pathParams() {
        val params = LineItemDeleteParams.builder().lineItemId("lineItemId").build()

        assertThat(params._pathParam(0)).isEqualTo("lineItemId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
