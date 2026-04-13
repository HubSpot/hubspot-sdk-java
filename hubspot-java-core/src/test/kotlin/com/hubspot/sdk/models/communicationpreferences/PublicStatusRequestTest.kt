// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicStatusRequestTest {

    @Test
    fun create() {
        val publicStatusRequest =
            PublicStatusRequest.builder()
                .channel(PublicStatusRequest.Channel.EMAIL)
                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0)
                .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        assertThat(publicStatusRequest.channel()).isEqualTo(PublicStatusRequest.Channel.EMAIL)
        assertThat(publicStatusRequest.statusState())
            .isEqualTo(PublicStatusRequest.StatusState.NOT_SPECIFIED)
        assertThat(publicStatusRequest.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(publicStatusRequest.subscriptionId()).isEqualTo(0)
        assertThat(publicStatusRequest.legalBasis())
            .contains(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
        assertThat(publicStatusRequest.legalBasisExplanation()).contains("legalBasisExplanation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStatusRequest =
            PublicStatusRequest.builder()
                .channel(PublicStatusRequest.Channel.EMAIL)
                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0)
                .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
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
