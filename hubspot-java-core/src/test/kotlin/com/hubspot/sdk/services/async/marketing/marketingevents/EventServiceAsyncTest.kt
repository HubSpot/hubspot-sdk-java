// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.marketing.marketingevents

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.marketing.marketingevents.MarketingEventCompleteRequestParams
import com.hubspot.sdk.models.marketing.marketingevents.events.EventCancelByExternalEventIdParams
import com.hubspot.sdk.models.marketing.marketingevents.events.EventCompleteByExternalEventIdParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelByExternalEventId() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val eventServiceAsync = client.marketing().marketingEvents().events()

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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val eventServiceAsync = client.marketing().marketingEvents().events()

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
