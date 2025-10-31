// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneFieldValidationTest {

    @Test
    fun create() {
        val phoneFieldValidation =
            PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()

        assertThat(phoneFieldValidation.maxAllowedDigits()).isEqualTo(0)
        assertThat(phoneFieldValidation.minAllowedDigits()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneFieldValidation =
            PhoneFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()

        val roundtrippedPhoneFieldValidation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneFieldValidation),
                jacksonTypeRef<PhoneFieldValidation>(),
            )

        assertThat(roundtrippedPhoneFieldValidation).isEqualTo(phoneFieldValidation)
    }
}
