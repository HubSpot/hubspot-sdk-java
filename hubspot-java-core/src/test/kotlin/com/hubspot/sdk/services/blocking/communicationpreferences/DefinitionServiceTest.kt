// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.communicationpreferences

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.communicationpreferences.definitions.DefinitionListParams
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
