// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.PropertyValue
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
