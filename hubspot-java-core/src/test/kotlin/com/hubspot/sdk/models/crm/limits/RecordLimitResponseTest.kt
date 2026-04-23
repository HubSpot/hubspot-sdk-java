// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordLimitResponseTest {

    @Test
    fun create() {
        val recordLimitResponse =
            RecordLimitResponse.builder()
                .customObjectTypes(
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
                )
                .addHubSpotDefinedObjectType(
                    LimitAndUsageForObjectType.builder()
                        .limit(0L)
                        .objectTypeId("objectTypeId")
                        .percentage(0.0)
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0L)
                        .build()
                )
                .build()

        assertThat(recordLimitResponse.customObjectTypes())
            .isEqualTo(
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
            )
        assertThat(recordLimitResponse.hubSpotDefinedObjectTypes())
            .containsExactly(
                LimitAndUsageForObjectType.builder()
                    .limit(0L)
                    .objectTypeId("objectTypeId")
                    .percentage(0.0)
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .usage(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordLimitResponse =
            RecordLimitResponse.builder()
                .customObjectTypes(
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
                )
                .addHubSpotDefinedObjectType(
                    LimitAndUsageForObjectType.builder()
                        .limit(0L)
                        .objectTypeId("objectTypeId")
                        .percentage(0.0)
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .usage(0L)
                        .build()
                )
                .build()

        val roundtrippedRecordLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordLimitResponse),
                jacksonTypeRef<RecordLimitResponse>(),
            )

        assertThat(roundtrippedRecordLimitResponse).isEqualTo(recordLimitResponse)
    }
}
