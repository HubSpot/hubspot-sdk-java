// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailFieldValidationTest {

    @Test
    fun create() {
        val emailFieldValidation =
            EmailFieldValidation.builder()
                .addBlockedEmailDomain("string")
                .useDefaultBlockList(true)
                .build()

        assertThat(emailFieldValidation.blockedEmailDomains()).containsExactly("string")
        assertThat(emailFieldValidation.useDefaultBlockList()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailFieldValidation =
            EmailFieldValidation.builder()
                .addBlockedEmailDomain("string")
                .useDefaultBlockList(true)
                .build()

        val roundtrippedEmailFieldValidation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailFieldValidation),
                jacksonTypeRef<EmailFieldValidation>(),
            )

        assertThat(roundtrippedEmailFieldValidation).isEqualTo(emailFieldValidation)
    }
}
