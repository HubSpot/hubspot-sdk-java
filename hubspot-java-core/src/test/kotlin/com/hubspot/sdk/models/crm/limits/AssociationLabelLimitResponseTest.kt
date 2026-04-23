// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationLabelLimitResponseTest {

    @Test
    fun create() {
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    LimitsObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .limit(0L)
                .percentage(0.0)
                .toObjectType(
                    LimitsObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .usage(0L)
                .build()

        assertThat(associationLabelLimitResponse.allLabels()).containsExactly("string")
        assertThat(associationLabelLimitResponse.fromObjectType())
            .isEqualTo(
                LimitsObjectTypeDefinition.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .build()
            )
        assertThat(associationLabelLimitResponse.limit()).isEqualTo(0L)
        assertThat(associationLabelLimitResponse.percentage()).isEqualTo(0.0)
        assertThat(associationLabelLimitResponse.toObjectType())
            .isEqualTo(
                LimitsObjectTypeDefinition.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .build()
            )
        assertThat(associationLabelLimitResponse.usage()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    LimitsObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .limit(0L)
                .percentage(0.0)
                .toObjectType(
                    LimitsObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .usage(0L)
                .build()

        val roundtrippedAssociationLabelLimitResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationLabelLimitResponse),
                jacksonTypeRef<AssociationLabelLimitResponse>(),
            )

        assertThat(roundtrippedAssociationLabelLimitResponse)
            .isEqualTo(associationLabelLimitResponse)
    }
}
