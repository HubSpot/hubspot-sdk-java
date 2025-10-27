// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineInputTest {

    @Test
    fun create() {
        val pipelineInput =
            PipelineInput.builder()
                .displayOrder(0)
                .label("My replaced pipeline")
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(0)
                        .label("In Progress")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                .build()
                        )
                        .build()
                )
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(1)
                        .label("Done")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(pipelineInput.displayOrder()).isEqualTo(0)
        assertThat(pipelineInput.label()).isEqualTo("My replaced pipeline")
        assertThat(pipelineInput.stages())
            .containsExactly(
                PipelineStageInput.builder()
                    .displayOrder(0)
                    .label("In Progress")
                    .metadata(
                        PipelineStageInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                            .build()
                    )
                    .build(),
                PipelineStageInput.builder()
                    .displayOrder(1)
                    .label("Done")
                    .metadata(
                        PipelineStageInput.Metadata.builder()
                            .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                            .build()
                    )
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineInput =
            PipelineInput.builder()
                .displayOrder(0)
                .label("My replaced pipeline")
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(0)
                        .label("In Progress")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("OPEN"))
                                .build()
                        )
                        .build()
                )
                .addStage(
                    PipelineStageInput.builder()
                        .displayOrder(1)
                        .label("Done")
                        .metadata(
                            PipelineStageInput.Metadata.builder()
                                .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedPipelineInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineInput),
                jacksonTypeRef<PipelineInput>(),
            )

        assertThat(roundtrippedPipelineInput).isEqualTo(pipelineInput)
    }
}
