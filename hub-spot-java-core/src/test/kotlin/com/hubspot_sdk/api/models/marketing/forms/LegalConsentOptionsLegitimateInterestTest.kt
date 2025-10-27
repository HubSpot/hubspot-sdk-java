// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.forms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LegalConsentOptionsLegitimateInterestTest {

    @Test
    fun create() {
        val legalConsentOptionsLegitimateInterest =
            LegalConsentOptionsLegitimateInterest.builder()
                .lawfulBasis(LegalConsentOptionsLegitimateInterest.LawfulBasis.LEAD)
                .privacyText("privacyText")
                .addSubscriptionTypeId(0L)
                .type(LegalConsentOptionsLegitimateInterest.Type.LEGITIMATE_INTEREST)
                .build()

        assertThat(legalConsentOptionsLegitimateInterest.lawfulBasis())
            .isEqualTo(LegalConsentOptionsLegitimateInterest.LawfulBasis.LEAD)
        assertThat(legalConsentOptionsLegitimateInterest.privacyText()).isEqualTo("privacyText")
        assertThat(legalConsentOptionsLegitimateInterest.subscriptionTypeIds()).containsExactly(0L)
        assertThat(legalConsentOptionsLegitimateInterest.type())
            .isEqualTo(LegalConsentOptionsLegitimateInterest.Type.LEGITIMATE_INTEREST)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val legalConsentOptionsLegitimateInterest =
            LegalConsentOptionsLegitimateInterest.builder()
                .lawfulBasis(LegalConsentOptionsLegitimateInterest.LawfulBasis.LEAD)
                .privacyText("privacyText")
                .addSubscriptionTypeId(0L)
                .type(LegalConsentOptionsLegitimateInterest.Type.LEGITIMATE_INTEREST)
                .build()

        val roundtrippedLegalConsentOptionsLegitimateInterest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(legalConsentOptionsLegitimateInterest),
                jacksonTypeRef<LegalConsentOptionsLegitimateInterest>(),
            )

        assertThat(roundtrippedLegalConsentOptionsLegitimateInterest)
            .isEqualTo(legalConsentOptionsLegitimateInterest)
    }
}
