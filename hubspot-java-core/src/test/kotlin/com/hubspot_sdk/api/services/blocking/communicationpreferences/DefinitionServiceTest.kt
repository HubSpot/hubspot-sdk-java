// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.communicationpreferences

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.communicationpreferences.definitions.DefinitionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionService = client.communicationPreferences().definitions()

        val actionResponseWithResultsSubscriptionDefinition =
            definitionService.list(
                DefinitionListParams.builder().businessUnitId(0L).includeTranslations(true).build()
            )

        actionResponseWithResultsSubscriptionDefinition.validate()
    }
}
