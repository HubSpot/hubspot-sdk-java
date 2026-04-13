// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomPropertyLimitResponseTest {

    @Test
    fun create() {
        val customPropertyLimitResponse =
            CustomPropertyLimitResponse.builder()
                .addByObjectType(
                    LimitAndUsageForObjectType.builder()
                        .limit(0)
                        .objectTypeId("objectTypeId")
                        .percentage(0.0)
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        assertThat(customPropertyLimitResponse.byObjectType())
            .containsExactly(
                LimitAndUsageForObjectType.builder()
                    .limit(0)
                    .objectTypeId("objectTypeId")
                    .percentage(0.0)
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .usage(0)
                    .build()
            )
        assertThat(customPropertyLimitResponse.overallLimit()).isEqualTo(0L)
        assertThat(customPropertyLimitResponse.overallPercentage()).isEqualTo(0.0)
        assertThat(customPropertyLimitResponse.overallUsage()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customPropertyLimitResponse =
            CustomPropertyLimitResponse.builder()
                .addByObjectType(
                    LimitAndUsageForObjectType.builder()
                        .limit(0)
                        .objectTypeId("objectTypeId")
                        .percentage(0.0)
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        val roundtrippedCustomPropertyLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customPropertyLimitResponse),
                jacksonTypeRef<CustomPropertyLimitResponse>(),
            )

        assertThat(roundtrippedCustomPropertyLimitResponse).isEqualTo(customPropertyLimitResponse)
    }
}
