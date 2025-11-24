// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicDefaultResponseTest {

    @Test
    fun create() {
        val marketingEventPublicDefaultResponse =
            MarketingEventPublicDefaultResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.ACADEMY)
                        .sourceId("sourceId")
                        .sourceLabel("sourceLabel")
                        .sourceMetadata("sourceMetadata")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("unit")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .value("value")
                        .build()
                )
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .objectId("objectId")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicDefaultResponse.id()).isEqualTo("id")
        assertThat(marketingEventPublicDefaultResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponse.customProperties())
            .containsExactly(
                PropertyValue.builder()
                    .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                    .isEncrypted(true)
                    .isLargeValue(true)
                    .name("name")
                    .persistenceTimestamp(0L)
                    .requestId("requestId")
                    .selectedByUser(true)
                    .selectedByUserTimestamp(0L)
                    .source(PropertyValue.Source.ACADEMY)
                    .sourceId("sourceId")
                    .sourceLabel("sourceLabel")
                    .sourceMetadata("sourceMetadata")
                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                    .addSourceVid(0L)
                    .timestamp(0L)
                    .unit("unit")
                    .updatedByUserId(0)
                    .useTimestampAsPersistenceTimestamp(true)
                    .value("value")
                    .build()
            )
        assertThat(marketingEventPublicDefaultResponse.eventName()).isEqualTo("eventName")
        assertThat(marketingEventPublicDefaultResponse.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventPublicDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponse.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponse.eventCancelled()).contains(true)
        assertThat(marketingEventPublicDefaultResponse.eventCompleted()).contains(true)
        assertThat(marketingEventPublicDefaultResponse.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventPublicDefaultResponse.eventType()).contains("eventType")
        assertThat(marketingEventPublicDefaultResponse.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicDefaultResponse.objectId()).contains("objectId")
        assertThat(marketingEventPublicDefaultResponse.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicDefaultResponse =
            MarketingEventPublicDefaultResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addCustomProperty(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.HIGH)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.ACADEMY)
                        .sourceId("sourceId")
                        .sourceLabel("sourceLabel")
                        .sourceMetadata("sourceMetadata")
                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                        .addSourceVid(0L)
                        .timestamp(0L)
                        .unit("unit")
                        .updatedByUserId(0)
                        .useTimestampAsPersistenceTimestamp(true)
                        .value("value")
                        .build()
                )
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .objectId("objectId")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicDefaultResponse),
                jacksonTypeRef<MarketingEventPublicDefaultResponse>(),
            )

        assertThat(roundtrippedMarketingEventPublicDefaultResponse)
            .isEqualTo(marketingEventPublicDefaultResponse)
    }
}
