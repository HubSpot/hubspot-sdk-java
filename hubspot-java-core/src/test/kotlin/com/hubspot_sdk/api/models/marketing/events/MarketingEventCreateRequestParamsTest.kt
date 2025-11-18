// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventCreateRequestParamsTest {

    @Test
    fun create() {
        val marketingEventCreateRequestParams =
            MarketingEventCreateRequestParams.builder()
                .addCustomProperty(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.UNKNOWN)
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
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventCreateRequestParams.customProperties())
            .containsExactly(
                PropertyValue.builder()
                    .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                    .isEncrypted(true)
                    .isLargeValue(true)
                    .name("name")
                    .persistenceTimestamp(0L)
                    .requestId("requestId")
                    .selectedByUser(true)
                    .selectedByUserTimestamp(0L)
                    .source(PropertyValue.Source.UNKNOWN)
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
        assertThat(marketingEventCreateRequestParams.eventName()).isEqualTo("eventName")
        assertThat(marketingEventCreateRequestParams.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventCreateRequestParams.externalAccountId())
            .isEqualTo("externalAccountId")
        assertThat(marketingEventCreateRequestParams.externalEventId()).isEqualTo("externalEventId")
        assertThat(marketingEventCreateRequestParams.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventCreateRequestParams.eventCancelled()).contains(true)
        assertThat(marketingEventCreateRequestParams.eventCompleted()).contains(true)
        assertThat(marketingEventCreateRequestParams.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventCreateRequestParams.eventType()).contains("eventType")
        assertThat(marketingEventCreateRequestParams.eventUrl()).contains("eventUrl")
        assertThat(marketingEventCreateRequestParams.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventCreateRequestParams =
            MarketingEventCreateRequestParams.builder()
                .addCustomProperty(
                    PropertyValue.builder()
                        .dataSensitivity(PropertyValue.DataSensitivity.NONE)
                        .isEncrypted(true)
                        .isLargeValue(true)
                        .name("name")
                        .persistenceTimestamp(0L)
                        .requestId("requestId")
                        .selectedByUser(true)
                        .selectedByUserTimestamp(0L)
                        .source(PropertyValue.Source.UNKNOWN)
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
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventCompleted(true)
                .eventDescription("eventDescription")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventCreateRequestParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventCreateRequestParams),
                jacksonTypeRef<MarketingEventCreateRequestParams>(),
            )

        assertThat(roundtrippedMarketingEventCreateRequestParams)
            .isEqualTo(marketingEventCreateRequestParams)
    }
}
