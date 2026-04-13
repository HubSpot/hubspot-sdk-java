// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.JsonValue
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStageInputTest {

    @Test
    fun create() {
        val pipelineStageInput =
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

        assertThat(pipelineStageInput.displayOrder()).isEqualTo(0)
        assertThat(pipelineStageInput.label()).isEqualTo("label")
        assertThat(pipelineStageInput.metadata())
            .isEqualTo(
                PipelineStageInput.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pipelineStageInput.stageId()).contains("stageId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStageInput =
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

        val roundtrippedPipelineStageInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStageInput),
                jacksonTypeRef<PipelineStageInput>(),
            )

        assertThat(roundtrippedPipelineStageInput).isEqualTo(pipelineStageInput)
    }
}
