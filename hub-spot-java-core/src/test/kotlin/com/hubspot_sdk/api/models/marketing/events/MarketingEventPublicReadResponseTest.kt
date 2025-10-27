// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicReadResponseTest {

    @Test
    fun create() {
        val marketingEventPublicReadResponse =
            MarketingEventPublicReadResponse.builder()
                .id("id")
                .attendees(0)
                .cancellations(0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .externalEventId("externalEventId")
                .noShows(0)
                .registrants(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(
                    PropertyValue.builder()
                        .name("")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .value("")
                        .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                        .isEncrypted(false)
                        .isLargeValue(true)
                        .persistenceTimestamp(0L)
                        .requestId("")
                        .selectedByUser(false)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.UNKNOWN)
                        .sourceId("")
                        .sourceLabel("")
                        .sourceMetadata("")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .build()
                )
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .objectId("objectId")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicReadResponse.id()).isEqualTo("id")
        assertThat(marketingEventPublicReadResponse.attendees()).isEqualTo(0)
        assertThat(marketingEventPublicReadResponse.cancellations()).isEqualTo(0)
        assertThat(marketingEventPublicReadResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponse.eventName()).isEqualTo("eventName")
        assertThat(marketingEventPublicReadResponse.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventPublicReadResponse.externalEventId()).isEqualTo("externalEventId")
        assertThat(marketingEventPublicReadResponse.noShows()).isEqualTo(0)
        assertThat(marketingEventPublicReadResponse.registrants()).isEqualTo(0)
        assertThat(marketingEventPublicReadResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponse.customProperties().getOrNull())
            .containsExactly(
                PropertyValue.builder()
                    .name("")
                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                    .value("")
                    .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                    .isEncrypted(false)
                    .isLargeValue(true)
                    .persistenceTimestamp(0L)
                    .requestId("")
                    .selectedByUser(false)
                    .selectedByUserTimestamp(0L)
                    .source(PropertyValue.Source.UNKNOWN)
                    .sourceId("")
                    .sourceLabel("")
                    .sourceMetadata("")
                    .addSourceVid(0L)
                    .timestamp(0L)
                    .unit("")
                    .updatedByUserId(0)
                    .useTimestampAsPersistenceTimestamp(true)
                    .build()
            )
        assertThat(marketingEventPublicReadResponse.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicReadResponse.eventCancelled()).contains(true)
        assertThat(marketingEventPublicReadResponse.eventCompleted()).contains(true)
        assertThat(marketingEventPublicReadResponse.eventDescription()).contains("eventDescription")
        assertThat(marketingEventPublicReadResponse.eventType()).contains("eventType")
        assertThat(marketingEventPublicReadResponse.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicReadResponse.objectId()).contains("objectId")
        assertThat(marketingEventPublicReadResponse.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicReadResponse =
            MarketingEventPublicReadResponse.builder()
                .id("id")
                .attendees(0)
                .cancellations(0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .externalEventId("externalEventId")
                .noShows(0)
                .registrants(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(
                    PropertyValue.builder()
                        .name("")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .value("")
                        .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                        .isEncrypted(false)
                        .isLargeValue(true)
                        .persistenceTimestamp(0L)
                        .requestId("")
                        .selectedByUser(false)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.UNKNOWN)
                        .sourceId("")
                        .sourceLabel("")
                        .sourceMetadata("")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .build()
                )
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .objectId("objectId")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicReadResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicReadResponse),
                jacksonTypeRef<MarketingEventPublicReadResponse>(),
            )

        assertThat(roundtrippedMarketingEventPublicReadResponse)
            .isEqualTo(marketingEventPublicReadResponse)
    }
}
