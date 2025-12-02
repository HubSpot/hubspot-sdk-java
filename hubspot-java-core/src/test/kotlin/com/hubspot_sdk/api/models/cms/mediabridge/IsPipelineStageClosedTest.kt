// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IsPipelineStageClosedTest {

    @Test
    fun create() {
        val isPipelineStageClosed =
            IsPipelineStageClosed.builder()
                .operator(IsPipelineStageClosed.Operator.IS_PIPELINE_STAGE_CLOSED)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(isPipelineStageClosed.operator())
            .isEqualTo(IsPipelineStageClosed.Operator.IS_PIPELINE_STAGE_CLOSED)
        assertThat(isPipelineStageClosed.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(isPipelineStageClosed.propertyName()).contains("propertyName")
        assertThat(isPipelineStageClosed.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val isPipelineStageClosed =
            IsPipelineStageClosed.builder()
                .operator(IsPipelineStageClosed.Operator.IS_PIPELINE_STAGE_CLOSED)
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedIsPipelineStageClosed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(isPipelineStageClosed),
                jacksonTypeRef<IsPipelineStageClosed>(),
            )

        assertThat(roundtrippedIsPipelineStageClosed).isEqualTo(isPipelineStageClosed)
    }
}
