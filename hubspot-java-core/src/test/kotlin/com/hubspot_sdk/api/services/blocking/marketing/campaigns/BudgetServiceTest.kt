// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.campaigns

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.campaigns.PublicBudgetItemInput
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetCreateParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetDeleteParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetGetParams
import com.hubspot_sdk.api.models.marketing.campaigns.budget.BudgetUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BudgetServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val budgetService = client.marketing().campaigns().budget()

        budgetService.delete(
            BudgetDeleteParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetItem =
            budgetService.get(
                BudgetGetParams.builder().campaignGuid("campaignGuid").budgetId(0L).build()
            )

        publicBudgetItem.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getTotals() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val budgetService = client.marketing().campaigns().budget()

        val publicBudgetTotals = budgetService.getTotals("campaignGuid")

        publicBudgetTotals.validate()
    }
}
