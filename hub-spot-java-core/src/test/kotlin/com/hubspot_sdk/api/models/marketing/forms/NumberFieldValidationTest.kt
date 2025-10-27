// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberFieldValidationTest {

    @Test
    fun create() {
        val numberFieldValidation =
            NumberFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()

        assertThat(numberFieldValidation.maxAllowedDigits()).isEqualTo(0)
        assertThat(numberFieldValidation.minAllowedDigits()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberFieldValidation =
            NumberFieldValidation.builder().maxAllowedDigits(0).minAllowedDigits(0).build()

        val roundtrippedNumberFieldValidation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberFieldValidation),
                jacksonTypeRef<NumberFieldValidation>(),
            )

        assertThat(roundtrippedNumberFieldValidation).isEqualTo(numberFieldValidation)
    }
}
