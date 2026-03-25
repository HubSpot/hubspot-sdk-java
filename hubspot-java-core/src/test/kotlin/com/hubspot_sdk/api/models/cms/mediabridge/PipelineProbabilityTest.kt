// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineProbabilityTest {

    @Test
    fun create() {
        val pipelineProbability =
            PipelineProbability.builder()
                .operator(PipelineProbability.Operator.PIPELINE_PROBABILITY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(pipelineProbability.operator())
            .isEqualTo(PipelineProbability.Operator.PIPELINE_PROBABILITY)
        assertThat(pipelineProbability.inputs().getOrNull())
            .containsExactly(
                PipelineProbability.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(pipelineProbability.propertyName()).contains("propertyName")
        assertThat(pipelineProbability.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pipelineProbability =
            PipelineProbability.builder()
                .operator(PipelineProbability.Operator.PIPELINE_PROBABILITY)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedPipelineProbability =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineProbability),
                jacksonTypeRef<PipelineProbability>(),
            )

        assertThat(roundtrippedPipelineProbability).isEqualTo(pipelineProbability)
    }
}
