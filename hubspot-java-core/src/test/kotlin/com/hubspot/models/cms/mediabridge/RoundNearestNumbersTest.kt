// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoundNearestNumbersTest {

    @Test
    fun create() {
        val roundNearestNumbers =
            RoundNearestNumbers.builder()
                .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
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

        assertThat(roundNearestNumbers.operator())
            .isEqualTo(RoundNearestNumbers.Operator.ROUND_NEAREST)
        assertThat(roundNearestNumbers.inputs().getOrNull())
            .containsExactly(
                RoundNearestNumbers.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(roundNearestNumbers.propertyName()).contains("propertyName")
        assertThat(roundNearestNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roundNearestNumbers =
            RoundNearestNumbers.builder()
                .operator(RoundNearestNumbers.Operator.ROUND_NEAREST)
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

        val roundtrippedRoundNearestNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roundNearestNumbers),
                jacksonTypeRef<RoundNearestNumbers>(),
            )

        assertThat(roundtrippedRoundNearestNumbers).isEqualTo(roundNearestNumbers)
    }
}
