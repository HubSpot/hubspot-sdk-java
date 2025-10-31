// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventPublicUpdateRequestFullV2Test {

    @Test
    fun create() {
        val batchInputMarketingEventPublicUpdateRequestFullV2 =
            BatchInputMarketingEventPublicUpdateRequestFullV2.builder()
                .addInput(
                    MarketingEventPublicUpdateRequestFullV2.builder()
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
                )
                .build()

        assertThat(batchInputMarketingEventPublicUpdateRequestFullV2.inputs())
            .containsExactly(
                MarketingEventPublicUpdateRequestFullV2.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventPublicUpdateRequestFullV2 =
            BatchInputMarketingEventPublicUpdateRequestFullV2.builder()
                .addInput(
                    MarketingEventPublicUpdateRequestFullV2.builder()
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
                )
                .build()

        val roundtrippedBatchInputMarketingEventPublicUpdateRequestFullV2 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventPublicUpdateRequestFullV2),
                jacksonTypeRef<BatchInputMarketingEventPublicUpdateRequestFullV2>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventPublicUpdateRequestFullV2)
            .isEqualTo(batchInputMarketingEventPublicUpdateRequestFullV2)
    }
}
