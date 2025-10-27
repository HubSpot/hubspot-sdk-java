// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.subscriptions.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicStatusTest {

    @Test
    fun create() {
        val publicStatus =
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
                .setStatusSuccessReason(PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED)
                .subscriptionName("subscriptionName")
                .build()

        assertThat(publicStatus.channel()).isEqualTo(PublicStatus.Channel.EMAIL)
        assertThat(publicStatus.source()).isEqualTo("source")
        assertThat(publicStatus.status()).isEqualTo(PublicStatus.Status.SUBSCRIBED)
        assertThat(publicStatus.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(publicStatus.subscriptionId()).isEqualTo(0)
        assertThat(publicStatus.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicStatus.businessUnitId()).contains(0L)
        assertThat(publicStatus.legalBasis())
            .contains(PublicStatus.LegalBasis.LEGITIMATE_INTEREST_PQL)
        assertThat(publicStatus.legalBasisExplanation()).contains("legalBasisExplanation")
        assertThat(publicStatus.setStatusSuccessReason())
            .contains(PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED)
        assertThat(publicStatus.subscriptionName()).contains("subscriptionName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStatus =
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
                .setStatusSuccessReason(PublicStatus.SetStatusSuccessReason.RESUBSCRIBE_OCCURRED)
                .subscriptionName("subscriptionName")
                .build()

        val roundtrippedPublicStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicStatus),
                jacksonTypeRef<PublicStatus>(),
            )

        assertThat(roundtrippedPublicStatus).isEqualTo(publicStatus)
    }
}
