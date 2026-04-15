// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.automation.sequences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSequenceStepDependencyResponseTest {

    @Test
    fun create() {
        val publicSequenceStepDependencyResponse =
            PublicSequenceStepDependencyResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dependencyType(PublicSequenceStepDependencyResponse.DependencyType.MANUAL_PAUSE)
                .reliesOnSequenceStepId("reliesOnSequenceStepId")
                .reliesOnStepOrder(0)
                .requiredBySequenceStepId("requiredBySequenceStepId")
                .requiredByStepOrder(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicSequenceStepDependencyResponse.id()).isEqualTo("id")
        assertThat(publicSequenceStepDependencyResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicSequenceStepDependencyResponse.dependencyType())
            .isEqualTo(PublicSequenceStepDependencyResponse.DependencyType.MANUAL_PAUSE)
        assertThat(publicSequenceStepDependencyResponse.reliesOnSequenceStepId())
            .isEqualTo("reliesOnSequenceStepId")
        assertThat(publicSequenceStepDependencyResponse.reliesOnStepOrder()).isEqualTo(0)
        assertThat(publicSequenceStepDependencyResponse.requiredBySequenceStepId())
            .isEqualTo("requiredBySequenceStepId")
        assertThat(publicSequenceStepDependencyResponse.requiredByStepOrder()).isEqualTo(0)
        assertThat(publicSequenceStepDependencyResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSequenceStepDependencyResponse =
            PublicSequenceStepDependencyResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dependencyType(PublicSequenceStepDependencyResponse.DependencyType.MANUAL_PAUSE)
                .reliesOnSequenceStepId("reliesOnSequenceStepId")
                .reliesOnStepOrder(0)
                .requiredBySequenceStepId("requiredBySequenceStepId")
                .requiredByStepOrder(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicSequenceStepDependencyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSequenceStepDependencyResponse),
                jacksonTypeRef<PublicSequenceStepDependencyResponse>(),
            )

        assertThat(roundtrippedPublicSequenceStepDependencyResponse)
            .isEqualTo(publicSequenceStepDependencyResponse)
    }
}
