// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputPublicStatusRequestTest {

    @Test
    fun create() {
        val batchInputPublicStatusRequest =
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

        assertThat(batchInputPublicStatusRequest.inputs())
            .containsExactly(
                PublicStatusRequest.builder()
                    .channel(PublicStatusRequest.Channel.EMAIL)
                    .statusState(PublicStatusRequest.StatusState.NOT_SPECIFIED)
                    .subscriberIdString("subscriberIdString")
                    .subscriptionId(0)
                    .legalBasis(PublicStatusRequest.LegalBasis.CONSENT_WITH_NOTICE)
                    .legalBasisExplanation("legalBasisExplanation")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputPublicStatusRequest =
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

        val roundtrippedBatchInputPublicStatusRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputPublicStatusRequest),
                jacksonTypeRef<BatchInputPublicStatusRequest>(),
            )

        assertThat(roundtrippedBatchInputPublicStatusRequest)
            .isEqualTo(batchInputPublicStatusRequest)
    }
}
