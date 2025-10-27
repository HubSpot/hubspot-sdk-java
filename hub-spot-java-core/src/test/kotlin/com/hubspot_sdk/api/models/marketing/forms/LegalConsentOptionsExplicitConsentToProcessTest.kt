// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalConsentOptionsExplicitConsentToProcessTest {

    @Test
    fun create() {
        val legalConsentOptionsExplicitConsentToProcess =
            LegalConsentOptionsExplicitConsentToProcess.builder()
                .addCommunicationsCheckbox(
                    LegalConsentCheckbox.builder()
                        .label("label")
                        .required(true)
                        .subscriptionTypeId(0)
                        .build()
                )
                .privacyText("privacyText")
                .type(LegalConsentOptionsExplicitConsentToProcess.Type.EXPLICIT_CONSENT_TO_PROCESS)
                .communicationConsentText("communicationConsentText")
                .consentToProcessCheckboxLabel("consentToProcessCheckboxLabel")
                .consentToProcessFooterText("consentToProcessFooterText")
                .consentToProcessText("consentToProcessText")
                .build()

        assertThat(legalConsentOptionsExplicitConsentToProcess.communicationsCheckboxes())
            .containsExactly(
                LegalConsentCheckbox.builder()
                    .label("label")
                    .required(true)
                    .subscriptionTypeId(0)
                    .build()
            )
        assertThat(legalConsentOptionsExplicitConsentToProcess.privacyText())
            .isEqualTo("privacyText")
        assertThat(legalConsentOptionsExplicitConsentToProcess.type())
            .isEqualTo(LegalConsentOptionsExplicitConsentToProcess.Type.EXPLICIT_CONSENT_TO_PROCESS)
        assertThat(legalConsentOptionsExplicitConsentToProcess.communicationConsentText())
            .contains("communicationConsentText")
        assertThat(legalConsentOptionsExplicitConsentToProcess.consentToProcessCheckboxLabel())
            .contains("consentToProcessCheckboxLabel")
        assertThat(legalConsentOptionsExplicitConsentToProcess.consentToProcessFooterText())
            .contains("consentToProcessFooterText")
        assertThat(legalConsentOptionsExplicitConsentToProcess.consentToProcessText())
            .contains("consentToProcessText")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalConsentOptionsExplicitConsentToProcess =
            LegalConsentOptionsExplicitConsentToProcess.builder()
                .addCommunicationsCheckbox(
                    LegalConsentCheckbox.builder()
                        .label("label")
                        .required(true)
                        .subscriptionTypeId(0)
                        .build()
                )
                .privacyText("privacyText")
                .type(LegalConsentOptionsExplicitConsentToProcess.Type.EXPLICIT_CONSENT_TO_PROCESS)
                .communicationConsentText("communicationConsentText")
                .consentToProcessCheckboxLabel("consentToProcessCheckboxLabel")
                .consentToProcessFooterText("consentToProcessFooterText")
                .consentToProcessText("consentToProcessText")
                .build()

        val roundtrippedLegalConsentOptionsExplicitConsentToProcess =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalConsentOptionsExplicitConsentToProcess),
                jacksonTypeRef<LegalConsentOptionsExplicitConsentToProcess>(),
            )

        assertThat(roundtrippedLegalConsentOptionsExplicitConsentToProcess)
            .isEqualTo(legalConsentOptionsExplicitConsentToProcess)
    }
}
