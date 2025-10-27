// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.PublicObjectId
import com.hubspot_sdk.api.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.marketing.emails.Paging
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssociationMultiWithLabelTest {

    @Test
    fun create() {
        val publicAssociationMultiWithLabel =
            PublicAssociationMultiWithLabel.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .addTo(
                    MultiAssociatedObjectWithLabel.builder()
                        .addAssociationType(
                            AssociationSpecWithLabel1.builder()
                                .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
                                .typeId(0)
                                .label("label")
                                .build()
                        )
                        .toObjectId("toObjectId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(publicAssociationMultiWithLabel.from())
            .isEqualTo(PublicObjectId.builder().id("37295").build())
        assertThat(publicAssociationMultiWithLabel.to())
            .containsExactly(
                MultiAssociatedObjectWithLabel.builder()
                    .addAssociationType(
                        AssociationSpecWithLabel1.builder()
                            .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
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
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssociationMultiWithLabel =
            PublicAssociationMultiWithLabel.builder()
                .from(PublicObjectId.builder().id("37295").build())
                .addTo(
                    MultiAssociatedObjectWithLabel.builder()
                        .addAssociationType(
                            AssociationSpecWithLabel1.builder()
                                .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
                                .typeId(0)
                                .label("label")
                                .build()
                        )
                        .toObjectId("toObjectId")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
