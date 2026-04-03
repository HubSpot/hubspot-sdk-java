// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicDefaultResponseV2Test {

    @Test
    fun create() {
        val marketingEventPublicDefaultResponseV2 =
            MarketingEventPublicDefaultResponseV2.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(CrmPropertyWrapper.builder().name("name").value("value").build())
                .eventName("eventName")
                .objectId("objectId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicDefaultResponseV2.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponseV2.customProperties())
            .containsExactly(CrmPropertyWrapper.builder().name("name").value("value").build())
        assertThat(marketingEventPublicDefaultResponseV2.eventName()).isEqualTo("eventName")
        assertThat(marketingEventPublicDefaultResponseV2.objectId()).isEqualTo("objectId")
        assertThat(marketingEventPublicDefaultResponseV2.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponseV2.appInfo())
            .contains(AppInfo.builder().id("id").name("name").build())
        assertThat(marketingEventPublicDefaultResponseV2.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponseV2.eventCancelled()).contains(true)
        assertThat(marketingEventPublicDefaultResponseV2.eventCompleted()).contains(true)
        assertThat(marketingEventPublicDefaultResponseV2.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventPublicDefaultResponseV2.eventOrganizer())
            .contains("eventOrganizer")
        assertThat(marketingEventPublicDefaultResponseV2.eventType()).contains("eventType")
        assertThat(marketingEventPublicDefaultResponseV2.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicDefaultResponseV2.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicDefaultResponseV2 =
            MarketingEventPublicDefaultResponseV2.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(CrmPropertyWrapper.builder().name("name").value("value").build())
                .eventName("eventName")
                .objectId("objectId")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .appInfo(AppInfo.builder().id("id").name("name").build())
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicDefaultResponseV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicDefaultResponseV2),
                jacksonTypeRef<MarketingEventPublicDefaultResponseV2>(),
            )

        assertThat(roundtrippedMarketingEventPublicDefaultResponseV2)
            .isEqualTo(marketingEventPublicDefaultResponseV2)
    }
}
