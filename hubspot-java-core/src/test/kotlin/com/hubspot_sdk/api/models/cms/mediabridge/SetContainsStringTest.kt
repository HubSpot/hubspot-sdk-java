// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
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
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
                .propertyName("propertyName")
                .value(true)
                .build()

        assertThat(setContainsString.operator())
            .isEqualTo(SetContainsString.Operator.SET_CONTAINS_STRING)
        assertThat(setContainsString.stringToCheck())
            .isEqualTo(
                Expression.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(setContainsString.inputs().getOrNull()).containsExactly()
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
                        .inputs(listOf())
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .inputs(listOf())
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
