// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.eventdefinitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AllPropertyTypesOperationTest {

    @Test
    fun create() {
        val allPropertyTypesOperation =
            AllPropertyTypesOperation.builder()
                .coalescingRefineBy(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(AllPropertyTypesOperation.Operator.IS_BLANK)
                .operatorName("operatorName")
                .propertyType(AllPropertyTypesOperation.PropertyType.ALLTYPES)
                .defaultValue("defaultValue")
                .pruningRefineBy(
                    RelativeComparativeTimestampRefineBy.builder()
                        .comparison(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
                        .timeOffset(
                            TimeOffset.builder()
                                .amount(0)
                                .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                                .timeUnit(TimeOffset.TimeUnit.DAYS)
                                .build()
                        )
                        .type(
                            RelativeComparativeTimestampRefineBy.Type
                                .RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
                        )
                        .build()
                )
                .build()

        assertThat(allPropertyTypesOperation.coalescingRefineBy())
            .isEqualTo(
                AllPropertyTypesOperation.CoalescingRefineBy.ofNumOccurrences(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(allPropertyTypesOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(allPropertyTypesOperation.operationType()).isEqualTo("operationType")
        assertThat(allPropertyTypesOperation.operator())
            .isEqualTo(AllPropertyTypesOperation.Operator.IS_BLANK)
        assertThat(allPropertyTypesOperation.operatorName()).isEqualTo("operatorName")
        assertThat(allPropertyTypesOperation.propertyType())
            .isEqualTo(AllPropertyTypesOperation.PropertyType.ALLTYPES)
        assertThat(allPropertyTypesOperation.defaultValue()).contains("defaultValue")
        assertThat(allPropertyTypesOperation.pruningRefineBy())
            .contains(
                AllPropertyTypesOperation.PruningRefineBy.ofRelativeComparativeTimestamp(
                    RelativeComparativeTimestampRefineBy.builder()
                        .comparison(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
                        .timeOffset(
                            TimeOffset.builder()
                                .amount(0)
                                .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                                .timeUnit(TimeOffset.TimeUnit.DAYS)
                                .build()
                        )
                        .type(
                            RelativeComparativeTimestampRefineBy.Type
                                .RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
                        )
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val allPropertyTypesOperation =
            AllPropertyTypesOperation.builder()
                .coalescingRefineBy(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(AllPropertyTypesOperation.Operator.IS_BLANK)
                .operatorName("operatorName")
                .propertyType(AllPropertyTypesOperation.PropertyType.ALLTYPES)
                .defaultValue("defaultValue")
                .pruningRefineBy(
                    RelativeComparativeTimestampRefineBy.builder()
                        .comparison(RelativeComparativeTimestampRefineBy.Comparison.AFTER)
                        .timeOffset(
                            TimeOffset.builder()
                                .amount(0)
                                .offsetDirection(TimeOffset.OffsetDirection.FUTURE)
                                .timeUnit(TimeOffset.TimeUnit.DAYS)
                                .build()
                        )
                        .type(
                            RelativeComparativeTimestampRefineBy.Type
                                .RELATIVE_COMPARATIVE_TIMESTAMP_REFINE_BY
                        )
                        .build()
                )
                .build()

        val roundtrippedAllPropertyTypesOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(allPropertyTypesOperation),
                jacksonTypeRef<AllPropertyTypesOperation>(),
            )

        assertThat(roundtrippedAllPropertyTypesOperation).isEqualTo(allPropertyTypesOperation)
    }
}
