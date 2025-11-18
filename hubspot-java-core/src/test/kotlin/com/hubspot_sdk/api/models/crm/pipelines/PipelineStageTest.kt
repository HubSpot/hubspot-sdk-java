// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStageTest {

    @Test
    fun create() {
        val pipelineStage =
            PipelineStage.builder()
                .id("1234912")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .displayOrder(0)
                .label("In Progress")
                .metadata(
                    PipelineStage.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .writePermissions(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
                .build()

        assertThat(pipelineStage.id()).isEqualTo("1234912")
        assertThat(pipelineStage.archived()).isEqualTo(false)
        assertThat(pipelineStage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
        assertThat(pipelineStage.displayOrder()).isEqualTo(0)
        assertThat(pipelineStage.label()).isEqualTo("In Progress")
        assertThat(pipelineStage.metadata())
            .isEqualTo(
                PipelineStage.Metadata.builder()
                    .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                    .build()
            )
        assertThat(pipelineStage.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
        assertThat(pipelineStage.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineStage.writePermissions())
            .contains(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStage =
            PipelineStage.builder()
                .id("1234912")
                .archived(false)
                .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                .displayOrder(0)
                .label("In Progress")
                .metadata(
                    PipelineStage.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .writePermissions(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
                .build()

        val roundtrippedPipelineStage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStage),
                jacksonTypeRef<PipelineStage>(),
            )

        assertThat(roundtrippedPipelineStage).isEqualTo(pipelineStage)
    }
}
