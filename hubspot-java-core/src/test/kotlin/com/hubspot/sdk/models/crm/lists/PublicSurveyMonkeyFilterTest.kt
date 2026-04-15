// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSurveyMonkeyFilterTest {

    @Test
    fun create() {
        val publicSurveyMonkeyFilter =
            PublicSurveyMonkeyFilter.builder()
                .filterType(PublicSurveyMonkeyFilter.FilterType.SURVEY_MONKEY)
                .operator("operator")
                .surveyId("surveyId")
                .build()

        assertThat(publicSurveyMonkeyFilter.filterType())
            .isEqualTo(PublicSurveyMonkeyFilter.FilterType.SURVEY_MONKEY)
        assertThat(publicSurveyMonkeyFilter.operator()).isEqualTo("operator")
        assertThat(publicSurveyMonkeyFilter.surveyId()).isEqualTo("surveyId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSurveyMonkeyFilter =
            PublicSurveyMonkeyFilter.builder()
                .filterType(PublicSurveyMonkeyFilter.FilterType.SURVEY_MONKEY)
                .operator("operator")
                .surveyId("surveyId")
                .build()

        val roundtrippedPublicSurveyMonkeyFilter =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSurveyMonkeyFilter),
                jacksonTypeRef<PublicSurveyMonkeyFilter>(),
            )

        assertThat(roundtrippedPublicSurveyMonkeyFilter).isEqualTo(publicSurveyMonkeyFilter)
    }
}
