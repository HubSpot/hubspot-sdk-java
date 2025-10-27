// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartialPublicStatusRequestTest {

    @Test
    fun create() {
        val partialPublicStatusRequest =
            PartialPublicStatusRequest.builder()
                .channel(PartialPublicStatusRequest.Channel.EMAIL)
                .statusState(PartialPublicStatusRequest.StatusState.SUBSCRIBED)
                .subscriptionId(0L)
                .legalBasis(PartialPublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        assertThat(partialPublicStatusRequest.channel())
            .isEqualTo(PartialPublicStatusRequest.Channel.EMAIL)
        assertThat(partialPublicStatusRequest.statusState())
            .isEqualTo(PartialPublicStatusRequest.StatusState.SUBSCRIBED)
        assertThat(partialPublicStatusRequest.subscriptionId()).isEqualTo(0L)
        assertThat(partialPublicStatusRequest.legalBasis())
            .contains(PartialPublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
        assertThat(partialPublicStatusRequest.legalBasisExplanation())
            .contains("legalBasisExplanation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partialPublicStatusRequest =
            PartialPublicStatusRequest.builder()
                .channel(PartialPublicStatusRequest.Channel.EMAIL)
                .statusState(PartialPublicStatusRequest.StatusState.SUBSCRIBED)
                .subscriptionId(0L)
                .legalBasis(PartialPublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
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
