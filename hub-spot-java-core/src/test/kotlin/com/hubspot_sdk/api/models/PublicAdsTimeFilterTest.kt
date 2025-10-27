// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAdsTimeFilterTest {

    @Test
    fun create() {
        val publicAdsTimeFilter =
            PublicAdsTimeFilter.builder()
                .filterType(PublicAdsTimeFilter.FilterType.ADS_TIME)
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicAdsTimeFilter.filterType())
            .isEqualTo(PublicAdsTimeFilter.FilterType.ADS_TIME)
        assertThat(publicAdsTimeFilter.pruningRefineBy())
            .isEqualTo(
                PublicAdsTimeFilter.PruningRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAdsTimeFilter =
            PublicAdsTimeFilter.builder()
                .filterType(PublicAdsTimeFilter.FilterType.ADS_TIME)
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicAdsTimeFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAdsTimeFilter),
                jacksonTypeRef<PublicAdsTimeFilter>(),
            )

        assertThat(roundtrippedPublicAdsTimeFilter).isEqualTo(publicAdsTimeFilter)
    }
}
