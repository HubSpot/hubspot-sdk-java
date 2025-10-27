// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalConsentOptionsImplicitConsentToProcessTest {

    @Test
    fun create() {
        val legalConsentOptionsImplicitConsentToProcess =
            LegalConsentOptionsImplicitConsentToProcess.builder()
                .addCommunicationsCheckbox(
                    LegalConsentCheckbox.builder()
                        .label("label")
                        .required(true)
                        .subscriptionTypeId(0)
                        .build()
                )
                .privacyText("privacyText")
                .type(LegalConsentOptionsImplicitConsentToProcess.Type.IMPLICIT_CONSENT_TO_PROCESS)
                .communicationConsentText("communicationConsentText")
                .consentToProcessText("consentToProcessText")
                .build()

        assertThat(legalConsentOptionsImplicitConsentToProcess.communicationsCheckboxes())
            .containsExactly(
                LegalConsentCheckbox.builder()
                    .label("label")
                    .required(true)
                    .subscriptionTypeId(0)
                    .build()
            )
        assertThat(legalConsentOptionsImplicitConsentToProcess.privacyText())
            .isEqualTo("privacyText")
        assertThat(legalConsentOptionsImplicitConsentToProcess.type())
            .isEqualTo(LegalConsentOptionsImplicitConsentToProcess.Type.IMPLICIT_CONSENT_TO_PROCESS)
        assertThat(legalConsentOptionsImplicitConsentToProcess.communicationConsentText())
            .contains("communicationConsentText")
        assertThat(legalConsentOptionsImplicitConsentToProcess.consentToProcessText())
            .contains("consentToProcessText")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalConsentOptionsImplicitConsentToProcess =
            LegalConsentOptionsImplicitConsentToProcess.builder()
                .addCommunicationsCheckbox(
                    LegalConsentCheckbox.builder()
                        .label("label")
                        .required(true)
                        .subscriptionTypeId(0)
                        .build()
                )
                .privacyText("privacyText")
                .type(LegalConsentOptionsImplicitConsentToProcess.Type.IMPLICIT_CONSENT_TO_PROCESS)
                .communicationConsentText("communicationConsentText")
                .consentToProcessText("consentToProcessText")
                .build()

        val roundtrippedLegalConsentOptionsImplicitConsentToProcess =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalConsentOptionsImplicitConsentToProcess),
                jacksonTypeRef<LegalConsentOptionsImplicitConsentToProcess>(),
            )

        assertThat(roundtrippedLegalConsentOptionsImplicitConsentToProcess)
            .isEqualTo(legalConsentOptionsImplicitConsentToProcess)
    }
}
