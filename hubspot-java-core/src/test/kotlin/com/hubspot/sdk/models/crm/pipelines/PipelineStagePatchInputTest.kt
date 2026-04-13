// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStagePatchInputTest {

    @Test
    fun create() {
        val pipelineStagePatchInput =
            PipelineStagePatchInput.builder()
                .metadata(
                    PipelineStagePatchInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .archived(true)
                .displayOrder(0)
                .label("label")
                .build()

        assertThat(pipelineStagePatchInput.metadata())
            .isEqualTo(
                PipelineStagePatchInput.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(pipelineStagePatchInput.archived()).contains(true)
        assertThat(pipelineStagePatchInput.displayOrder()).contains(0)
        assertThat(pipelineStagePatchInput.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStagePatchInput =
            PipelineStagePatchInput.builder()
                .metadata(
                    PipelineStagePatchInput.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .archived(true)
                .displayOrder(0)
                .label("label")
                .build()

        val roundtrippedPipelineStagePatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStagePatchInput),
                jacksonTypeRef<PipelineStagePatchInput>(),
            )

        assertThat(roundtrippedPipelineStagePatchInput).isEqualTo(pipelineStagePatchInput)
    }
}
