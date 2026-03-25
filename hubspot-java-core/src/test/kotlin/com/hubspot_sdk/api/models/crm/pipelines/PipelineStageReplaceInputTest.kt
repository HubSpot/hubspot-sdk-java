// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStageReplaceInputTest {

    @Test
    fun create() {
        val pipelineStageReplaceInput =
            PipelineStageReplaceInput.builder()
                .displayOrder(0)
                .label("label")
                .metadata(
                    PipelineStageReplaceInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(pipelineStageReplaceInput.displayOrder()).isEqualTo(0)
        assertThat(pipelineStageReplaceInput.label()).isEqualTo("label")
        assertThat(pipelineStageReplaceInput.metadata())
            .isEqualTo(
                PipelineStageReplaceInput.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStageReplaceInput =
            PipelineStageReplaceInput.builder()
                .displayOrder(0)
                .label("label")
                .metadata(
                    PipelineStageReplaceInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedPipelineStageReplaceInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStageReplaceInput),
                jacksonTypeRef<PipelineStageReplaceInput>(),
            )

        assertThat(roundtrippedPipelineStageReplaceInput).isEqualTo(pipelineStageReplaceInput)
    }
}
