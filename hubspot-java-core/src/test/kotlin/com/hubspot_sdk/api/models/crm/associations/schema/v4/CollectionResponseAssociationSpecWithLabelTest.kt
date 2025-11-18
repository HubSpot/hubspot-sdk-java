// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.crm.AssociationSpecWithLabel
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseAssociationSpecWithLabelTest {

    @Test
    fun create() {
        val collectionResponseAssociationSpecWithLabel =
            CollectionResponseAssociationSpecWithLabel.builder()
                .addResult(
                    AssociationSpecWithLabel.builder()
                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                        .typeId(0)
                        .label("label")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseAssociationSpecWithLabel.results())
            .containsExactly(
                AssociationSpecWithLabel.builder()
                    .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .build()
            )
        assertThat(collectionResponseAssociationSpecWithLabel.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseAssociationSpecWithLabel =
            CollectionResponseAssociationSpecWithLabel.builder()
                .addResult(
                    AssociationSpecWithLabel.builder()
                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                        .typeId(0)
                        .label("label")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseAssociationSpecWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseAssociationSpecWithLabel),
                jacksonTypeRef<CollectionResponseAssociationSpecWithLabel>(),
            )

        assertThat(roundtrippedCollectionResponseAssociationSpecWithLabel)
            .isEqualTo(collectionResponseAssociationSpecWithLabel)
    }
}
