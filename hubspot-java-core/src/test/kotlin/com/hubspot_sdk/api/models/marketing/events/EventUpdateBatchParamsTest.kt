// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventUpdateBatchParamsTest {

    @Test
    fun create() {
        EventUpdateBatchParams.builder()
            .batchInputMarketingEventPublicUpdateRequestFullV2(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            EventUpdateBatchParams.builder()
                .batchInputMarketingEventPublicUpdateRequestFullV2(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventUpdateBatchParams.builder()
                .batchInputMarketingEventPublicUpdateRequestFullV2(
                    BatchInputMarketingEventPublicUpdateRequestFullV2.builder()
                        .addInput(
                            MarketingEventPublicUpdateRequestFullV2.builder()
                                .addCustomProperty(
                                    PropertyValue.builder()
                                        .name("")
                                        .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                        .value("")
                                        .build()
                                )
                                .objectId("objectId")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputMarketingEventPublicUpdateRequestFullV2.builder()
                    .addInput(
                        MarketingEventPublicUpdateRequestFullV2.builder()
                            .addCustomProperty(
                                PropertyValue.builder()
                                    .name("")
                                    .sourceUpstreamDeployable("sourceUpstreamDeployable")
                                    .value("")
                                    .build()
                            )
                            .objectId("objectId")
                            .build()
                    )
                    .build()
            )
    }
}
