// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUpdateSubscriptionStatusRequestTest {

    @Test
    fun create() {
        val publicUpdateSubscriptionStatusRequest =
            PublicUpdateSubscriptionStatusRequest.builder()
                .emailAddress("emailAddress")
                .subscriptionId("subscriptionId")
                .legalBasis(PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        assertThat(publicUpdateSubscriptionStatusRequest.emailAddress()).isEqualTo("emailAddress")
        assertThat(publicUpdateSubscriptionStatusRequest.subscriptionId())
            .isEqualTo("subscriptionId")
        assertThat(publicUpdateSubscriptionStatusRequest.legalBasis())
            .contains(PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
        assertThat(publicUpdateSubscriptionStatusRequest.legalBasisExplanation())
            .contains("legalBasisExplanation")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicUpdateSubscriptionStatusRequest =
            PublicUpdateSubscriptionStatusRequest.builder()
                .emailAddress("emailAddress")
                .subscriptionId("subscriptionId")
                .legalBasis(PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .build()

        val roundtrippedPublicUpdateSubscriptionStatusRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUpdateSubscriptionStatusRequest),
                jacksonTypeRef<PublicUpdateSubscriptionStatusRequest>(),
            )

        assertThat(roundtrippedPublicUpdateSubscriptionStatusRequest)
            .isEqualTo(publicUpdateSubscriptionStatusRequest)
    }
}
