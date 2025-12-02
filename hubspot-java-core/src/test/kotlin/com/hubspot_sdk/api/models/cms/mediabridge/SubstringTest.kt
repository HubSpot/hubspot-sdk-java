// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubstringTest {

    @Test
    fun create() {
        val substring =
            Substring.builder()
                .operator(Substring.Operator.SUBSTRING)
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
                .value("value")
                .build()

        assertThat(substring.operator()).isEqualTo(Substring.Operator.SUBSTRING)
        assertThat(substring.stringToCheck())
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
        assertThat(substring.inputs().getOrNull()).containsExactly()
        assertThat(substring.propertyName()).contains("propertyName")
        assertThat(substring.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val substring =
            Substring.builder()
                .operator(Substring.Operator.SUBSTRING)
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
                .value("value")
                .build()

        val roundtrippedSubstring =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(substring),
                jacksonTypeRef<Substring>(),
            )

        assertThat(roundtrippedSubstring).isEqualTo(substring)
    }
}
