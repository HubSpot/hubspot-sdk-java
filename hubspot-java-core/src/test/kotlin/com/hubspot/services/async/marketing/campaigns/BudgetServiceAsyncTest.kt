// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.marketing.campaigns

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.marketing.campaigns.PublicBudgetItemInput
import com.hubspot.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot.models.marketing.campaigns.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class BudgetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetItemFuture =
            budgetServiceAsync.create(
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

        val publicBudgetItem = publicBudgetItemFuture.get()
        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetItemFuture =
            budgetServiceAsync.update(
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

        val publicBudgetItem = publicBudgetItemFuture.get()
        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val future =
            budgetServiceAsync.delete(
                BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetItemFuture =
            budgetServiceAsync.get(
                BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        val publicBudgetItem = publicBudgetItemFuture.get()
        publicBudgetItem.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getTotals() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetTotalsFuture = budgetServiceAsync.getTotals("campaignGuid")

        val publicBudgetTotals = publicBudgetTotalsFuture.get()
        publicBudgetTotals.validate()
    }
}
