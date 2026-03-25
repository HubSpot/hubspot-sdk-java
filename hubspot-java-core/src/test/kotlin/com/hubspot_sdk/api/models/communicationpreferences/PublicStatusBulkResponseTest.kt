// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.communicationpreferences

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
                        .status(PublicStatus.Status.NOT_SPECIFIED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE
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
                    .status(PublicStatus.Status.NOT_SPECIFIED)
                    .subscriberIdString("subscriberIdString")
                    .subscriptionId(0)
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .businessUnitId(0L)
                    .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                    .legalBasisExplanation("legalBasisExplanation")
                    .setStatusSuccessReason(PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE)
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
                        .status(PublicStatus.Status.NOT_SPECIFIED)
                        .subscriberIdString("subscriberIdString")
                        .subscriptionId(0)
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .businessUnitId(0L)
                        .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                        .legalBasisExplanation("legalBasisExplanation")
                        .setStatusSuccessReason(
                            PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE
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
