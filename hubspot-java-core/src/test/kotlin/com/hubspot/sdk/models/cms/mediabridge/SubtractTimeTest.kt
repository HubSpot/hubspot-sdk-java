// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubtractTimeTest {

    @Test
    fun create() {
        val subtractTime =
            SubtractTime.builder()
                .operator(SubtractTime.Operator.SUBTRACT_TIME)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(subtractTime.operator()).isEqualTo(SubtractTime.Operator.SUBTRACT_TIME)
        assertThat(subtractTime._stringToCheck()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(subtractTime.inputs().getOrNull())
            .containsExactly(JsonValue.from(mapOf<String, Any>()))
        assertThat(subtractTime.propertyName()).contains("propertyName")
        assertThat(subtractTime.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subtractTime =
            SubtractTime.builder()
                .operator(SubtractTime.Operator.SUBTRACT_TIME)
                .stringToCheck(JsonValue.from(mapOf<String, Any>()))
                .addInput(JsonValue.from(mapOf<String, Any>()))
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedSubtractTime =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subtractTime),
                jacksonTypeRef<SubtractTime>(),
            )

        assertThat(roundtrippedSubtractTime).isEqualTo(subtractTime)
    }
}
