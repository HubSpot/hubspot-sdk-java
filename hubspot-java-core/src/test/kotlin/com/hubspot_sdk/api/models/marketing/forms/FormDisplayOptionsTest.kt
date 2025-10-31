// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FormDisplayOptionsTest {

    @Test
    fun create() {
        val formDisplayOptions =
            FormDisplayOptions.builder()
                .renderRawHtml(true)
                .style(
                    FormStyle.builder()
                        .backgroundWidth("backgroundWidth")
                        .fontFamily("fontFamily")
                        .helpTextColor("helpTextColor")
                        .helpTextSize("helpTextSize")
                        .labelTextColor("labelTextColor")
                        .labelTextSize("labelTextSize")
                        .legalConsentTextColor("legalConsentTextColor")
                        .legalConsentTextSize("legalConsentTextSize")
                        .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                        .submitColor("submitColor")
                        .submitFontColor("submitFontColor")
                        .submitSize("submitSize")
                        .build()
                )
                .submitButtonText("submitButtonText")
                .theme(FormDisplayOptions.Theme.DEFAULT_STYLE)
                .cssClass("cssClass")
                .build()

        assertThat(formDisplayOptions.renderRawHtml()).isEqualTo(true)
        assertThat(formDisplayOptions.style())
            .isEqualTo(
                FormStyle.builder()
                    .backgroundWidth("backgroundWidth")
                    .fontFamily("fontFamily")
                    .helpTextColor("helpTextColor")
                    .helpTextSize("helpTextSize")
                    .labelTextColor("labelTextColor")
                    .labelTextSize("labelTextSize")
                    .legalConsentTextColor("legalConsentTextColor")
                    .legalConsentTextSize("legalConsentTextSize")
                    .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                    .submitColor("submitColor")
                    .submitFontColor("submitFontColor")
                    .submitSize("submitSize")
                    .build()
            )
        assertThat(formDisplayOptions.submitButtonText()).isEqualTo("submitButtonText")
        assertThat(formDisplayOptions.theme()).isEqualTo(FormDisplayOptions.Theme.DEFAULT_STYLE)
        assertThat(formDisplayOptions.cssClass()).contains("cssClass")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val formDisplayOptions =
            FormDisplayOptions.builder()
                .renderRawHtml(true)
                .style(
                    FormStyle.builder()
                        .backgroundWidth("backgroundWidth")
                        .fontFamily("fontFamily")
                        .helpTextColor("helpTextColor")
                        .helpTextSize("helpTextSize")
                        .labelTextColor("labelTextColor")
                        .labelTextSize("labelTextSize")
                        .legalConsentTextColor("legalConsentTextColor")
                        .legalConsentTextSize("legalConsentTextSize")
                        .submitAlignment(FormStyle.SubmitAlignment.LEFT)
                        .submitColor("submitColor")
                        .submitFontColor("submitFontColor")
                        .submitSize("submitSize")
                        .build()
                )
                .submitButtonText("submitButtonText")
                .theme(FormDisplayOptions.Theme.DEFAULT_STYLE)
                .cssClass("cssClass")
                .build()

        val roundtrippedFormDisplayOptions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(formDisplayOptions),
                jacksonTypeRef<FormDisplayOptions>(),
            )

        assertThat(roundtrippedFormDisplayOptions).isEqualTo(formDisplayOptions)
    }
}
