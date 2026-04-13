// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePipelineNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePipelineNoPaging =
            CollectionResponsePipelineNoPaging.builder()
                .addResult(
                    Pipeline.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayOrder(0)
                        .label("label")
                        .addStage(
                            PipelineStage.builder()
                                .id("id")
                                .archived(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .displayOrder(0)
                                .label("label")
                                .metadata(
                                    PipelineStage.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(collectionResponsePipelineNoPaging.results())
            .containsExactly(
                Pipeline.builder()
                    .id("id")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayOrder(0)
                    .label("label")
                    .addStage(
                        PipelineStage.builder()
                            .id("id")
                            .archived(true)
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .displayOrder(0)
                            .label("label")
                            .metadata(
                                PipelineStage.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .writePermissions(
                                PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                            )
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePipelineNoPaging =
            CollectionResponsePipelineNoPaging.builder()
                .addResult(
                    Pipeline.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayOrder(0)
                        .label("label")
                        .addStage(
                            PipelineStage.builder()
                                .id("id")
                                .archived(true)
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .displayOrder(0)
                                .label("label")
                                .metadata(
                                    PipelineStage.Metadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePipelineNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePipelineNoPaging),
                jacksonTypeRef<CollectionResponsePipelineNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePipelineNoPaging)
            .isEqualTo(collectionResponsePipelineNoPaging)
    }
}
