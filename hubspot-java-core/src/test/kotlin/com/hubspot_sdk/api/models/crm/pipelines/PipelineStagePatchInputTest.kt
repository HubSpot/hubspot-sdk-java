// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineStagePatchInputTest {

    @Test
    fun create() {
        val pipelineStagePatchInput =
            PipelineStagePatchInput.builder()
                .archived(true)
                .displayOrder(1)
                .label("Done")
                .metadata(
                    PipelineStagePatchInput.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                        .build()
                )
                .build()

        assertThat(pipelineStagePatchInput.archived()).contains(true)
        assertThat(pipelineStagePatchInput.displayOrder()).contains(1)
        assertThat(pipelineStagePatchInput.label()).contains("Done")
        assertThat(pipelineStagePatchInput.metadata())
            .contains(
                PipelineStagePatchInput.Metadata.builder()
                    .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineStagePatchInput =
            PipelineStagePatchInput.builder()
                .archived(true)
                .displayOrder(1)
                .label("Done")
                .metadata(
                    PipelineStagePatchInput.Metadata.builder()
                        .putAdditionalProperty("ticketState", JsonValue.from("CLOSED"))
                        .build()
                )
                .build()

        val roundtrippedPipelineStagePatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineStagePatchInput),
                jacksonTypeRef<PipelineStagePatchInput>(),
            )

        assertThat(roundtrippedPipelineStagePatchInput).isEqualTo(pipelineStagePatchInput)
    }
}
