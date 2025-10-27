// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCampaignInfluencedFilterTest {

    @Test
    fun create() {
        val publicCampaignInfluencedFilter =
            PublicCampaignInfluencedFilter.builder()
                .campaignId("campaignId")
                .filterType(PublicCampaignInfluencedFilter.FilterType.CAMPAIGN_INFLUENCED)
                .build()

        assertThat(publicCampaignInfluencedFilter.campaignId()).isEqualTo("campaignId")
        assertThat(publicCampaignInfluencedFilter.filterType())
            .isEqualTo(PublicCampaignInfluencedFilter.FilterType.CAMPAIGN_INFLUENCED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicCampaignInfluencedFilter =
            PublicCampaignInfluencedFilter.builder()
                .campaignId("campaignId")
                .filterType(PublicCampaignInfluencedFilter.FilterType.CAMPAIGN_INFLUENCED)
                .build()

        val roundtrippedPublicCampaignInfluencedFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCampaignInfluencedFilter),
                jacksonTypeRef<PublicCampaignInfluencedFilter>(),
            )

        assertThat(roundtrippedPublicCampaignInfluencedFilter)
            .isEqualTo(publicCampaignInfluencedFilter)
    }
}
