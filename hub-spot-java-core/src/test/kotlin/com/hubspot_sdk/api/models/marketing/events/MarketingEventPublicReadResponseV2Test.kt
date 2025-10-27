// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicReadResponseV2Test {

    @Test
    fun create() {
        val marketingEventPublicReadResponseV2 =
            MarketingEventPublicReadResponseV2.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(CrmPropertyWrapper.builder().name("name").value("value").build())
                .eventName("eventName")
                .objectId("objectId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .attendees(0)
                .cancellations(0)
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventOrganizer("eventOrganizer")
                .eventStatus("eventStatus")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .externalEventId("externalEventId")
                .noShows(0)
                .registrants(0)
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicReadResponseV2.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponseV2.customProperties())
            .containsExactly(CrmPropertyWrapper.builder().name("name").value("value").build())
        assertThat(marketingEventPublicReadResponseV2.eventName()).isEqualTo("eventName")
        assertThat(marketingEventPublicReadResponseV2.objectId()).isEqualTo("objectId")
        assertThat(marketingEventPublicReadResponseV2.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponseV2.appInfo())
            .contains(AppInfo.builder().id("id").name("name").build())
        assertThat(marketingEventPublicReadResponseV2.attendees()).contains(0)
        assertThat(marketingEventPublicReadResponseV2.cancellations()).contains(0)
        assertThat(marketingEventPublicReadResponseV2.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponseV2.eventCancelled()).contains(true)
        assertThat(marketingEventPublicReadResponseV2.eventCompleted()).contains(true)
        assertThat(marketingEventPublicReadResponseV2.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventPublicReadResponseV2.eventOrganizer()).contains("eventOrganizer")
        assertThat(marketingEventPublicReadResponseV2.eventStatus()).contains("eventStatus")
        assertThat(marketingEventPublicReadResponseV2.eventType()).contains("eventType")
        assertThat(marketingEventPublicReadResponseV2.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicReadResponseV2.externalEventId()).contains("externalEventId")
        assertThat(marketingEventPublicReadResponseV2.noShows()).contains(0)
        assertThat(marketingEventPublicReadResponseV2.registrants()).contains(0)
        assertThat(marketingEventPublicReadResponseV2.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicReadResponseV2 =
            MarketingEventPublicReadResponseV2.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(CrmPropertyWrapper.builder().name("name").value("value").build())
                .eventName("eventName")
                .objectId("objectId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .attendees(0)
                .cancellations(0)
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventOrganizer("eventOrganizer")
                .eventStatus("eventStatus")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .externalEventId("externalEventId")
                .noShows(0)
                .registrants(0)
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicReadResponseV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicReadResponseV2),
                jacksonTypeRef<MarketingEventPublicReadResponseV2>(),
            )

        assertThat(roundtrippedMarketingEventPublicReadResponseV2)
            .isEqualTo(marketingEventPublicReadResponseV2)
    }
}
