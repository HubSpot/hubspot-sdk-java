// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.marketing.marketingevents

import com.hubspot.core.http.QueryParams
import com.hubspot.models.PropertyValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarketingEventUpdateByExternalEventIdParamsTest {

    @Test
    fun create() {
        MarketingEventUpdateByExternalEventIdParams.builder()
            .externalEventId("externalEventId")
            .externalAccountId("externalAccountId")
            .marketingEventUpdateRequestParams(
                MarketingEventUpdateRequestParams.builder()
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
                    .eventCompleted(true)
                    .eventDescription("eventDescription")
                    .eventName("eventName")
                    .eventOrganizer("eventOrganizer")
                    .eventType("eventType")
                    .eventUrl("eventUrl")
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MarketingEventUpdateByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventUpdateRequestParams(
                    MarketingEventUpdateRequestParams.builder()
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
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("externalEventId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MarketingEventUpdateByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventUpdateRequestParams(
                    MarketingEventUpdateRequestParams.builder()
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
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventName("eventName")
                        .eventOrganizer("eventOrganizer")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MarketingEventUpdateByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventUpdateRequestParams(
                    MarketingEventUpdateRequestParams.builder()
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
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("externalAccountId", "externalAccountId").build())
    }

    @Test
    fun body() {
        val params =
            MarketingEventUpdateByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventUpdateRequestParams(
                    MarketingEventUpdateRequestParams.builder()
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
                        .eventCompleted(true)
                        .eventDescription("eventDescription")
                        .eventName("eventName")
                        .eventOrganizer("eventOrganizer")
                        .eventType("eventType")
                        .eventUrl("eventUrl")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MarketingEventUpdateRequestParams.builder()
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
                    .eventCompleted(true)
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
    fun bodyWithoutOptionalFields() {
        val params =
            MarketingEventUpdateByExternalEventIdParams.builder()
                .externalEventId("externalEventId")
                .externalAccountId("externalAccountId")
                .marketingEventUpdateRequestParams(
                    MarketingEventUpdateRequestParams.builder()
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MarketingEventUpdateRequestParams.builder()
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
                    .build()
            )
    }
}
