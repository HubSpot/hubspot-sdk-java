// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CalculatedPropertyLimitResponseTest {

    @Test
    fun create() {
        val calculatedPropertyLimitResponse =
            CalculatedPropertyLimitResponse.builder()
                .addByObjectType(
                    UsageForObjectType.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        assertThat(calculatedPropertyLimitResponse.byObjectType())
            .containsExactly(
                UsageForObjectType.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .usage(0)
                    .build()
            )
        assertThat(calculatedPropertyLimitResponse.overallLimit()).isEqualTo(0L)
        assertThat(calculatedPropertyLimitResponse.overallPercentage()).isEqualTo(0.0)
        assertThat(calculatedPropertyLimitResponse.overallUsage()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val calculatedPropertyLimitResponse =
            CalculatedPropertyLimitResponse.builder()
                .addByObjectType(
                    UsageForObjectType.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        val roundtrippedCalculatedPropertyLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(calculatedPropertyLimitResponse),
                jacksonTypeRef<CalculatedPropertyLimitResponse>(),
            )

        assertThat(roundtrippedCalculatedPropertyLimitResponse)
            .isEqualTo(calculatedPropertyLimitResponse)
    }
}
