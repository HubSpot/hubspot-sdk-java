// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomObjectRecordLimitResponseTest {

    @Test
    fun create() {
        val customObjectRecordLimitResponse =
            CustomObjectRecordLimitResponse.builder()
                .addByObjectType(
                    UsageForObjectType.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0L)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        assertThat(customObjectRecordLimitResponse.byObjectType())
            .containsExactly(
                UsageForObjectType.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .usage(0L)
                    .build()
            )
        assertThat(customObjectRecordLimitResponse.overallLimit()).isEqualTo(0L)
        assertThat(customObjectRecordLimitResponse.overallPercentage()).isEqualTo(0.0)
        assertThat(customObjectRecordLimitResponse.overallUsage()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customObjectRecordLimitResponse =
            CustomObjectRecordLimitResponse.builder()
                .addByObjectType(
                    UsageForObjectType.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0L)
                        .build()
                )
                .overallLimit(0L)
                .overallPercentage(0.0)
                .overallUsage(0L)
                .build()

        val roundtrippedCustomObjectRecordLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customObjectRecordLimitResponse),
                jacksonTypeRef<CustomObjectRecordLimitResponse>(),
            )

        assertThat(roundtrippedCustomObjectRecordLimitResponse)
            .isEqualTo(customObjectRecordLimitResponse)
    }
}
