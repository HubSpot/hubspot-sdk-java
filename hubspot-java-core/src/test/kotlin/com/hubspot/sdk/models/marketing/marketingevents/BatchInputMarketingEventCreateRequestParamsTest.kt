// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.marketing.marketingevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.PropertyValue
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
                )
                .build()

        assertThat(batchInputMarketingEventCreateRequestParams.inputs())
            .containsExactly(
                MarketingEventCreateRequestParams.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputMarketingEventCreateRequestParams =
            BatchInputMarketingEventCreateRequestParams.builder()
                .addInput(
                    MarketingEventCreateRequestParams.builder()
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
