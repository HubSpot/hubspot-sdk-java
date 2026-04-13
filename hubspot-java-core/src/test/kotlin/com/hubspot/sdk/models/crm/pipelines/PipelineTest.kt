// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineTest {

    @Test
    fun create() {
        val pipeline =
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

        assertThat(pipeline.id()).isEqualTo("id")
        assertThat(pipeline.archived()).isEqualTo(true)
        assertThat(pipeline.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipeline.displayOrder()).isEqualTo(0)
        assertThat(pipeline.label()).isEqualTo("label")
        assertThat(pipeline.stages())
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
        assertThat(pipeline.updatedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pipeline.archivedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipeline =
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

        val roundtrippedPipeline =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipeline),
                jacksonTypeRef<Pipeline>(),
            )

        assertThat(roundtrippedPipeline).isEqualTo(pipeline)
    }
}
