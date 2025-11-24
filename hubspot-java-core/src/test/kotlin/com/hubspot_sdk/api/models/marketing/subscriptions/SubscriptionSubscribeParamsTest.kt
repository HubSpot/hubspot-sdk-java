// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionSubscribeParamsTest {

    @Test
    fun create() {
        SubscriptionSubscribeParams.builder()
            .publicUpdateSubscriptionStatusRequest(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionSubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(
                    PublicUpdateSubscriptionStatusRequest.builder()
                        .emailAddress("emailAddress")
                        .subscriptionId("subscriptionId")
                        .legalBasis(
                            PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE
                        )
                        .legalBasisExplanation("legalBasisExplanation")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .legalBasis(
                        PublicUpdateSubscriptionStatusRequest.LegalBasis.CONSENT_WITH_NOTICE
                    )
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionSubscribeParams.builder()
                .publicUpdateSubscriptionStatusRequest(
                    PublicUpdateSubscriptionStatusRequest.builder()
                        .emailAddress("emailAddress")
                        .subscriptionId("subscriptionId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicUpdateSubscriptionStatusRequest.builder()
                    .emailAddress("emailAddress")
                    .subscriptionId("subscriptionId")
                    .build()
            )
    }
}
