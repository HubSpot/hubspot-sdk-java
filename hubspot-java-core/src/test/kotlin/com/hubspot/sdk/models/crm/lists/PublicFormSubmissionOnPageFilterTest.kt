// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicFormSubmissionOnPageFilterTest {

    @Test
    fun create() {
        val publicFormSubmissionOnPageFilter =
            PublicFormSubmissionOnPageFilter.builder()
                .filterType(PublicFormSubmissionOnPageFilter.FilterType.FORM_SUBMISSION_ON_PAGE)
                .operator(PublicFormSubmissionOnPageFilter.Operator.FILLED_OUT)
                .pageId("pageId")
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

        assertThat(publicFormSubmissionOnPageFilter.filterType())
            .isEqualTo(PublicFormSubmissionOnPageFilter.FilterType.FORM_SUBMISSION_ON_PAGE)
        assertThat(publicFormSubmissionOnPageFilter.operator())
            .isEqualTo(PublicFormSubmissionOnPageFilter.Operator.FILLED_OUT)
        assertThat(publicFormSubmissionOnPageFilter.pageId()).isEqualTo("pageId")
        assertThat(publicFormSubmissionOnPageFilter.coalescingRefineBy())
            .contains(
                PublicFormSubmissionOnPageFilter.CoalescingRefineBy.ofPublicNumOccurrences(
                    PublicNumOccurrencesRefineBy.builder()
                        .type(PublicNumOccurrencesRefineBy.Type.NUM_OCCURRENCES)
                        .maxOccurrences(0)
                        .minOccurrences(0)
                        .build()
                )
            )
        assertThat(publicFormSubmissionOnPageFilter.formId()).contains("formId")
        assertThat(publicFormSubmissionOnPageFilter.pruningRefineBy())
            .contains(
                PublicFormSubmissionOnPageFilter.PruningRefineBy.ofPublicNumOccurrences(
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
        val publicFormSubmissionOnPageFilter =
            PublicFormSubmissionOnPageFilter.builder()
                .filterType(PublicFormSubmissionOnPageFilter.FilterType.FORM_SUBMISSION_ON_PAGE)
                .operator(PublicFormSubmissionOnPageFilter.Operator.FILLED_OUT)
                .pageId("pageId")
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

        val roundtrippedPublicFormSubmissionOnPageFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicFormSubmissionOnPageFilter),
                jacksonTypeRef<PublicFormSubmissionOnPageFilter>(),
            )

        assertThat(roundtrippedPublicFormSubmissionOnPageFilter)
            .isEqualTo(publicFormSubmissionOnPageFilter)
    }
}
