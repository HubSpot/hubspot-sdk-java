// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineReplaceInputTest {

    @Test
    fun create() {
        val pipelineReplaceInput =
            PipelineReplaceInput.builder()
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
                .build()

        assertThat(pipelineReplaceInput.displayOrder()).isEqualTo(0)
        assertThat(pipelineReplaceInput.label()).isEqualTo("label")
        assertThat(pipelineReplaceInput.stages())
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineReplaceInput =
            PipelineReplaceInput.builder()
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
                .build()

        val roundtrippedPipelineReplaceInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineReplaceInput),
                jacksonTypeRef<PipelineReplaceInput>(),
            )

        assertThat(roundtrippedPipelineReplaceInput).isEqualTo(pipelineReplaceInput)
    }
}
