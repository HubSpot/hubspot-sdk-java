// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MoreThanTest {

    @Test
    fun create() {
        val moreThan =
            MoreThan.builder()
                .operator(MoreThan.Operator.MORE_THAN)
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

        assertThat(moreThan.operator()).isEqualTo(MoreThan.Operator.MORE_THAN)
        assertThat(moreThan.inputs().getOrNull())
            .containsExactly(
                MoreThan.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(moreThan.propertyName()).contains("propertyName")
        assertThat(moreThan.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val moreThan =
            MoreThan.builder()
                .operator(MoreThan.Operator.MORE_THAN)
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

        val roundtrippedMoreThan =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(moreThan),
                jacksonTypeRef<MoreThan>(),
            )

        assertThat(roundtrippedMoreThan).isEqualTo(moreThan)
    }
}
