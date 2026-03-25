// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetGetTotalsParamsTest {

    @Test
    fun create() {
        BudgetGetTotalsParams.builder().campaignGuid("campaignGuid").build()
    }

    @Test
    fun pathParams() {
        val params = BudgetGetTotalsParams.builder().campaignGuid("campaignGuid").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
