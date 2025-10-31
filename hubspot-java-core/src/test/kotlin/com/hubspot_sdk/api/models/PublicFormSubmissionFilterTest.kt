// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFormSubmissionFilterTest {

    @Test
    fun create() {
        val publicFormSubmissionFilter =
            PublicFormSubmissionFilter.builder()
                .filterType(PublicFormSubmissionFilter.FilterType.FORM_SUBMISSION)
                .operator(PublicFormSubmissionFilter.Operator.FILLED_OUT)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .formId("formId")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        assertThat(publicFormSubmissionFilter.filterType())
            .isEqualTo(PublicFormSubmissionFilter.FilterType.FORM_SUBMISSION)
        assertThat(publicFormSubmissionFilter.operator())
            .isEqualTo(PublicFormSubmissionFilter.Operator.FILLED_OUT)
        assertThat(publicFormSubmissionFilter.coalescingRefineBy())
            .contains(
                PublicFormSubmissionFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicFormSubmissionFilter.formId()).contains("formId")
        assertThat(publicFormSubmissionFilter.pruningRefineBy())
            .contains(
                PublicFormSubmissionFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicFormSubmissionFilter =
            PublicFormSubmissionFilter.builder()
                .filterType(PublicFormSubmissionFilter.FilterType.FORM_SUBMISSION)
                .operator(PublicFormSubmissionFilter.Operator.FILLED_OUT)
                .coalescingRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .formId("formId")
                .pruningRefineBy(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
                .build()

        val roundtrippedPublicFormSubmissionFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFormSubmissionFilter),
                jacksonTypeRef<PublicFormSubmissionFilter>(),
            )

        assertThat(roundtrippedPublicFormSubmissionFilter).isEqualTo(publicFormSubmissionFilter)
    }
}
