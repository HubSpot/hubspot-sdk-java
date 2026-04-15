// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.campaigns.budget

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetDeleteParamsTest {

    @Test
    fun create() {
        BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
    }

    @Test
    fun pathParams() {
        val params = BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
