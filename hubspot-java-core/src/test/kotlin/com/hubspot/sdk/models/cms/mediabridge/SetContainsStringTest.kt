// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SetContainsStringTest {

    @Test
    fun create() {
        val setContainsString =
            SetContainsString.builder()
                .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
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

        assertThat(setContainsString.operator())
            .isEqualTo(SetContainsString.Operator.SET_CONTAINS_STRING)
        assertThat(setContainsString.stringToCheck())
            .isEqualTo(
                SetContainsString.StringToCheck.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(setContainsString.inputs().getOrNull())
            .containsExactly(
                SetContainsString.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(setContainsString.propertyName()).contains("propertyName")
        assertThat(setContainsString.value()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val setContainsString =
            SetContainsString.builder()
                .operator(SetContainsString.Operator.SET_CONTAINS_STRING)
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

        val roundtrippedSetContainsString =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(setContainsString),
                jacksonTypeRef<SetContainsString>(),
            )

        assertThat(roundtrippedSetContainsString).isEqualTo(setContainsString)
    }
}
