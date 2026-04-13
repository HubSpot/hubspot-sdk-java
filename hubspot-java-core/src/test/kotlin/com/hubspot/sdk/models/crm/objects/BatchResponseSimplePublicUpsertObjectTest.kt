// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseSimplePublicUpsertObjectTest {

    @Test
    fun create() {
        val batchResponseSimplePublicUpsertObject =
            BatchResponseSimplePublicUpsertObject.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SimplePublicUpsertObject.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .new_(true)
                        .properties(
                            SimplePublicUpsertObject.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectWriteTraceId("objectWriteTraceId")
                        .propertiesWithHistory(
                            SimplePublicUpsertObject.PropertiesWithHistory.builder()
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
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSimplePublicUpsertObject.Status.CANCELED)
                .links(
                    BatchResponseSimplePublicUpsertObject.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseSimplePublicUpsertObject.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSimplePublicUpsertObject.results())
            .containsExactly(
                SimplePublicUpsertObject.builder()
                    .id("id")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .new_(true)
                    .properties(
                        SimplePublicUpsertObject.Properties.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .objectWriteTraceId("objectWriteTraceId")
                    .propertiesWithHistory(
                        SimplePublicUpsertObject.PropertiesWithHistory.builder()
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
        assertThat(batchResponseSimplePublicUpsertObject.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseSimplePublicUpsertObject.status())
            .isEqualTo(BatchResponseSimplePublicUpsertObject.Status.CANCELED)
        assertThat(batchResponseSimplePublicUpsertObject.links())
            .contains(
                BatchResponseSimplePublicUpsertObject.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseSimplePublicUpsertObject.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseSimplePublicUpsertObject =
            BatchResponseSimplePublicUpsertObject.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    SimplePublicUpsertObject.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .new_(true)
                        .properties(
                            SimplePublicUpsertObject.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .objectWriteTraceId("objectWriteTraceId")
                        .propertiesWithHistory(
                            SimplePublicUpsertObject.PropertiesWithHistory.builder()
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
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseSimplePublicUpsertObject.Status.CANCELED)
                .links(
                    BatchResponseSimplePublicUpsertObject.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseSimplePublicUpsertObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseSimplePublicUpsertObject),
                jacksonTypeRef<BatchResponseSimplePublicUpsertObject>(),
            )

        assertThat(roundtrippedBatchResponseSimplePublicUpsertObject)
            .isEqualTo(batchResponseSimplePublicUpsertObject)
    }
}
