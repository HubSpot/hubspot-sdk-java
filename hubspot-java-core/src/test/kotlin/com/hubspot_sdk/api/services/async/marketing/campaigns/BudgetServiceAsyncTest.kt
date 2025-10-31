// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetItemInput
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BudgetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val future =
            budgetServiceAsync.delete(
                BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetItemFuture =
            budgetServiceAsync.get(
                BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        val publicBudgetItem = publicBudgetItemFuture.get()
        publicBudgetItem.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTotals() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val budgetServiceAsync = client.marketing().campaigns().budget()

        val publicBudgetTotalsFuture = budgetServiceAsync.getTotals("campaignGuid")

        val publicBudgetTotals = publicBudgetTotalsFuture.get()
        publicBudgetTotals.validate()
    }
}
