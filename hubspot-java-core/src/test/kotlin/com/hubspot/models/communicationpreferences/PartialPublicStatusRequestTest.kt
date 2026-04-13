// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartialPublicStatusRequestTest {

    @Test
    fun create() {
        val partialPublicStatusRequest =
            PartialPublicStatusRequest.builder()
                .channel(PartialPublicStatusRequest.Channel.EMAIL)
                .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                .subscriptionId(0L)
                .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        assertThat(partialPublicStatusRequest.channel())
            .isEqualTo(PartialPublicStatusRequest.Channel.EMAIL)
        assertThat(partialPublicStatusRequest.statusState())
            .isEqualTo(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
        assertThat(partialPublicStatusRequest.subscriptionId()).isEqualTo(0L)
        assertThat(partialPublicStatusRequest.legalBasis())
            .contains(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
        assertThat(partialPublicStatusRequest.legalBasisExplanation())
            .contains("legalBasisExplanation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partialPublicStatusRequest =
            PartialPublicStatusRequest.builder()
                .channel(PartialPublicStatusRequest.Channel.EMAIL)
                .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                .subscriptionId(0L)
                .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        val roundtrippedPartialPublicStatusRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partialPublicStatusRequest),
                jacksonTypeRef<PartialPublicStatusRequest>(),
            )

        assertThat(roundtrippedPartialPublicStatusRequest).isEqualTo(partialPublicStatusRequest)
    }
}
