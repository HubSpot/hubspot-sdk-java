// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePipelineStageNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePipelineStageNoPaging =
            CollectionResponsePipelineStageNoPaging.builder()
                .addResult(
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
                .build()

        assertThat(collectionResponsePipelineStageNoPaging.results())
            .containsExactly(
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
                    .writePermissions(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePipelineStageNoPaging =
            CollectionResponsePipelineStageNoPaging.builder()
                .addResult(
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
                .build()

        val roundtrippedCollectionResponsePipelineStageNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePipelineStageNoPaging),
                jacksonTypeRef<CollectionResponsePipelineStageNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePipelineStageNoPaging)
            .isEqualTo(collectionResponsePipelineStageNoPaging)
    }
}
