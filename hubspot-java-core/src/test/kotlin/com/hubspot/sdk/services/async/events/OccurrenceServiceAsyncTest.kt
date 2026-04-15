// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.events

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OccurrenceServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val occurrenceServiceAsync = client.events().occurrences()

        val pageFuture = occurrenceServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventTypes() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val occurrenceServiceAsync = client.events().occurrences()

        val visibleExternalEventTypeNamesFuture = occurrenceServiceAsync.listEventTypes()

        val visibleExternalEventTypeNames = visibleExternalEventTypeNamesFuture.get()
        visibleExternalEventTypeNames.validate()
    }
}
