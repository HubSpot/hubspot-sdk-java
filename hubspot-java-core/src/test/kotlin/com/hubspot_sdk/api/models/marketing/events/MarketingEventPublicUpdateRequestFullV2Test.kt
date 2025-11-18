// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventPublicUpdateRequestFullV2Test {

    @Test
    fun create() {
        val marketingEventPublicUpdateRequestFullV2 =
            MarketingEventPublicUpdateRequestFullV2.builder()
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
                .objectId("objectId")
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventDescription("eventDescription")
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventPublicUpdateRequestFullV2.customProperties())
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
        assertThat(marketingEventPublicUpdateRequestFullV2.objectId()).isEqualTo("objectId")
        assertThat(marketingEventPublicUpdateRequestFullV2.endDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(marketingEventPublicUpdateRequestFullV2.eventCancelled()).contains(true)
        assertThat(marketingEventPublicUpdateRequestFullV2.eventDescription())
            .contains("eventDescription")
        assertThat(marketingEventPublicUpdateRequestFullV2.eventName()).contains("eventName")
        assertThat(marketingEventPublicUpdateRequestFullV2.eventOrganizer())
            .contains("eventOrganizer")
        assertThat(marketingEventPublicUpdateRequestFullV2.eventType()).contains("eventType")
        assertThat(marketingEventPublicUpdateRequestFullV2.eventUrl()).contains("eventUrl")
        assertThat(marketingEventPublicUpdateRequestFullV2.startDateTime())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val marketingEventPublicUpdateRequestFullV2 =
            MarketingEventPublicUpdateRequestFullV2.builder()
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
                .objectId("objectId")
                .endDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .eventCancelled(true)
                .eventDescription("eventDescription")
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .eventType("eventType")
                .eventUrl("eventUrl")
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedMarketingEventPublicUpdateRequestFullV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(marketingEventPublicUpdateRequestFullV2),
                jacksonTypeRef<MarketingEventPublicUpdateRequestFullV2>(),
            )

        assertThat(roundtrippedMarketingEventPublicUpdateRequestFullV2)
            .isEqualTo(marketingEventPublicUpdateRequestFullV2)
    }
}
