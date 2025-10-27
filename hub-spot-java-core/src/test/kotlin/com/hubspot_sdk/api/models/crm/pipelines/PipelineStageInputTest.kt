// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStageInputTest {

    @Test
    fun create() {
        val pipelineStageInput =
            PipelineStageInput.builder()
                .displayOrder(1)
                .label("Done")
                .metadata(
                    PipelineStageInput.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                        .build()
                )
                .build()

        assertThat(pipelineStageInput.displayOrder()).isEqualTo(1)
        assertThat(pipelineStageInput.label()).isEqualTo("Done")
        assertThat(pipelineStageInput.metadata())
            .contains(
                PipelineStageInput.Metadata.builder()
                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStageInput =
            PipelineStageInput.builder()
                .displayOrder(1)
                .label("Done")
                .metadata(
                    PipelineStageInput.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                        .build()
                )
                .build()

        val roundtrippedPipelineStageInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStageInput),
                jacksonTypeRef<PipelineStageInput>(),
            )

        assertThat(roundtrippedPipelineStageInput).isEqualTo(pipelineStageInput)
    }
}
