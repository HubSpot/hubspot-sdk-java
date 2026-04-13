// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.events

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OccurrenceServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val occurrenceService = client.events().occurrences()

        val page = occurrenceService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventTypes() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val occurrenceService = client.events().occurrences()

        val visibleExternalEventTypeNames = occurrenceService.listEventTypes()

        visibleExternalEventTypeNames.validate()
    }
}
