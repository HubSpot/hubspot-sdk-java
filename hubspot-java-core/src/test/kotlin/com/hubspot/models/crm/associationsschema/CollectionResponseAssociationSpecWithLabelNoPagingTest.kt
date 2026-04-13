// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.associationsschema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.crm.AssociationSpecWithLabel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseAssociationSpecWithLabelNoPagingTest {

    @Test
    fun create() {
        val collectionResponseAssociationSpecWithLabelNoPaging =
            CollectionResponseAssociationSpecWithLabelNoPaging.builder()
                .addResult(
                    AssociationSpecWithLabel.builder()
                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                        .typeId(0)
                        .label("label")
                        .build()
                )
                .build()

        assertThat(collectionResponseAssociationSpecWithLabelNoPaging.results())
            .containsExactly(
                AssociationSpecWithLabel.builder()
                    .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseAssociationSpecWithLabelNoPaging =
            CollectionResponseAssociationSpecWithLabelNoPaging.builder()
                .addResult(
                    AssociationSpecWithLabel.builder()
                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                        .typeId(0)
                        .label("label")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseAssociationSpecWithLabelNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseAssociationSpecWithLabelNoPaging),
                jacksonTypeRef<CollectionResponseAssociationSpecWithLabelNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponseAssociationSpecWithLabelNoPaging)
            .isEqualTo(collectionResponseAssociationSpecWithLabelNoPaging)
    }
}
