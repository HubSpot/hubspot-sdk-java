// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSubscriptionStatusTest {

    @Test
    fun create() {
        val publicSubscriptionStatus =
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

        assertThat(publicSubscriptionStatus.id()).isEqualTo("id")
        assertThat(publicSubscriptionStatus.description()).isEqualTo("description")
        assertThat(publicSubscriptionStatus.name()).isEqualTo("name")
        assertThat(publicSubscriptionStatus.sourceOfStatus())
            .isEqualTo(PublicSubscriptionStatus.SourceOfStatus.BRAND_WIDE_STATUS)
        assertThat(publicSubscriptionStatus.status())
            .isEqualTo(PublicSubscriptionStatus.Status.NOT_SUBSCRIBED)
        assertThat(publicSubscriptionStatus.brandId()).contains(0L)
        assertThat(publicSubscriptionStatus.legalBasis())
            .contains(PublicSubscriptionStatus.LegalBasis.CONSENT_WITH_NOTICE)
        assertThat(publicSubscriptionStatus.legalBasisExplanation())
            .contains("legalBasisExplanation")
        assertThat(publicSubscriptionStatus.preferenceGroupName()).contains("preferenceGroupName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSubscriptionStatus =
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

        val roundtrippedPublicSubscriptionStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSubscriptionStatus),
                jacksonTypeRef<PublicSubscriptionStatus>(),
            )

        assertThat(roundtrippedPublicSubscriptionStatus).isEqualTo(publicSubscriptionStatus)
    }
}
