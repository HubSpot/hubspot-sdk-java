// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotTest {

    @Test
    fun create() {
        val not =
            Not.builder()
                .operator(Not.Operator.NOT)
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

        assertThat(not.operator()).isEqualTo(Not.Operator.NOT)
        assertThat(not.inputs().getOrNull())
            .containsExactly(
                Not.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(not.propertyName()).contains("propertyName")
        assertThat(not.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val not =
            Not.builder()
                .operator(Not.Operator.NOT)
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

        val roundtrippedNot =
            jsonMapper.readValue(jsonMapper.writeValueAsString(not), jacksonTypeRef<Not>())

        assertThat(roundtrippedNot).isEqualTo(not)
    }
}
