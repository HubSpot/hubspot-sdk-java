// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.limits

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseAssociationLabelLimitResponseNoPagingTest {

    @Test
    fun create() {
        val collectionResponseAssociationLabelLimitResponseNoPaging =
            CollectionResponseAssociationLabelLimitResponseNoPaging.builder()
                .addResult(
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
                )
                .build()

        assertThat(collectionResponseAssociationLabelLimitResponseNoPaging.results())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseAssociationLabelLimitResponseNoPaging =
            CollectionResponseAssociationLabelLimitResponseNoPaging.builder()
                .addResult(
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
                )
                .build()

        val roundtrippedCollectionResponseAssociationLabelLimitResponseNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseAssociationLabelLimitResponseNoPaging
                ),
                jacksonTypeRef<CollectionResponseAssociationLabelLimitResponseNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseAssociationLabelLimitResponseNoPaging)
            .isEqualTo(collectionResponseAssociationLabelLimitResponseNoPaging)
    }
}
