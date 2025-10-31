// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicDefaultResponseTest {

    @Test
    fun create() {
        val marketingEventPublicDefaultResponse =
            MarketingEventPublicDefaultResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
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

        assertThat(marketingEventPublicDefaultResponse.id()).isEqualTo("id")
        assertThat(marketingEventPublicDefaultResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponse.eventName()).isEqualTo("eventName")
        assertThat(marketingEventPublicDefaultResponse.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventPublicDefaultResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicDefaultResponse.customProperties().getOrNull())
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
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
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

        val roundtrippedMarketingEventPublicDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicDefaultResponse),
                jacksonTypeRef<MarketingEventPublicDefaultResponse>(),
            )

        assertThat(roundtrippedMarketingEventPublicDefaultResponse)
            .isEqualTo(marketingEventPublicDefaultResponse)
    }
}
