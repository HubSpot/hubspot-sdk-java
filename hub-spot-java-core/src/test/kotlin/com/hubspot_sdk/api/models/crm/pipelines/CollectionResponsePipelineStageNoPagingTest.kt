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
                        .id("1234912")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .displayOrder(0)
                        .label("In Progress")
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            PipelineStage.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                .build()
                        )
                        .writePermissions(
                            PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                        )
                        .build()
                )
                .build()

        assertThat(collectionResponsePipelineStageNoPaging.results())
            .containsExactly(
                PipelineStage.builder()
                    .id("1234912")
                    .archived(false)
                    .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                    .displayOrder(0)
                    .label("In Progress")
                    .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        PipelineStage.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                            .build()
                    )
                    .writePermissions(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
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
                        .id("1234912")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .displayOrder(0)
                        .label("In Progress")
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            PipelineStage.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                .build()
                        )
                        .writePermissions(
                            PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                        )
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
