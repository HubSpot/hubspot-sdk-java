// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParseNumberTest {

    @Test
    fun create() {
        val parseNumber =
            ParseNumber.builder()
                .operator(ParseNumber.Operator.PARSE_NUMBER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        assertThat(parseNumber.operator()).isEqualTo(ParseNumber.Operator.PARSE_NUMBER)
        assertThat(parseNumber.inputs().getOrNull())
            .containsExactly(
                ParseNumber.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(parseNumber.propertyName()).contains("propertyName")
        assertThat(parseNumber.value()).contains(0.0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val parseNumber =
            ParseNumber.builder()
                .operator(ParseNumber.Operator.PARSE_NUMBER)
                .addInput(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
                .propertyName("propertyName")
                .value(0.0)
                .build()

        val roundtrippedParseNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(parseNumber),
                jacksonTypeRef<ParseNumber>(),
            )

        assertThat(roundtrippedParseNumber).isEqualTo(parseNumber)
    }
}
