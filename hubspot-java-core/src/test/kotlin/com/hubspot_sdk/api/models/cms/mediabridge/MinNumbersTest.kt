// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MinNumbersTest {

    @Test
    fun create() {
        val minNumbers =
            MinNumbers.builder()
                .operator(MinNumbers.Operator.MIN_NUMBERS)
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

        assertThat(minNumbers.operator()).isEqualTo(MinNumbers.Operator.MIN_NUMBERS)
        assertThat(minNumbers.inputs().getOrNull())
            .containsExactly(
                MinNumbers.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(minNumbers.propertyName()).contains("propertyName")
        assertThat(minNumbers.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val minNumbers =
            MinNumbers.builder()
                .operator(MinNumbers.Operator.MIN_NUMBERS)
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

        val roundtrippedMinNumbers =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(minNumbers),
                jacksonTypeRef<MinNumbers>(),
            )

        assertThat(roundtrippedMinNumbers).isEqualTo(minNumbers)
    }
}
