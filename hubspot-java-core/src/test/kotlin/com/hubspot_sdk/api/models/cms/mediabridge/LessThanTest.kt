// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LessThanTest {

    @Test
    fun create() {
        val lessThan =
            LessThan.builder()
                .operator(LessThan.Operator.LESS_THAN)
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

        assertThat(lessThan.operator()).isEqualTo(LessThan.Operator.LESS_THAN)
        assertThat(lessThan.inputs().getOrNull())
            .containsExactly(
                LessThan.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(lessThan.propertyName()).contains("propertyName")
        assertThat(lessThan.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lessThan =
            LessThan.builder()
                .operator(LessThan.Operator.LESS_THAN)
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

        val roundtrippedLessThan =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lessThan),
                jacksonTypeRef<LessThan>(),
            )

        assertThat(roundtrippedLessThan).isEqualTo(lessThan)
    }
}
