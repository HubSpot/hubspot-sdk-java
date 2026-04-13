// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicUnifiedEventsFilterTest {

    @Test
    fun create() {
        val publicUnifiedEventsFilter =
            PublicUnifiedEventsFilter.builder()
                .addFilterLine(
                    PublicEventFilterMetadata.builder()
                        .operation(
                            PublicBoolPropertyOperation.builder()
                                .includeObjectsWithNoValueSet(true)
                                .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                                .operator("operator")
                                .value(true)
                                .build()
                        )
                        .property("property")
                        .build()
                )
                .filterType(PublicUnifiedEventsFilter.FilterType.UNIFIED_EVENTS)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .eventTypeId("eventTypeId")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicUnifiedEventsFilter.filterLines())
            .containsExactly(
                PublicEventFilterMetadata.builder()
                    .operation(
                        PublicBoolPropertyOperation.builder()
                            .includeObjectsWithNoValueSet(true)
                            .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                            .operator("operator")
                            .value(true)
                            .build()
                    )
                    .property("property")
                    .build()
            )
        assertThat(publicUnifiedEventsFilter.filterType())
            .isEqualTo(PublicUnifiedEventsFilter.FilterType.UNIFIED_EVENTS)
        assertThat(publicUnifiedEventsFilter.coalescingRefineBy())
            .contains(
                PublicUnifiedEventsFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicUnifiedEventsFilter.eventTypeId()).contains("eventTypeId")
        assertThat(publicUnifiedEventsFilter.pruningRefineBy())
            .contains(
                PublicUnifiedEventsFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicUnifiedEventsFilter =
            PublicUnifiedEventsFilter.builder()
                .addFilterLine(
                    PublicEventFilterMetadata.builder()
                        .operation(
                            PublicBoolPropertyOperation.builder()
                                .includeObjectsWithNoValueSet(true)
                                .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                                .operator("operator")
                                .value(true)
                                .build()
                        )
                        .property("property")
                        .build()
                )
                .filterType(PublicUnifiedEventsFilter.FilterType.UNIFIED_EVENTS)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .eventTypeId("eventTypeId")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicUnifiedEventsFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicUnifiedEventsFilter),
                jacksonTypeRef<PublicUnifiedEventsFilter>(),
            )

        assertThat(roundtrippedPublicUnifiedEventsFilter).isEqualTo(publicUnifiedEventsFilter)
    }
}
