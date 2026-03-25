// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConcatStringsTest {

    @Test
    fun create() {
        val concatStrings =
            ConcatStrings.builder()
                .operator(ConcatStrings.Operator.CONCAT_STRINGS)
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

        assertThat(concatStrings.operator()).isEqualTo(ConcatStrings.Operator.CONCAT_STRINGS)
        assertThat(concatStrings.inputs().getOrNull())
            .containsExactly(
                ConcatStrings.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(concatStrings.propertyName()).contains("propertyName")
        assertThat(concatStrings.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val concatStrings =
            ConcatStrings.builder()
                .operator(ConcatStrings.Operator.CONCAT_STRINGS)
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

        val roundtrippedConcatStrings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(concatStrings),
                jacksonTypeRef<ConcatStrings>(),
            )

        assertThat(roundtrippedConcatStrings).isEqualTo(concatStrings)
    }
}
