// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormatPhoneNumberTest {

    @Test
    fun create() {
        val formatPhoneNumber =
            FormatPhoneNumber.builder()
                .operator(FormatPhoneNumber.Operator.FORMAT_PHONE_NUMBER)
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

        assertThat(formatPhoneNumber.operator())
            .isEqualTo(FormatPhoneNumber.Operator.FORMAT_PHONE_NUMBER)
        assertThat(formatPhoneNumber.inputs().getOrNull())
            .containsExactly(
                FormatPhoneNumber.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(formatPhoneNumber.propertyName()).contains("propertyName")
        assertThat(formatPhoneNumber.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formatPhoneNumber =
            FormatPhoneNumber.builder()
                .operator(FormatPhoneNumber.Operator.FORMAT_PHONE_NUMBER)
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

        val roundtrippedFormatPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formatPhoneNumber),
                jacksonTypeRef<FormatPhoneNumber>(),
            )

        assertThat(roundtrippedFormatPhoneNumber).isEqualTo(formatPhoneNumber)
    }
}
