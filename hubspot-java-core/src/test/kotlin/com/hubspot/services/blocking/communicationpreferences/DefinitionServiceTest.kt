// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.communicationpreferences

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.communicationpreferences.definitions.DefinitionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.communicationPreferences().definitions()

        val actionResponseWithResultsSubscriptionDefinition =
            definitionService.list(
                DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()
            )

        actionResponseWithResultsSubscriptionDefinition.validate()
    }
}
