// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AndTest {

    @Test
    fun create() {
        val and =
            And.builder()
                .enclosedInParentheses(true)
                .operator(And.Operator.AND)
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

        assertThat(and.enclosedInParentheses()).isEqualTo(true)
        assertThat(and.operator()).isEqualTo(And.Operator.AND)
        assertThat(and.inputs().getOrNull())
            .containsExactly(
                And.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(and.propertyName()).contains("propertyName")
        assertThat(and.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val and =
            And.builder()
                .enclosedInParentheses(true)
                .operator(And.Operator.AND)
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

        val roundtrippedAnd =
            jsonMapper.readValue(jsonMapper.writeValueAsString(and), jacksonTypeRef<And>())

        assertThat(roundtrippedAnd).isEqualTo(and)
    }
}
