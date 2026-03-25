// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSubscriptionStatusesResponseTest {

    @Test
    fun create() {
        val publicSubscriptionStatusesResponse =
            PublicSubscriptionStatusesResponse.builder()
                .recipient("recipient")
                .addSubscriptionStatus(
                    PublicSubscriptionStatus.builder()
                        .id("id")
                        .description("description")
                        .name("name")
                        .sourceOfStatus(PublicSubscriptionStatus.SourceOfStatus.BRAND_WIDE_STATUS)
                        .status(PublicSubscriptionStatus.Status.NOT_SUBSCRIBED)
                        .brandId(0L)
                        .legalBasis(PublicSubscriptionStatus.LegalBasis.CONSENT_WITH_NOTICE)
                        .legalBasisExplanation("legalBasisExplanation")
                        .preferenceGroupName("preferenceGroupName")
                        .build()
                )
                .build()

        assertThat(publicSubscriptionStatusesResponse.recipient()).isEqualTo("recipient")
        assertThat(publicSubscriptionStatusesResponse.subscriptionStatuses())
            .containsExactly(
                PublicSubscriptionStatus.builder()
                    .id("id")
                    .description("description")
                    .name("name")
                    .sourceOfStatus(PublicSubscriptionStatus.SourceOfStatus.BRAND_WIDE_STATUS)
                    .status(PublicSubscriptionStatus.Status.NOT_SUBSCRIBED)
                    .brandId(0L)
                    .legalBasis(PublicSubscriptionStatus.LegalBasis.CONSENT_WITH_NOTICE)
                    .legalBasisExplanation("legalBasisExplanation")
                    .preferenceGroupName("preferenceGroupName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSubscriptionStatusesResponse =
            PublicSubscriptionStatusesResponse.builder()
                .recipient("recipient")
                .addSubscriptionStatus(
                    PublicSubscriptionStatus.builder()
                        .id("id")
                        .description("description")
                        .name("name")
                        .sourceOfStatus(PublicSubscriptionStatus.SourceOfStatus.BRAND_WIDE_STATUS)
                        .status(PublicSubscriptionStatus.Status.NOT_SUBSCRIBED)
                        .brandId(0L)
                        .legalBasis(PublicSubscriptionStatus.LegalBasis.CONSENT_WITH_NOTICE)
                        .legalBasisExplanation("legalBasisExplanation")
                        .preferenceGroupName("preferenceGroupName")
                        .build()
                )
                .build()

        val roundtrippedPublicSubscriptionStatusesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSubscriptionStatusesResponse),
                jacksonTypeRef<PublicSubscriptionStatusesResponse>(),
            )

        assertThat(roundtrippedPublicSubscriptionStatusesResponse)
            .isEqualTo(publicSubscriptionStatusesResponse)
    }
}
