// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.extensions.calling

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormattedPhoneNumberTest {

    @Test
    fun create() {
        val formattedPhoneNumber =
            FormattedPhoneNumber.builder()
                .e164Number("e164Number")
                .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                .extension("extension")
                .build()

        assertThat(formattedPhoneNumber.e164Number()).isEqualTo("e164Number")
        assertThat(formattedPhoneNumber.phoneNumberType())
            .isEqualTo(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
        assertThat(formattedPhoneNumber.extension()).contains("extension")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formattedPhoneNumber =
            FormattedPhoneNumber.builder()
                .e164Number("e164Number")
                .phoneNumberType(FormattedPhoneNumber.PhoneNumberType.FIXED_LINE)
                .extension("extension")
                .build()

        val roundtrippedFormattedPhoneNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formattedPhoneNumber),
                jacksonTypeRef<FormattedPhoneNumber>(),
            )

        assertThat(roundtrippedFormattedPhoneNumber).isEqualTo(formattedPhoneNumber)
    }
}
