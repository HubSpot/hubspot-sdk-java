// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.scheduler.meetings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLegalConsentOptionsTest {

    @Test
    fun create() {
        val externalLegalConsentOptions =
            ExternalLegalConsentOptions.builder()
                .addCommunicationConsentCheckbox(
                    ExternalCommunicationConsentCheckbox.builder()
                        .communicationTypeId("communicationTypeId")
                        .label("label")
                        .required(true)
                        .build()
                )
                .communicationConsentText("communicationConsentText")
                .isLegitimateInterest(true)
                .addLegitimateInterestSubscriptionType(0L)
                .privacyPolicyText("privacyPolicyText")
                .processingConsentCheckboxLabel("processingConsentCheckboxLabel")
                .processingConsentFooterText("processingConsentFooterText")
                .processingConsentText("processingConsentText")
                .processingConsentType("processingConsentType")
                .legitimateInterestLegalBasis(
                    ExternalLegalConsentOptions.LegitimateInterestLegalBasis.LEGITIMATE_INTEREST_PQL
                )
                .build()

        assertThat(externalLegalConsentOptions.communicationConsentCheckboxes())
            .containsExactly(
                ExternalCommunicationConsentCheckbox.builder()
                    .communicationTypeId("communicationTypeId")
                    .label("label")
                    .required(true)
                    .build()
            )
        assertThat(externalLegalConsentOptions.communicationConsentText())
            .isEqualTo("communicationConsentText")
        assertThat(externalLegalConsentOptions.isLegitimateInterest()).isEqualTo(true)
        assertThat(externalLegalConsentOptions.legitimateInterestSubscriptionTypes())
            .containsExactly(0L)
        assertThat(externalLegalConsentOptions.privacyPolicyText()).isEqualTo("privacyPolicyText")
        assertThat(externalLegalConsentOptions.processingConsentCheckboxLabel())
            .isEqualTo("processingConsentCheckboxLabel")
        assertThat(externalLegalConsentOptions.processingConsentFooterText())
            .isEqualTo("processingConsentFooterText")
        assertThat(externalLegalConsentOptions.processingConsentText())
            .isEqualTo("processingConsentText")
        assertThat(externalLegalConsentOptions.processingConsentType())
            .isEqualTo("processingConsentType")
        assertThat(externalLegalConsentOptions.legitimateInterestLegalBasis())
            .contains(
                ExternalLegalConsentOptions.LegitimateInterestLegalBasis.LEGITIMATE_INTEREST_PQL
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLegalConsentOptions =
            ExternalLegalConsentOptions.builder()
                .addCommunicationConsentCheckbox(
                    ExternalCommunicationConsentCheckbox.builder()
                        .communicationTypeId("communicationTypeId")
                        .label("label")
                        .required(true)
                        .build()
                )
                .communicationConsentText("communicationConsentText")
                .isLegitimateInterest(true)
                .addLegitimateInterestSubscriptionType(0L)
                .privacyPolicyText("privacyPolicyText")
                .processingConsentCheckboxLabel("processingConsentCheckboxLabel")
                .processingConsentFooterText("processingConsentFooterText")
                .processingConsentText("processingConsentText")
                .processingConsentType("processingConsentType")
                .legitimateInterestLegalBasis(
                    ExternalLegalConsentOptions.LegitimateInterestLegalBasis.LEGITIMATE_INTEREST_PQL
                )
                .build()

        val roundtrippedExternalLegalConsentOptions =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLegalConsentOptions),
                jacksonTypeRef<ExternalLegalConsentOptions>(),
            )

        assertThat(roundtrippedExternalLegalConsentOptions).isEqualTo(externalLegalConsentOptions)
    }
}
