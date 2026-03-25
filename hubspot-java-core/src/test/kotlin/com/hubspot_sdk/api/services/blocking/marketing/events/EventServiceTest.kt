// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.marketing.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.marketing.events.MarketingEventCompleteRequestParams
import com.hubspot_sdk.api.models.marketing.events.events.EventCancelByExternalEventIdParams
import com.hubspot_sdk.api.models.marketing.events.events.EventCompleteByExternalEventIdParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancelByExternalEventId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventService = client.marketing().events().events()

        val marketingEventDefaultResponse =
            eventService.cancelByExternalEventId(
                EventCancelByExternalEventIdParams.builder()
                    .externalEventId("externalEventId")
                    .externalAccountId("externalAccountId")
                    .build()
            )

        marketingEventDefaultResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeByExternalEventId() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val eventService = client.marketing().events().events()

        val marketingEventDefaultResponse =
            eventService.completeByExternalEventId(
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

        marketingEventDefaultResponse.validate()
    }
}
