// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.marketing.emails

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEmailTestingDetailsTest {

    @Test
    fun create() {
        val publicEmailTestingDetails =
            PublicEmailTestingDetails.builder()
                .abSampleSizeDefault(
                    PublicEmailTestingDetails.AbSampleSizeDefault.AUTOMATED_LOSER_VARIANT
                )
                .abSamplingDefault(
                    PublicEmailTestingDetails.AbSamplingDefault.AUTOMATED_LOSER_VARIANT
                )
                .abStatus(PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abSuccessMetric(PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_DELIVERED)
                .abTestPercentage(0)
                .hoursToWait(0)
                .isAbVariation(true)
                .testId("testId")
                .build()

        assertThat(publicEmailTestingDetails.abSampleSizeDefault())
            .contains(PublicEmailTestingDetails.AbSampleSizeDefault.AUTOMATED_LOSER_VARIANT)
        assertThat(publicEmailTestingDetails.abSamplingDefault())
            .contains(PublicEmailTestingDetails.AbSamplingDefault.AUTOMATED_LOSER_VARIANT)
        assertThat(publicEmailTestingDetails.abStatus())
            .contains(PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT)
        assertThat(publicEmailTestingDetails.abSuccessMetric())
            .contains(PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_DELIVERED)
        assertThat(publicEmailTestingDetails.abTestPercentage()).contains(0)
        assertThat(publicEmailTestingDetails.hoursToWait()).contains(0)
        assertThat(publicEmailTestingDetails.isAbVariation()).contains(true)
        assertThat(publicEmailTestingDetails.testId()).contains("testId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicEmailTestingDetails =
            PublicEmailTestingDetails.builder()
                .abSampleSizeDefault(
                    PublicEmailTestingDetails.AbSampleSizeDefault.AUTOMATED_LOSER_VARIANT
                )
                .abSamplingDefault(
                    PublicEmailTestingDetails.AbSamplingDefault.AUTOMATED_LOSER_VARIANT
                )
                .abStatus(PublicEmailTestingDetails.AbStatus.AUTOMATED_LOSER_VARIANT)
                .abSuccessMetric(PublicEmailTestingDetails.AbSuccessMetric.CLICKS_BY_DELIVERED)
                .abTestPercentage(0)
                .hoursToWait(0)
                .isAbVariation(true)
                .testId("testId")
                .build()

        val roundtrippedPublicEmailTestingDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEmailTestingDetails),
                jacksonTypeRef<PublicEmailTestingDetails>(),
            )

        assertThat(roundtrippedPublicEmailTestingDetails).isEqualTo(publicEmailTestingDetails)
    }
}
