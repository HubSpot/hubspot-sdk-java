// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationLabelLimitResponseTest {

    @Test
    fun create() {
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .usage(0)
                .build()

        assertThat(associationLabelLimitResponse.allLabels()).containsExactly("string")
        assertThat(associationLabelLimitResponse.fromObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .build()
            )
        assertThat(associationLabelLimitResponse.limit()).isEqualTo(0)
        assertThat(associationLabelLimitResponse.percentage()).isEqualTo(0.0)
        assertThat(associationLabelLimitResponse.toObjectType())
            .isEqualTo(
                ObjectTypeDefinition.builder()
                    .objectTypeId("objectTypeId")
                    .pluralLabel("pluralLabel")
                    .singularLabel("singularLabel")
                    .build()
            )
        assertThat(associationLabelLimitResponse.usage()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationLabelLimitResponse =
            AssociationLabelLimitResponse.builder()
                .addAllLabel("string")
                .fromObjectType(
                    ObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .limit(0)
                .percentage(0.0)
                .toObjectType(
                    ObjectTypeDefinition.builder()
                        .objectTypeId("objectTypeId")
                        .pluralLabel("pluralLabel")
                        .singularLabel("singularLabel")
                        .build()
                )
                .usage(0)
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
