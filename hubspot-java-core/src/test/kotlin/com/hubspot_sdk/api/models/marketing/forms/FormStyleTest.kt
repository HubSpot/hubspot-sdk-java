// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormStyleTest {

    @Test
    fun create() {
        val formStyle =
            FormStyle.builder()
                .backgroundWidth("backgroundWidth")
                .fontFamily("fontFamily")
                .helpTextColor("helpTextColor")
                .helpTextSize("helpTextSize")
                .labelTextColor("labelTextColor")
                .labelTextSize("labelTextSize")
                .legalConsentTextColor("legalConsentTextColor")
                .legalConsentTextSize("legalConsentTextSize")
                .submitAlignment(FormStyle.SubmitAlignment.CENTER)
                .submitColor("submitColor")
                .submitFontColor("submitFontColor")
                .submitSize("submitSize")
                .build()

        assertThat(formStyle.backgroundWidth()).isEqualTo("backgroundWidth")
        assertThat(formStyle.fontFamily()).isEqualTo("fontFamily")
        assertThat(formStyle.helpTextColor()).isEqualTo("helpTextColor")
        assertThat(formStyle.helpTextSize()).isEqualTo("helpTextSize")
        assertThat(formStyle.labelTextColor()).isEqualTo("labelTextColor")
        assertThat(formStyle.labelTextSize()).isEqualTo("labelTextSize")
        assertThat(formStyle.legalConsentTextColor()).isEqualTo("legalConsentTextColor")
        assertThat(formStyle.legalConsentTextSize()).isEqualTo("legalConsentTextSize")
        assertThat(formStyle.submitAlignment()).isEqualTo(FormStyle.SubmitAlignment.CENTER)
        assertThat(formStyle.submitColor()).isEqualTo("submitColor")
        assertThat(formStyle.submitFontColor()).isEqualTo("submitFontColor")
        assertThat(formStyle.submitSize()).isEqualTo("submitSize")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formStyle =
            FormStyle.builder()
                .backgroundWidth("backgroundWidth")
                .fontFamily("fontFamily")
                .helpTextColor("helpTextColor")
                .helpTextSize("helpTextSize")
                .labelTextColor("labelTextColor")
                .labelTextSize("labelTextSize")
                .legalConsentTextColor("legalConsentTextColor")
                .legalConsentTextSize("legalConsentTextSize")
                .submitAlignment(FormStyle.SubmitAlignment.CENTER)
                .submitColor("submitColor")
                .submitFontColor("submitFontColor")
                .submitSize("submitSize")
                .build()

        val roundtrippedFormStyle =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formStyle),
                jacksonTypeRef<FormStyle>(),
            )

        assertThat(roundtrippedFormStyle).isEqualTo(formStyle)
    }
}
