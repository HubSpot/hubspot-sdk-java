// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.communicationpreferences

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.communicationpreferences.definitions.DefinitionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
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
