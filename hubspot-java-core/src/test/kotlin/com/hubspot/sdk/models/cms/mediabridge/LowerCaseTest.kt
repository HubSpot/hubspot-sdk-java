// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LowerCaseTest {

    @Test
    fun create() {
        val lowerCase =
            LowerCase.builder()
                .operator(LowerCase.Operator.LOWER_CASE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        assertThat(lowerCase.operator()).isEqualTo(LowerCase.Operator.LOWER_CASE)
        assertThat(lowerCase.inputs().getOrNull())
            .containsExactly(
                LowerCase.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(lowerCase.propertyName()).contains("propertyName")
        assertThat(lowerCase.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lowerCase =
            LowerCase.builder()
                .operator(LowerCase.Operator.LOWER_CASE)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value("value")
                .build()

        val roundtrippedLowerCase =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lowerCase),
                jacksonTypeRef<LowerCase>(),
            )

        assertThat(roundtrippedLowerCase).isEqualTo(lowerCase)
    }
}
