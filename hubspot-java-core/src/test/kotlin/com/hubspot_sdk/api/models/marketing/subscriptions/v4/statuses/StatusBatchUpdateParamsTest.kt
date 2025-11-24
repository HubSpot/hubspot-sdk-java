// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4.statuses

import com.hubspot_sdk.api.models.marketing.subscriptions.v4.BatchInputPublicStatusRequest
import com.hubspot_sdk.api.models.marketing.subscriptions.v4.PublicStatusRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StatusBatchUpdateParamsTest {

    @Test
    fun create() {
        StatusBatchUpdateParams.builder()
            .batchInputPublicStatusRequest(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            StatusBatchUpdateParams.builder()
                .batchInputPublicStatusRequest(
                    BatchInputPublicStatusRequest.builder()
                        .addInput(
                            PublicStatusRequest.builder()
                                .channel(PublicStatusRequest.Channel.EMAIL)
                                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0)
                                .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                                .legalBasisExplanation("legalBasisExplanation")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                            .legalBasisExplanation("legalBasisExplanation")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StatusBatchUpdateParams.builder()
                .batchInputPublicStatusRequest(
                    BatchInputPublicStatusRequest.builder()
                        .addInput(
                            PublicStatusRequest.builder()
                                .channel(PublicStatusRequest.Channel.EMAIL)
                                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0)
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0)
                            .build()
                    )
                    .build()
            )
    }
}
