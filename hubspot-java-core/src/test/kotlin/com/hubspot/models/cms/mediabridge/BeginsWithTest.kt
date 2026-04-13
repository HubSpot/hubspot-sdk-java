// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeginsWithTest {

    @Test
    fun create() {
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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

        assertThat(beginsWith.operator()).isEqualTo(BeginsWith.Operator.BEGINS_WITH)
        assertThat(beginsWith.stringToCheck())
            .isEqualTo(
                BeginsWith.StringToCheck.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(beginsWith.inputs().getOrNull())
            .containsExactly(
                BeginsWith.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(beginsWith.propertyName()).contains("propertyName")
        assertThat(beginsWith.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beginsWith =
            BeginsWith.builder()
                .operator(BeginsWith.Operator.BEGINS_WITH)
                .stringToCheck(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
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

        val roundtrippedBeginsWith =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beginsWith),
                jacksonTypeRef<BeginsWith>(),
            )

        assertThat(roundtrippedBeginsWith).isEqualTo(beginsWith)
    }
}
