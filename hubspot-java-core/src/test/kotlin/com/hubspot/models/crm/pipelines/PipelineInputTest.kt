// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineInputTest {

    @Test
    fun create() {
        val pipelineInput =
            PipelineInput.builder()
                .displayOrder(0)
                .label("label")
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(0)
                        .label("label")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .stageId("stageId")
                        .build()
                )
                .pipelineId("pipelineId")
                .build()

        assertThat(pipelineInput.displayOrder()).isEqualTo(0)
        assertThat(pipelineInput.label()).isEqualTo("label")
        assertThat(pipelineInput.stages())
            .containsExactly(
                PipelineStageInput.builder()
                    .displayOrder(0)
                    .label("label")
                    .metadata(
                        PipelineStageInput.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .stageId("stageId")
                    .build()
            )
        assertThat(pipelineInput.pipelineId()).contains("pipelineId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineInput =
            PipelineInput.builder()
                .displayOrder(0)
                .label("label")
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(0)
                        .label("label")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .stageId("stageId")
                        .build()
                )
                .pipelineId("pipelineId")
                .build()

        val roundtrippedPipelineInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineInput),
                jacksonTypeRef<PipelineInput>(),
            )

        assertThat(roundtrippedPipelineInput).isEqualTo(pipelineInput)
    }
}
