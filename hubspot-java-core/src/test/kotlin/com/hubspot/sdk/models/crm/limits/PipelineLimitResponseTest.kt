// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PipelineLimitResponseTest {

    @Test
    fun create() {
        val pipelineLimitResponse =
            PipelineLimitResponse.builder()
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

        assertThat(pipelineLimitResponse.customObjectTypes())
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
        assertThat(pipelineLimitResponse.hubSpotDefinedObjectTypes())
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
        val pipelineLimitResponse =
            PipelineLimitResponse.builder()
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

        val roundtrippedPipelineLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pipelineLimitResponse),
                jacksonTypeRef<PipelineLimitResponse>(),
            )

        assertThat(roundtrippedPipelineLimitResponse).isEqualTo(pipelineLimitResponse)
    }
}
