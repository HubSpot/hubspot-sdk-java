// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ErrorDetail
import com.hubspot_sdk.api.models.StandardError
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseMarketingEventPublicDefaultResponseTest {

    @Test
    fun create() {
        val batchResponseMarketingEventPublicDefaultResponse =
            BatchResponseMarketingEventPublicDefaultResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    MarketingEventPublicDefaultResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("eventName")
                        .eventOrganizer("eventOrganizer")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .objectId("objectId")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseMarketingEventPublicDefaultResponse.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseMarketingEventPublicDefaultResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseMarketingEventPublicDefaultResponse.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponse.results())
            .containsExactly(
                MarketingEventPublicDefaultResponse.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .eventName("eventName")
                    .eventOrganizer("eventOrganizer")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .objectId("objectId")
                    .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponse.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseMarketingEventPublicDefaultResponse.status())
            .isEqualTo(BatchResponseMarketingEventPublicDefaultResponse.Status.PENDING)
        assertThat(batchResponseMarketingEventPublicDefaultResponse.errors().getOrNull())
            .containsExactly(
                StandardError.builder()
                    .category("")
                    .context(
                        StandardError.Context.builder()
                            .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                            .build()
                    )
                    .addError(
                        ErrorDetail.builder()
                            .message("message")
                            .code("code")
                            .context(
                                ErrorDetail.Context.builder()
                                    .putAdditionalProperty(
                                        "missingScopes",
                                        JsonValue.from(listOf("scope1", "scope2")),
                                    )
                                    .build()
                            )
                            .in_("in")
                            .subCategory("subCategory")
                            .build()
                    )
                    .links(
                        StandardError.Links.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .message("")
                    .status("")
                    .id("")
                    .subCategory(JsonValue.from(""))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponse.links())
            .contains(
                BatchResponseMarketingEventPublicDefaultResponse.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseMarketingEventPublicDefaultResponse.numErrors()).contains(0)
        assertThat(batchResponseMarketingEventPublicDefaultResponse.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseMarketingEventPublicDefaultResponse =
            BatchResponseMarketingEventPublicDefaultResponse.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    MarketingEventPublicDefaultResponse.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .eventName("eventName")
                        .eventOrganizer("eventOrganizer")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                        .objectId("objectId")
                        .startDateTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseMarketingEventPublicDefaultResponse.Status.PENDING)
                .addError(
                    StandardError.builder()
                        .category("")
                        .context(
                            StandardError.Context.builder()
                                .putAdditionalProperty("foo", JsonValue.from(listOf("string")))
                                .build()
                        )
                        .addError(
                            ErrorDetail.builder()
                                .message("message")
                                .code("code")
                                .context(
                                    ErrorDetail.Context.builder()
                                        .putAdditionalProperty(
                                            "missingScopes",
                                            JsonValue.from(listOf("scope1", "scope2")),
                                        )
                                        .build()
                                )
                                .in_("in")
                                .subCategory("subCategory")
                                .build()
                        )
                        .links(
                            StandardError.Links.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .message("")
                        .status("")
                        .id("")
                        .subCategory(JsonValue.from(""))
                        .build()
                )
                .links(
                    BatchResponseMarketingEventPublicDefaultResponse.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .numErrors(0)
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseMarketingEventPublicDefaultResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseMarketingEventPublicDefaultResponse),
                jacksonTypeRef<BatchResponseMarketingEventPublicDefaultResponse>(),
            )

        assertThat(roundtrippedBatchResponseMarketingEventPublicDefaultResponse)
            .isEqualTo(batchResponseMarketingEventPublicDefaultResponse)
    }
}
