// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OccurrenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val occurrenceService = client.events().occurrences()

        val page = occurrenceService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventTypes() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val occurrenceService = client.events().occurrences()

        val visibleExternalEventTypeNames = occurrenceService.listEventTypes()

        visibleExternalEventTypeNames.validate()
    }
}
