// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.dealsplits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.SimplePublicObject
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseDealToDealSplitsTest {

    @Test
    fun create() {
        val batchResponseDealToDealSplits =
            BatchResponseDealToDealSplits.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealToDealSplits.builder()
                        .id("id")
                        .addSplit(
                            SimplePublicObject.builder()
                                .id("id")
                                .archived(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .properties(
                                    SimplePublicObject.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .objectWriteTraceId("objectWriteTraceId")
                                .propertiesWithHistory(
                                    SimplePublicObject.PropertiesWithHistory.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "sourceType" to "sourceType",
                                                        "timestamp" to "2019-12-27T18:11:19.117Z",
                                                        "value" to "value",
                                                        "sourceId" to "sourceId",
                                                        "sourceLabel" to "sourceLabel",
                                                        "updatedByUserId" to 0,
                                                    )
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseDealToDealSplits.Status.CANCELED)
                .links(
                    BatchResponseDealToDealSplits.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseDealToDealSplits.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseDealToDealSplits.results())
            .containsExactly(
                DealToDealSplits.builder()
                    .id("id")
                    .addSplit(
                        SimplePublicObject.builder()
                            .id("id")
                            .archived(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .properties(
                                SimplePublicObject.Properties.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .objectWriteTraceId("objectWriteTraceId")
                            .propertiesWithHistory(
                                SimplePublicObject.PropertiesWithHistory.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            listOf(
                                                mapOf(
                                                    "sourceType" to "sourceType",
                                                    "timestamp" to "2019-12-27T18:11:19.117Z",
                                                    "value" to "value",
                                                    "sourceId" to "sourceId",
                                                    "sourceLabel" to "sourceLabel",
                                                    "updatedByUserId" to 0,
                                                )
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .url("url")
                            .build()
                    )
                    .build()
            )
        assertThat(batchResponseDealToDealSplits.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseDealToDealSplits.status())
            .isEqualTo(BatchResponseDealToDealSplits.Status.CANCELED)
        assertThat(batchResponseDealToDealSplits.links())
            .contains(
                BatchResponseDealToDealSplits.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseDealToDealSplits.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseDealToDealSplits =
            BatchResponseDealToDealSplits.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    DealToDealSplits.builder()
                        .id("id")
                        .addSplit(
                            SimplePublicObject.builder()
                                .id("id")
                                .archived(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .properties(
                                    SimplePublicObject.Properties.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .objectWriteTraceId("objectWriteTraceId")
                                .propertiesWithHistory(
                                    SimplePublicObject.PropertiesWithHistory.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                listOf(
                                                    mapOf(
                                                        "sourceType" to "sourceType",
                                                        "timestamp" to "2019-12-27T18:11:19.117Z",
                                                        "value" to "value",
                                                        "sourceId" to "sourceId",
                                                        "sourceLabel" to "sourceLabel",
                                                        "updatedByUserId" to 0,
                                                    )
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .url("url")
                                .build()
                        )
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseDealToDealSplits.Status.CANCELED)
                .links(
                    BatchResponseDealToDealSplits.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseDealToDealSplits =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseDealToDealSplits),
                jacksonTypeRef<BatchResponseDealToDealSplits>(),
            )

        assertThat(roundtrippedBatchResponseDealToDealSplits)
            .isEqualTo(batchResponseDealToDealSplits)
    }
}
