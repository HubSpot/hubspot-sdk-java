// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.associations.v4.AssociationSpecWithLabel1
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiAssociatedObjectWithLabelTest {

    @Test
    fun create() {
        val multiAssociatedObjectWithLabel =
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

        assertThat(multiAssociatedObjectWithLabel.associationTypes())
            .containsExactly(
                AssociationSpecWithLabel1.builder()
                    .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .build()
            )
        assertThat(multiAssociatedObjectWithLabel.toObjectId()).isEqualTo("toObjectId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multiAssociatedObjectWithLabel =
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

        val roundtrippedMultiAssociatedObjectWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multiAssociatedObjectWithLabel),
                jacksonTypeRef<MultiAssociatedObjectWithLabel>(),
            )

        assertThat(roundtrippedMultiAssociatedObjectWithLabel)
            .isEqualTo(multiAssociatedObjectWithLabel)
    }
}
