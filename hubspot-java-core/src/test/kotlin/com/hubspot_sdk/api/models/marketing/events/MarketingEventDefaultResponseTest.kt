// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventDefaultResponseTest {

    @Test
    fun create() {
        val marketingEventDefaultResponse =
            MarketingEventDefaultResponse.builder()
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
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

        assertThat(marketingEventDefaultResponse.eventName()).isEqualTo("eventName")
        assertThat(marketingEventDefaultResponse.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventDefaultResponse.customProperties().getOrNull())
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
        assertThat(marketingEventDefaultResponse.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventDefaultResponse.eventCancelled()).contains(true)
        assertThat(marketingEventDefaultResponse.eventCompleted()).contains(true)
        assertThat(marketingEventDefaultResponse.eventDescription()).contains("eventDescription")
        assertThat(marketingEventDefaultResponse.eventType()).contains("eventType")
        assertThat(marketingEventDefaultResponse.eventUrl()).contains("eventUrl")
        assertThat(marketingEventDefaultResponse.objectId()).contains("objectId")
        assertThat(marketingEventDefaultResponse.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventDefaultResponse =
            MarketingEventDefaultResponse.builder()
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
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

        val roundtrippedMarketingEventDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventDefaultResponse),
                jacksonTypeRef<MarketingEventDefaultResponse>(),
            )

        assertThat(roundtrippedMarketingEventDefaultResponse)
            .isEqualTo(marketingEventDefaultResponse)
    }
}
