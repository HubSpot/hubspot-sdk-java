// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences.statuses.batch

import com.hubspot.sdk.models.communicationpreferences.BatchInputPublicStatusRequest
import com.hubspot.sdk.models.communicationpreferences.PublicStatusRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchUpdateStatusesParamsTest {

    @Test
    fun create() {
        BatchUpdateStatusesParams.builder()
            .batchInputPublicStatusRequest(
                BatchInputPublicStatusRequest.builder()
                    .addInput(
                        PublicStatusRequest.builder()
                            .channel(PublicStatusRequest.Channel.EMAIL)
                            .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                            .subscriberIdString("subscriberIdString")
                            .subscriptionId(0L)
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
            BatchUpdateStatusesParams.builder()
                .batchInputPublicStatusRequest(
                    BatchInputPublicStatusRequest.builder()
                        .addInput(
                            PublicStatusRequest.builder()
                                .channel(PublicStatusRequest.Channel.EMAIL)
                                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0L)
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
                            .subscriptionId(0L)
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
            BatchUpdateStatusesParams.builder()
                .batchInputPublicStatusRequest(
                    BatchInputPublicStatusRequest.builder()
                        .addInput(
                            PublicStatusRequest.builder()
                                .channel(PublicStatusRequest.Channel.EMAIL)
                                .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                                .subscriberIdString("subscriberIdString")
                                .subscriptionId(0L)
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
                            .subscriptionId(0L)
                            .build()
                    )
                    .build()
            )
    }
}
