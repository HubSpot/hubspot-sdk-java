// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import com.hubspot.sdk.models.PublicObjectId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiWithLabelTest {

    @Test
    fun create() {
        val publicAssociationMultiWithLabel =
            PublicAssociationMultiWithLabel.builder()
                .from(PublicObjectId.builder().id("id").build())
                .addTo(
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(publicAssociationMultiWithLabel.from())
            .isEqualTo(PublicObjectId.builder().id("id").build())
        assertThat(publicAssociationMultiWithLabel.to())
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
        assertThat(publicAssociationMultiWithLabel.paging())
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
        val publicAssociationMultiWithLabel =
            PublicAssociationMultiWithLabel.builder()
                .from(PublicObjectId.builder().id("id").build())
                .addTo(
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedPublicAssociationMultiWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssociationMultiWithLabel),
                jacksonTypeRef<PublicAssociationMultiWithLabel>(),
            )

        assertThat(roundtrippedPublicAssociationMultiWithLabel)
            .isEqualTo(publicAssociationMultiWithLabel)
    }
}
