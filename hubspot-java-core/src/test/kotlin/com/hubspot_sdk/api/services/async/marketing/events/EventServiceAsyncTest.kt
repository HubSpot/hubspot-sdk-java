// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.marketing.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCompleteRequestParams
import com.hubspot_sdk.api.models.marketing.events.events.EventCancelByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.events.EventCompleteByExternalEventIdParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val eventServiceAsync = client.marketing().events().events()

        val marketingEventDefaultResponseFuture =
            eventServiceAsync.cancelByExternalEventId(
                EventCancelByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        val marketingEventDefaultResponse = marketingEventDefaultResponseFuture.get()
        marketingEventDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeByExternalEventId() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val eventServiceAsync = client.marketing().events().events()

        val marketingEventDefaultResponseFuture =
            eventServiceAsync.completeByExternalEventId(
                EventCompleteByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .marketingEventCompleteRequestParams(
                        MarketingEventCompleteRequestParams.builder()
                            .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val marketingEventDefaultResponse = marketingEventDefaultResponseFuture.get()
        marketingEventDefaultResponse.validate()
    }
}
