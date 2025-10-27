// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicStatusRequestTest {

    @Test
    fun create() {
        val publicStatusRequest =
            PublicStatusRequest.builder()
                .channel(PublicStatusRequest.Channel.EMAIL)
                .statusState(PublicStatusRequest.StatusState.SUBSCRIBED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0)
                .legalBasis(PublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        assertThat(publicStatusRequest.channel()).isEqualTo(PublicStatusRequest.Channel.EMAIL)
        assertThat(publicStatusRequest.statusState())
            .isEqualTo(PublicStatusRequest.StatusState.SUBSCRIBED)
        assertThat(publicStatusRequest.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(publicStatusRequest.subscriptionId()).isEqualTo(0)
        assertThat(publicStatusRequest.legalBasis())
            .contains(PublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
        assertThat(publicStatusRequest.legalBasisExplanation()).contains("legalBasisExplanation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStatusRequest =
            PublicStatusRequest.builder()
                .channel(PublicStatusRequest.Channel.EMAIL)
                .statusState(PublicStatusRequest.StatusState.SUBSCRIBED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0)
                .legalBasis(PublicStatusRequest.LegalBasis.LEGITIMATE_INTEREST_PQL)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        val roundtrippedPublicStatusRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicStatusRequest),
                jacksonTypeRef<PublicStatusRequest>(),
            )

        assertThat(roundtrippedPublicStatusRequest).isEqualTo(publicStatusRequest)
    }
}
