// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseMultiAssociatedObjectWithLabelForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseMultiAssociatedObjectWithLabelForwardPaging =
            CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.builder()
                .addResult(
                    MultiAssociatedObjectWithLabel.builder()
                        .addAssociationType(
                            AssociationSpecWithLabel.builder()
                                .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                                .typeId(0)
                                .label("label")
                                .build()
                        )
                        .toObjectId("toObjectId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseMultiAssociatedObjectWithLabelForwardPaging.results())
            .containsExactly(
                MultiAssociatedObjectWithLabel.builder()
                    .addAssociationType(
                        AssociationSpecWithLabel.builder()
                            .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                            .typeId(0)
                            .label("label")
                            .build()
                    )
                    .toObjectId("toObjectId")
                    .build()
            )
        assertThat(collectionResponseMultiAssociatedObjectWithLabelForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseMultiAssociatedObjectWithLabelForwardPaging =
            CollectionResponseMultiAssociatedObjectWithLabelForwardPaging.builder()
                .addResult(
                    MultiAssociatedObjectWithLabel.builder()
                        .addAssociationType(
                            AssociationSpecWithLabel.builder()
                                .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                                .typeId(0)
                                .label("label")
                                .build()
                        )
                        .toObjectId("toObjectId")
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseMultiAssociatedObjectWithLabelForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponseMultiAssociatedObjectWithLabelForwardPaging
                ),
                jacksonTypeRef<CollectionResponseMultiAssociatedObjectWithLabelForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseMultiAssociatedObjectWithLabelForwardPaging)
            .isEqualTo(collectionResponseMultiAssociatedObjectWithLabelForwardPaging)
    }
}
