// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.subscriptions.v4

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.definitions.DefinitionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DefinitionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionServiceAsync = client.marketing().subscriptions().v4().definitions()

        val actionResponseWithResultsSubscriptionDefinitionFuture =
            definitionServiceAsync.list(
                DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()
            )

        val actionResponseWithResultsSubscriptionDefinition =
            actionResponseWithResultsSubscriptionDefinitionFuture.get()
        actionResponseWithResultsSubscriptionDefinition.validate()
    }
}
