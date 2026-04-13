// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.events.definitions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiStringPropertyOperationTest {

    @Test
    fun create() {
        val multiStringPropertyOperation =
            MultiStringPropertyOperation.builder()
                .coalescingRefineBy(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(MultiStringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(MultiStringPropertyOperation.PropertyType.MULTISTRING)
                .addValue("string")
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
                .renderSpec("renderSpec")
                .build()

        assertThat(multiStringPropertyOperation.coalescingRefineBy())
            .isEqualTo(
                MultiStringPropertyOperation.CoalescingRefineBy.ofNumOccurrences(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(multiStringPropertyOperation.includeObjectsWithNoValueSet()).isEqualTo(true)
        assertThat(multiStringPropertyOperation.operationType()).isEqualTo("operationType")
        assertThat(multiStringPropertyOperation.operator())
            .isEqualTo(MultiStringPropertyOperation.Operator.CONTAINS)
        assertThat(multiStringPropertyOperation.operatorName()).isEqualTo("operatorName")
        assertThat(multiStringPropertyOperation.propertyType())
            .isEqualTo(MultiStringPropertyOperation.PropertyType.MULTISTRING)
        assertThat(multiStringPropertyOperation.values()).containsExactly("string")
        assertThat(multiStringPropertyOperation.defaultValue()).contains("defaultValue")
        assertThat(multiStringPropertyOperation.pruningRefineBy())
            .contains(
                MultiStringPropertyOperation.PruningRefineBy.ofRelativeComparativeTimestamp(
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
        assertThat(multiStringPropertyOperation.renderSpec()).contains("renderSpec")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multiStringPropertyOperation =
            MultiStringPropertyOperation.builder()
                .coalescingRefineBy(
                    NumOccurrencesRefineBy.builder()
                        .type(NumOccurrencesRefineBy.Type.NUM_OCCURRENCES_REFINE_BY)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .includeObjectsWithNoValueSet(true)
                .operationType("operationType")
                .operator(MultiStringPropertyOperation.Operator.CONTAINS)
                .operatorName("operatorName")
                .propertyType(MultiStringPropertyOperation.PropertyType.MULTISTRING)
                .addValue("string")
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
                .renderSpec("renderSpec")
                .build()

        val roundtrippedMultiStringPropertyOperation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multiStringPropertyOperation),
                jacksonTypeRef<MultiStringPropertyOperation>(),
            )

        assertThat(roundtrippedMultiStringPropertyOperation).isEqualTo(multiStringPropertyOperation)
    }
}
