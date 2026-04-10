// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetItemInput
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetItem =
            budgetService.create(
                BudgetCreateParams.builder()
                    .campaignGuid("campaignGuid")
                    .publicBudgetItemInput(
                        PublicBudgetItemInput.builder()
                            .amount(0.0)
                            .name("name")
                            .order(0)
                            .description("description")
                            .build()
                    )
                    .build()
            )

        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetItem =
            budgetService.update(
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
            )

        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val budgetService = client.marketing().campaigns().budget()

        budgetService.delete(
            BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetItem =
            budgetService.get(
                BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTotals() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetTotals = budgetService.getTotals("campaignGuid")

        publicBudgetTotals.validate()
    }
}
