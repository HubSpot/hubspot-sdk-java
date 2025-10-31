// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputMarketingEventCreateRequestParamsTest {

    @Test
    fun create() {
        val batchInputMarketingEventCreateRequestParams =
            BatchInputMarketingEventCreateRequestParams.builder()
                .addInput(
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
                )
                .build()

        assertThat(batchInputMarketingEventCreateRequestParams.inputs())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventCreateRequestParams =
            BatchInputMarketingEventCreateRequestParams.builder()
                .addInput(
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
                )
                .build()

        val roundtrippedBatchInputMarketingEventCreateRequestParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputMarketingEventCreateRequestParams),
                jacksonTypeRef<BatchInputMarketingEventCreateRequestParams>(),
            )

        assertThat(roundtrippedBatchInputMarketingEventCreateRequestParams)
            .isEqualTo(batchInputMarketingEventCreateRequestParams)
    }
}
