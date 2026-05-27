// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.webhooksjournal.subscriptions

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.Condition
import com.hubspot.sdk.models.Filter
import com.hubspot.sdk.models.FilterCreateRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FilterServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val filterService = client.webhooksJournal().subscriptions().filters()

        val filterCreateResponse =
            filterService.create(
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

        filterCreateResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val filterService = client.webhooksJournal().subscriptions().filters()

        val filterResponses = filterService.list(0L)

        filterResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val filterService = client.webhooksJournal().subscriptions().filters()

        filterService.delete(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val filterService = client.webhooksJournal().subscriptions().filters()

        val filterResponse = filterService.get(0L)

        filterResponse.validate()
    }
}
