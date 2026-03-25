// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.PropertyValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicUpdateRequestV2Test {

    @Test
    fun create() {
        val marketingEventPublicUpdateRequestV2 =
            MarketingEventPublicUpdateRequestV2.builder()
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
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventDescription("eventDescription")
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicUpdateRequestV2.customProperties())
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
        assertThat(marketingEventPublicUpdateRequestV2.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicUpdateRequestV2.eventCancelled()).contains(true)
        assertThat(marketingEventPublicUpdateRequestV2.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventPublicUpdateRequestV2.eventName()).contains("eventName")
        assertThat(marketingEventPublicUpdateRequestV2.eventOrganizer()).contains("eventOrganizer")
        assertThat(marketingEventPublicUpdateRequestV2.eventType()).contains("eventType")
        assertThat(marketingEventPublicUpdateRequestV2.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicUpdateRequestV2.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicUpdateRequestV2 =
            MarketingEventPublicUpdateRequestV2.builder()
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
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventDescription("eventDescription")
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicUpdateRequestV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicUpdateRequestV2),
                jacksonTypeRef<MarketingEventPublicUpdateRequestV2>(),
            )

        assertThat(roundtrippedMarketingEventPublicUpdateRequestV2)
            .isEqualTo(marketingEventPublicUpdateRequestV2)
    }
}
