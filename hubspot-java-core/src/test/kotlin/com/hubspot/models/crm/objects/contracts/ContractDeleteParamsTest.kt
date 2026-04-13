// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.objects.contracts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractDeleteParamsTest {

    @Test
    fun create() {
        ContractDeleteParams.builder().contractId("contractId").build()
    }

    @Test
    fun pathParams() {
        val params = ContractDeleteParams.builder().contractId("contractId").build()

        assertThat(params._pathParam(0)).isEqualTo("contractId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
