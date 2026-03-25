// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormatFullNameTest {

    @Test
    fun create() {
        val formatFullName =
            FormatFullName.builder()
                .operator(FormatFullName.Operator.FORMAT_FULL_NAME)
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

        assertThat(formatFullName.operator()).isEqualTo(FormatFullName.Operator.FORMAT_FULL_NAME)
        assertThat(formatFullName.inputs().getOrNull())
            .containsExactly(
                FormatFullName.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(formatFullName.propertyName()).contains("propertyName")
        assertThat(formatFullName.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formatFullName =
            FormatFullName.builder()
                .operator(FormatFullName.Operator.FORMAT_FULL_NAME)
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

        val roundtrippedFormatFullName =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formatFullName),
                jacksonTypeRef<FormatFullName>(),
            )

        assertThat(roundtrippedFormatFullName).isEqualTo(formatFullName)
    }
}
