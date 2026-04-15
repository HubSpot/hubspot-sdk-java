// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicPageViewAnalyticsFilterTest {

    @Test
    fun create() {
        val publicPageViewAnalyticsFilter =
            PublicPageViewAnalyticsFilter.builder()
                .filterType(PublicPageViewAnalyticsFilter.FilterType.PAGE_VIEW)
                .operator("operator")
                .pageUrl("pageUrl")
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .enableTracking(true)
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicPageViewAnalyticsFilter.filterType())
            .isEqualTo(PublicPageViewAnalyticsFilter.FilterType.PAGE_VIEW)
        assertThat(publicPageViewAnalyticsFilter.operator()).isEqualTo("operator")
        assertThat(publicPageViewAnalyticsFilter.pageUrl()).isEqualTo("pageUrl")
        assertThat(publicPageViewAnalyticsFilter.coalescingRefineBy())
            .contains(
                PublicPageViewAnalyticsFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicPageViewAnalyticsFilter.enableTracking()).contains(true)
        assertThat(publicPageViewAnalyticsFilter.pruningRefineBy())
            .contains(
                PublicPageViewAnalyticsFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicPageViewAnalyticsFilter =
            PublicPageViewAnalyticsFilter.builder()
                .filterType(PublicPageViewAnalyticsFilter.FilterType.PAGE_VIEW)
                .operator("operator")
                .pageUrl("pageUrl")
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .enableTracking(true)
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicPageViewAnalyticsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicPageViewAnalyticsFilter),
                jacksonTypeRef<PublicPageViewAnalyticsFilter>(),
            )

        assertThat(roundtrippedPublicPageViewAnalyticsFilter)
            .isEqualTo(publicPageViewAnalyticsFilter)
    }
}
