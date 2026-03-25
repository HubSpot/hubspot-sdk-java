// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSurveyMonkeyValueFilterTest {

    @Test
    fun create() {
        val publicSurveyMonkeyValueFilter =
            PublicSurveyMonkeyValueFilter.builder()
                .filterType(PublicSurveyMonkeyValueFilter.FilterType.SURVEY_MONKEY_VALUE)
                .operator("operator")
                .surveyId("surveyId")
                .surveyQuestion("surveyQuestion")
                .valueComparison(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .surveyAnswerColId("surveyAnswerColId")
                .surveyAnswerRowId("surveyAnswerRowId")
                .build()

        assertThat(publicSurveyMonkeyValueFilter.filterType())
            .isEqualTo(PublicSurveyMonkeyValueFilter.FilterType.SURVEY_MONKEY_VALUE)
        assertThat(publicSurveyMonkeyValueFilter.operator()).isEqualTo("operator")
        assertThat(publicSurveyMonkeyValueFilter.surveyId()).isEqualTo("surveyId")
        assertThat(publicSurveyMonkeyValueFilter.surveyQuestion()).isEqualTo("surveyQuestion")
        assertThat(publicSurveyMonkeyValueFilter.valueComparison())
            .isEqualTo(
                PublicSurveyMonkeyValueFilter.ValueComparison.ofPublicBoolPropertyOperation(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
            )
        assertThat(publicSurveyMonkeyValueFilter.surveyAnswerColId()).contains("surveyAnswerColId")
        assertThat(publicSurveyMonkeyValueFilter.surveyAnswerRowId()).contains("surveyAnswerRowId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSurveyMonkeyValueFilter =
            PublicSurveyMonkeyValueFilter.builder()
                .filterType(PublicSurveyMonkeyValueFilter.FilterType.SURVEY_MONKEY_VALUE)
                .operator("operator")
                .surveyId("surveyId")
                .surveyQuestion("surveyQuestion")
                .valueComparison(
                    PublicBoolPropertyOperation.builder()
                        .includeObjectsWithNoValueSet(true)
                        .operationType(PublicBoolPropertyOperation.OperationType.BOOL)
                        .operator("operator")
                        .value(true)
                        .build()
                )
                .surveyAnswerColId("surveyAnswerColId")
                .surveyAnswerRowId("surveyAnswerRowId")
                .build()

        val roundtrippedPublicSurveyMonkeyValueFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSurveyMonkeyValueFilter),
                jacksonTypeRef<PublicSurveyMonkeyValueFilter>(),
            )

        assertThat(roundtrippedPublicSurveyMonkeyValueFilter)
            .isEqualTo(publicSurveyMonkeyValueFilter)
    }
}
