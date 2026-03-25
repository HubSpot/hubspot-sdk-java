// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CaseChangeTestExtensionDataTest {

    @Test
    fun create() {
        val caseChangeTestExtensionData =
            CaseChangeTestExtensionData.builder()
                .mood(CaseChangeTestExtensionData.Mood.ANGRY)
                .build()

        assertThat(caseChangeTestExtensionData.mood())
            .isEqualTo(CaseChangeTestExtensionData.Mood.ANGRY)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val caseChangeTestExtensionData =
            CaseChangeTestExtensionData.builder()
                .mood(CaseChangeTestExtensionData.Mood.ANGRY)
                .build()

        val roundtrippedCaseChangeTestExtensionData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(caseChangeTestExtensionData),
                jacksonTypeRef<CaseChangeTestExtensionData>(),
            )

        assertThat(roundtrippedCaseChangeTestExtensionData).isEqualTo(caseChangeTestExtensionData)
    }
}
