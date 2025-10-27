// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.campaigns.budget

import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetItemInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BudgetUpdateParamsTest {

    @Test
    fun create() {
        BudgetUpdateParams.builder()
            .campaignGuid("campaignGuid")
            .budgetId(0L)
            .publicBudgetItemInput(
                PublicBudgetItemInput.builder()
                    .amount(0.0)
                    .name("name")
                    .order(0)
                    .description("description")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BudgetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .budgetId(0L)
                .publicBudgetItemInput(
                    PublicBudgetItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("campaignGuid")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BudgetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .budgetId(0L)
                .publicBudgetItemInput(
                    PublicBudgetItemInput.builder()
                        .amount(0.0)
                        .name("name")
                        .order(0)
                        .description("description")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicBudgetItemInput.builder()
                    .amount(0.0)
                    .name("name")
                    .order(0)
                    .description("description")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BudgetUpdateParams.builder()
                .campaignGuid("campaignGuid")
                .budgetId(0L)
                .publicBudgetItemInput(
                    PublicBudgetItemInput.builder().amount(0.0).name("name").order(0).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(PublicBudgetItemInput.builder().amount(0.0).name("name").order(0).build())
    }
}
