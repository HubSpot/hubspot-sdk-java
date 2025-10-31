// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicStatusBulkResponseTest {

    @Test
    fun create() {
        val publicStatusBulkResponse =
            PublicStatusBulkResponse.builder()
                .addStatus(
                    PublicStatus.builder()
                        .channel(PublicStatus.Channel.EMAIL)
                        .source("source")
                        .status(PublicStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                        )
                        .subscriptionName("subscriptionName")
                        .build()
                )
                .subscriberIdString("subscriberIdString")
                .build()

        assertThat(publicStatusBulkResponse.statuses())
            .containsExactly(
                PublicStatus.builder()
                    .channel(PublicStatus.Channel.EMAIL)
                    .source("source")
                    .status(PublicStatus.Status.SUBSCRIBED)
                    .subscriberIdString("subscriberIdString")
                    .subscriptionId(0)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .businessUnitId(0L)
                    .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                    .legalBasisExplanation("legalBasisExplanation")
                    .setStatusSuccessReason(
                        PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                    )
                    .subscriptionName("subscriptionName")
                    .build()
            )
        assertThat(publicStatusBulkResponse.subscriberIdString()).isEqualTo("subscriberIdString")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStatusBulkResponse =
            PublicStatusBulkResponse.builder()
                .addStatus(
                    PublicStatus.builder()
                        .channel(PublicStatus.Channel.EMAIL)
                        .source("source")
                        .status(PublicStatus.Status.SUBSCRIBED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED
                        )
                        .subscriptionName("subscriptionName")
                        .build()
                )
                .subscriberIdString("subscriberIdString")
                .build()

        val roundtrippedPublicStatusBulkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicStatusBulkResponse),
                jacksonTypeRef<PublicStatusBulkResponse>(),
            )

        assertThat(roundtrippedPublicStatusBulkResponse).isEqualTo(publicStatusBulkResponse)
    }
}
