// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetGetParamsTest {

    @Test
    fun create() {
        BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
