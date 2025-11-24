// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanCalculatedValues
import com.hubspot_sdk.api.models.cms.mediabridge.AttentionSpanEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedEventRequest
import com.hubspot_sdk.api.models.cms.mediabridge.MediaPlayedPercentageEventRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun createAttentionSpanEvent() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.cms().mediaBridge().events()

        val attentionSpanEvent =
            eventService.createAttentionSpanEvent(
                AttentionSpanEventRequest.builder()
                    .mediaType(AttentionSpanEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .rawDataMap(
                        AttentionSpanEventRequest.RawDataMap.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .derivedValues(
                        AttentionSpanCalculatedValues.builder()
                            .totalPercentPlayed(0.0)
                            .totalSecondsPlayed(0)
                            .build()
                    )
                    .externalId("externalId")
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .rawDataString("rawDataString")
                    .build()
            )

        attentionSpanEvent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createMediaPlayedEvent() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.cms().mediaBridge().events()

        val mediaPlayedEvent =
            eventService.createMediaPlayedEvent(
                MediaPlayedEventRequest.builder()
                    .mediaType(MediaPlayedEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .sessionId("sessionId")
                    .state(MediaPlayedEventRequest.State.STARTED)
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .iframeUrl("iframeUrl")
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .build()
            )

        mediaPlayedEvent.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createMediaPlayedPercentEvent() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventService = client.cms().mediaBridge().events()

        val mediaPlayedPercentageEvent =
            eventService.createMediaPlayedPercentEvent(
                MediaPlayedPercentageEventRequest.builder()
                    .mediaType(MediaPlayedPercentageEventRequest.MediaType.AUDIO)
                    .occurredTimestamp(0L)
                    .playedPercent(0)
                    .sessionId("sessionId")
                    ._hsenc("_hsenc")
                    .contactId(0L)
                    .contactUtk("contactUtk")
                    .externalId("externalId")
                    .mediaBridgeId(0L)
                    .mediaName("mediaName")
                    .mediaUrl("mediaUrl")
                    .pageId(0L)
                    .pageName("pageName")
                    .pageUrl("pageUrl")
                    .build()
            )

        mediaPlayedPercentageEvent.validate()
    }
}
