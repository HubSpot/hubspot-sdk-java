// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventCreateRequestParamsTest {

    @Test
    fun create() {
        val marketingEventCreateRequestParams =
            MarketingEventCreateRequestParams.builder()
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
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
                .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(marketingEventCreateRequestParams.eventName()).isEqualTo("eventName")
        assertThat(marketingEventCreateRequestParams.eventOrganizer()).isEqualTo("eventOrganizer")
        assertThat(marketingEventCreateRequestParams.externalAccountId())
            .isEqualTo("externalAccountId")
        assertThat(marketingEventCreateRequestParams.externalEventId()).isEqualTo("externalEventId")
        assertThat(marketingEventCreateRequestParams.customProperties().getOrNull())
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
                .eventName("eventName")
                .eventOrganizer("eventOrganizer")
                .externalAccountId("externalAccountId")
                .externalEventId("externalEventId")
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
