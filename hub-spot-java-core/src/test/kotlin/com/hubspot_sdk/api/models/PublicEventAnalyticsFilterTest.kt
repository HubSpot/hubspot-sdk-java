// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicEventAnalyticsFilterTest {

    @Test
    fun create() {
        val publicEventAnalyticsFilter =
            PublicEventAnalyticsFilter.builder()
                .eventId("eventId")
                .filterType(PublicEventAnalyticsFilter.FilterType.EVENT)
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

        assertThat(publicEventAnalyticsFilter.eventId()).isEqualTo("eventId")
        assertThat(publicEventAnalyticsFilter.filterType())
            .isEqualTo(PublicEventAnalyticsFilter.FilterType.EVENT)
        assertThat(publicEventAnalyticsFilter.operator()).isEqualTo("operator")
        assertThat(publicEventAnalyticsFilter.coalescingRefineBy())
            .contains(
                PublicEventAnalyticsFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicEventAnalyticsFilter.pruningRefineBy())
            .contains(
                PublicEventAnalyticsFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicEventAnalyticsFilter =
            PublicEventAnalyticsFilter.builder()
                .eventId("eventId")
                .filterType(PublicEventAnalyticsFilter.FilterType.EVENT)
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

        val roundtrippedPublicEventAnalyticsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicEventAnalyticsFilter),
                jacksonTypeRef<PublicEventAnalyticsFilter>(),
            )

        assertThat(roundtrippedPublicEventAnalyticsFilter).isEqualTo(publicEventAnalyticsFilter)
    }
}
