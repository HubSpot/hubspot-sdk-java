// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.communicationpreferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
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
                .status(PublicStatus.Status.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0L)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessUnitId(0L)
                .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .setStatusSuccessReason(PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE)
                .subscriptionName("subscriptionName")
                .build()

        assertThat(publicStatus.channel()).isEqualTo(PublicStatus.Channel.EMAIL)
        assertThat(publicStatus.source()).isEqualTo("source")
        assertThat(publicStatus.status()).isEqualTo(PublicStatus.Status.NOT_SPECIFIED)
        assertThat(publicStatus.subscriberIdString()).isEqualTo("subscriberIdString")
        assertThat(publicStatus.subscriptionId()).isEqualTo(0L)
        assertThat(publicStatus.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicStatus.businessUnitId()).contains(0L)
        assertThat(publicStatus.legalBasis()).contains(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
        assertThat(publicStatus.legalBasisExplanation()).contains("legalBasisExplanation")
        assertThat(publicStatus.setStatusSuccessReason())
            .contains(PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE)
        assertThat(publicStatus.subscriptionName()).contains("subscriptionName")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicStatus =
            PublicStatus.builder()
                .channel(PublicStatus.Channel.EMAIL)
                .source("source")
                .status(PublicStatus.Status.NOT_SPECIFIED)
                .subscriberIdString("subscriberIdString")
                .subscriptionId(0L)
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .businessUnitId(0L)
                .legalBasis(PublicStatus.LegalBasis.CONSENT_WITH_NOTICE)
                .legalBasisExplanation("legalBasisExplanation")
                .setStatusSuccessReason(PublicStatus.SetStatusSuccessReason.NO_STATUS_CHANGE)
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
