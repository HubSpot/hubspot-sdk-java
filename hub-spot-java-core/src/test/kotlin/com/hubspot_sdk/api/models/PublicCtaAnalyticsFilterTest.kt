// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCtaAnalyticsFilterTest {

    @Test
    fun create() {
        val publicCtaAnalyticsFilter =
            PublicCtaAnalyticsFilter.builder()
                .ctaName("ctaName")
                .filterType(PublicCtaAnalyticsFilter.FilterType.CTA)
                .operator("operator")
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicCtaAnalyticsFilter.ctaName()).isEqualTo("ctaName")
        assertThat(publicCtaAnalyticsFilter.filterType())
            .isEqualTo(PublicCtaAnalyticsFilter.FilterType.CTA)
        assertThat(publicCtaAnalyticsFilter.operator()).isEqualTo("operator")
        assertThat(publicCtaAnalyticsFilter.coalescingRefineBy())
            .contains(
                PublicCtaAnalyticsFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicCtaAnalyticsFilter.pruningRefineBy())
            .contains(
                PublicCtaAnalyticsFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicCtaAnalyticsFilter =
            PublicCtaAnalyticsFilter.builder()
                .ctaName("ctaName")
                .filterType(PublicCtaAnalyticsFilter.FilterType.CTA)
                .operator("operator")
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicCtaAnalyticsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicCtaAnalyticsFilter),
                jacksonTypeRef<PublicCtaAnalyticsFilter>(),
            )

        assertThat(roundtrippedPublicCtaAnalyticsFilter).isEqualTo(publicCtaAnalyticsFilter)
    }
}
