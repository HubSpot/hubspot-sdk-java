// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalConsentCheckboxTest {

    @Test
    fun create() {
        val legalConsentCheckbox =
            LegalConsentCheckbox.builder()
                .label("label")
                .required(true)
                .subscriptionTypeId(0)
                .build()

        assertThat(legalConsentCheckbox.label()).isEqualTo("label")
        assertThat(legalConsentCheckbox.required()).isEqualTo(true)
        assertThat(legalConsentCheckbox.subscriptionTypeId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalConsentCheckbox =
            LegalConsentCheckbox.builder()
                .label("label")
                .required(true)
                .subscriptionTypeId(0)
                .build()

        val roundtrippedLegalConsentCheckbox =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalConsentCheckbox),
                jacksonTypeRef<LegalConsentCheckbox>(),
            )

        assertThat(roundtrippedLegalConsentCheckbox).isEqualTo(legalConsentCheckbox)
    }
}
