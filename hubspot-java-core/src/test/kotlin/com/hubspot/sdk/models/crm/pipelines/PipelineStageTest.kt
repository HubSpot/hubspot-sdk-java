// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStageTest {

    @Test
    fun create() {
        val pipelineStage =
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

        assertThat(pipelineStage.id()).isEqualTo("id")
        assertThat(pipelineStage.archived()).isEqualTo(true)
        assertThat(pipelineStage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineStage.displayOrder()).isEqualTo(0)
        assertThat(pipelineStage.label()).isEqualTo("label")
        assertThat(pipelineStage.metadata())
            .isEqualTo(
                PipelineStage.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pipelineStage.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipelineStage.writePermissions())
            .isEqualTo(PipelineStage.WritePermissions.CRM_PERMISSIONS_ENFORCEMENT)
        assertThat(pipelineStage.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStage =
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

        val roundtrippedPipelineStage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStage),
                jacksonTypeRef<PipelineStage>(),
            )

        assertThat(roundtrippedPipelineStage).isEqualTo(pipelineStage)
    }
}
