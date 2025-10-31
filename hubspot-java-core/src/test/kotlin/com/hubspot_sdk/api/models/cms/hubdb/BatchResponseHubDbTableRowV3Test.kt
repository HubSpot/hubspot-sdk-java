// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseHubDbTableRowV3Test {

    @Test
    fun create() {
        val batchResponseHubDbTableRowV3 =
            BatchResponseHubDbTableRowV3.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .links(
                    BatchResponseHubDbTableRowV3.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    HubDbTableRowV3.builder()
                        .values(
                            HubDbTableRowV3.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .childTableId("childTableId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .path("path")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseHubDbTableRowV3.Status.PENDING)
                .build()

        assertThat(batchResponseHubDbTableRowV3.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseHubDbTableRowV3.links())
            .contains(
                BatchResponseHubDbTableRowV3.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseHubDbTableRowV3.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseHubDbTableRowV3.results().getOrNull())
            .containsExactly(
                HubDbTableRowV3.builder()
                    .values(
                        HubDbTableRowV3.Values.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .id("id")
                    .childTableId("childTableId")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .path("path")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseHubDbTableRowV3.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseHubDbTableRowV3.status())
            .contains(BatchResponseHubDbTableRowV3.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseHubDbTableRowV3 =
            BatchResponseHubDbTableRowV3.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .links(
                    BatchResponseHubDbTableRowV3.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    HubDbTableRowV3.builder()
                        .values(
                            HubDbTableRowV3.Values.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .id("id")
                        .childTableId("childTableId")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .path("path")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseHubDbTableRowV3.Status.PENDING)
                .build()

        val roundtrippedBatchResponseHubDbTableRowV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseHubDbTableRowV3),
                jacksonTypeRef<BatchResponseHubDbTableRowV3>(),
            )

        assertThat(roundtrippedBatchResponseHubDbTableRowV3).isEqualTo(batchResponseHubDbTableRowV3)
    }
}
