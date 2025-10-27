// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
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
                        .id("812723471")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .displayOrder(0)
                        .label("My ticket pipeline")
                        .addStage(
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
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("OPEN"),
                                        )
                                        .build()
                                )
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .build()
                        )
                        .addStage(
                            PipelineStage.builder()
                                .id("1234914")
                                .archived(false)
                                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                                .displayOrder(0)
                                .label("Done")
                                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    PipelineStage.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("CLOSED"),
                                        )
                                        .build()
                                )
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(collectionResponsePipelineNoPaging.results())
            .containsExactly(
                Pipeline.builder()
                    .id("812723471")
                    .archived(false)
                    .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                    .displayOrder(0)
                    .label("My ticket pipeline")
                    .addStage(
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
                    .addStage(
                        PipelineStage.builder()
                            .id("1234914")
                            .archived(false)
                            .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                            .displayOrder(0)
                            .label("Done")
                            .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                            .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .metadata(
                                PipelineStage.Metadata.builder()
                                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                    .build()
                            )
                            .writePermissions(
                                PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                            )
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
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
                        .id("812723471")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .displayOrder(0)
                        .label("My ticket pipeline")
                        .addStage(
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
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("OPEN"),
                                        )
                                        .build()
                                )
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .build()
                        )
                        .addStage(
                            PipelineStage.builder()
                                .id("1234914")
                                .archived(false)
                                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                                .displayOrder(0)
                                .label("Done")
                                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .metadata(
                                    PipelineStage.Metadata.builder()
                                        .putAdditionalProperty(
                                            "ticketState",
                                            JsonValue.from("CLOSED"),
                                        )
                                        .build()
                                )
                                .writePermissions(
                                    PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT
                                )
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
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
