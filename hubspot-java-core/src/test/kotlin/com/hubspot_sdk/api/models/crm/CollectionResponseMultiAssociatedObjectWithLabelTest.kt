// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseMultiAssociatedObjectWithLabelTest {

    @Test
    fun create() {
        val collectionResponseMultiAssociatedObjectWithLabel =
            CollectionResponseMultiAssociatedObjectWithLabel.builder()
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
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseMultiAssociatedObjectWithLabel.results())
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
        assertThat(collectionResponseMultiAssociatedObjectWithLabel.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseMultiAssociatedObjectWithLabel =
            CollectionResponseMultiAssociatedObjectWithLabel.builder()
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
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseMultiAssociatedObjectWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseMultiAssociatedObjectWithLabel),
                jacksonTypeRef<CollectionResponseMultiAssociatedObjectWithLabel>(),
            )

        assertThat(roundtrippedCollectionResponseMultiAssociatedObjectWithLabel)
            .isEqualTo(collectionResponseMultiAssociatedObjectWithLabel)
    }
}
