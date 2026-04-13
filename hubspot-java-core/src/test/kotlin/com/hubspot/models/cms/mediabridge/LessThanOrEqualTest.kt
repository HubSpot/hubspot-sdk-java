// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LessThanOrEqualTest {

    @Test
    fun create() {
        val lessThanOrEqual =
            LessThanOrEqual.builder()
                .operator(LessThanOrEqual.Operator.LESS_THAN_OR_EQUAL)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(lessThanOrEqual.operator())
            .isEqualTo(LessThanOrEqual.Operator.LESS_THAN_OR_EQUAL)
        assertThat(lessThanOrEqual.inputs().getOrNull())
            .containsExactly(
                LessThanOrEqual.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(lessThanOrEqual.propertyName()).contains("propertyName")
        assertThat(lessThanOrEqual.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lessThanOrEqual =
            LessThanOrEqual.builder()
                .operator(LessThanOrEqual.Operator.LESS_THAN_OR_EQUAL)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(true)
                .build()

        val roundtrippedLessThanOrEqual =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lessThanOrEqual),
                jacksonTypeRef<LessThanOrEqual>(),
            )

        assertThat(roundtrippedLessThanOrEqual).isEqualTo(lessThanOrEqual)
    }
}
