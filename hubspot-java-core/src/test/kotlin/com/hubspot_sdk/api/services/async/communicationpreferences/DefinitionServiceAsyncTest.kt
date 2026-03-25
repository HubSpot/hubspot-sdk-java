// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.communicationpreferences

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.communicationpreferences.definitions.DefinitionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.communicationPreferences().definitions()

        val actionResponseWithResultsSubscriptionDefinitionFuture =
            definitionServiceAsync.list(
                DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()
            )

        val actionResponseWithResultsSubscriptionDefinition =
            actionResponseWithResultsSubscriptionDefinitionFuture.get()
        actionResponseWithResultsSubscriptionDefinition.validate()
    }
}
