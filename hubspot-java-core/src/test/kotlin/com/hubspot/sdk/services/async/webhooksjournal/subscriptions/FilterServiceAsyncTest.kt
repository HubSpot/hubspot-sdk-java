// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.webhooksjournal.subscriptions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.Condition
import com.hubspot.sdk.models.Filter
import com.hubspot.sdk.models.FilterCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FilterServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val filterServiceAsync = client.webhooksJournal().subscriptions().filters()

        val filterCreateResponseFuture =
            filterServiceAsync.create(
                FilterCreateRequest.builder()
                    .filter(
                        Filter.builder()
                            .addCondition(
                                Condition.builder()
                                    .filterType(Condition.FilterType.CRM_OBJECT_PROPERTY)
                                    .operator(Condition.Operator.CONTAINS)
                                    .property("property")
                                    .value("value")
                                    .addValue("string")
                                    .build()
                            )
                            .build()
                    )
                    .subscriptionId(0L)
                    .build()
            )

        val filterCreateResponse = filterCreateResponseFuture.get()
        filterCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val filterServiceAsync = client.webhooksJournal().subscriptions().filters()

        val filterResponsesFuture = filterServiceAsync.list(0L)

        val filterResponses = filterResponsesFuture.get()
        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val filterServiceAsync = client.webhooksJournal().subscriptions().filters()

        val future = filterServiceAsync.delete(0L)

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val filterServiceAsync = client.webhooksJournal().subscriptions().filters()

        val filterResponseFuture = filterServiceAsync.get(0L)

        val filterResponse = filterResponseFuture.get()
        filterResponse.validate()
    }
}
