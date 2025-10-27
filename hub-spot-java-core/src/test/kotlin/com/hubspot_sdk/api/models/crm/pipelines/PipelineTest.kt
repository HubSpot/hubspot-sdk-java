// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineTest {

    @Test
    fun create() {
        val pipeline =
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

        assertThat(pipeline.id()).isEqualTo("812723471")
        assertThat(pipeline.archived()).isEqualTo(false)
        assertThat(pipeline.createdAt()).isEqualTo(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
        assertThat(pipeline.displayOrder()).isEqualTo(0)
        assertThat(pipeline.label()).isEqualTo("My ticket pipeline")
        assertThat(pipeline.stages())
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
                    .build(),
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
                    .writePermissions(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
                    .build(),
            )
        assertThat(pipeline.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
        assertThat(pipeline.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipeline =
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

        val roundtrippedPipeline =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipeline),
                jacksonTypeRef<Pipeline>(),
            )

        assertThat(roundtrippedPipeline).isEqualTo(pipeline)
    }
}
