// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses

import com.hubspot_sdk.api.models.marketing.subscriptions.v4.PartialPublicStatusRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusUpdateParamsTest {

    @Test
    fun create() {
        StatusUpdateParams.builder()
            .subscriberIdString("subscriberIdString")
            .partialPublicStatusRequest(
                PartialPublicStatusRequest.builder()
                    .channel(PartialPublicStatusRequest.Channel.EMAIL)
                    .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                    .subscriptionId(0L)
                    .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StatusUpdateParams.builder()
                .subscriberIdString("subscriberIdString")
                .partialPublicStatusRequest(
                    PartialPublicStatusRequest.builder()
                        .channel(PartialPublicStatusRequest.Channel.EMAIL)
                        .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                        .subscriptionId(0L)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("subscriberIdString")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StatusUpdateParams.builder()
                .subscriberIdString("subscriberIdString")
                .partialPublicStatusRequest(
                    PartialPublicStatusRequest.builder()
                        .channel(PartialPublicStatusRequest.Channel.EMAIL)
                        .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                        .subscriptionId(0L)
                        .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                        .legalBasisExplanation("legalBasisExplanation")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PartialPublicStatusRequest.builder()
                    .channel(PartialPublicStatusRequest.Channel.EMAIL)
                    .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                    .subscriptionId(0L)
                    .legalBasis(PartialPublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StatusUpdateParams.builder()
                .subscriberIdString("subscriberIdString")
                .partialPublicStatusRequest(
                    PartialPublicStatusRequest.builder()
                        .channel(PartialPublicStatusRequest.Channel.EMAIL)
                        .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                        .subscriptionId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PartialPublicStatusRequest.builder()
                    .channel(PartialPublicStatusRequest.Channel.EMAIL)
                    .statusState(PartialPublicStatusRequest.StatusState.NOT_SPECIFIED)
                    .subscriptionId(0L)
                    .build()
            )
    }
}
