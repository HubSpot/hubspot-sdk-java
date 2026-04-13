// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.pipelines

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelinePatchInputTest {

    @Test
    fun create() {
        val pipelinePatchInput =
            PipelinePatchInput.builder().archived(true).displayOrder(0).label("label").build()

        assertThat(pipelinePatchInput.archived()).contains(true)
        assertThat(pipelinePatchInput.displayOrder()).contains(0)
        assertThat(pipelinePatchInput.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelinePatchInput =
            PipelinePatchInput.builder().archived(true).displayOrder(0).label("label").build()

        val roundtrippedPipelinePatchInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelinePatchInput),
                jacksonTypeRef<PipelinePatchInput>(),
            )

        assertThat(roundtrippedPipelinePatchInput).isEqualTo(pipelinePatchInput)
    }
}
