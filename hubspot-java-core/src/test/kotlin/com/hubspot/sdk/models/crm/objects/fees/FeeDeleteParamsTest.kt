// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects.fees

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FeeDeleteParamsTest {

    @Test
    fun create() {
        FeeDeleteParams.builder().feeId("feeId").build()
    }

    @Test
    fun pathParams() {
        val params = FeeDeleteParams.builder().feeId("feeId").build()

        assertThat(params._pathParam(0)).isEqualTo("feeId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
