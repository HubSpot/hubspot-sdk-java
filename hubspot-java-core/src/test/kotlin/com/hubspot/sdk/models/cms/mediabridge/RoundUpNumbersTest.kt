// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoundUpNumbersTest {

    @Test
    fun create() {
        val roundUpNumbers =
            RoundUpNumbers.builder()
                .operator(RoundUpNumbers.Operator.ROUND_UP)
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

        assertThat(roundUpNumbers.operator()).isEqualTo(RoundUpNumbers.Operator.ROUND_UP)
        assertThat(roundUpNumbers.inputs().getOrNull())
            .containsExactly(
                RoundUpNumbers.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(roundUpNumbers.propertyName()).contains("propertyName")
        assertThat(roundUpNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roundUpNumbers =
            RoundUpNumbers.builder()
                .operator(RoundUpNumbers.Operator.ROUND_UP)
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

        val roundtrippedRoundUpNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roundUpNumbers),
                jacksonTypeRef<RoundUpNumbers>(),
            )

        assertThat(roundtrippedRoundUpNumbers).isEqualTo(roundUpNumbers)
    }
}
