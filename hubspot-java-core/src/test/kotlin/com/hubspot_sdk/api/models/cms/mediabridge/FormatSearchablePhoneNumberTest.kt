// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormatSearchablePhoneNumberTest {

    @Test
    fun create() {
        val formatSearchablePhoneNumber =
            FormatSearchablePhoneNumber.builder()
                .operator(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
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

        assertThat(formatSearchablePhoneNumber.operator())
            .isEqualTo(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
        assertThat(formatSearchablePhoneNumber.inputs().getOrNull())
            .containsExactly(
                FormatSearchablePhoneNumber.Input.ofConstantBoolean(
                    ConstantBoolean.builder()
                        .operator(ConstantBoolean.Operator.CONSTANT_BOOLEAN)
                        .propertyName("propertyName")
                        .value(true)
                        .build()
                )
            )
        assertThat(formatSearchablePhoneNumber.propertyName()).contains("propertyName")
        assertThat(formatSearchablePhoneNumber.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formatSearchablePhoneNumber =
            FormatSearchablePhoneNumber.builder()
                .operator(FormatSearchablePhoneNumber.Operator.FORMAT_SEARCHABLE_PHONE_NUMBER)
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

        val roundtrippedFormatSearchablePhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formatSearchablePhoneNumber),
                jacksonTypeRef<FormatSearchablePhoneNumber>(),
            )

        assertThat(roundtrippedFormatSearchablePhoneNumber).isEqualTo(formatSearchablePhoneNumber)
    }
}
