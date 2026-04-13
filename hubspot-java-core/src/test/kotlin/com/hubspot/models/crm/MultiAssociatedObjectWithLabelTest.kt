// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultiAssociatedObjectWithLabelTest {

    @Test
    fun create() {
        val multiAssociatedObjectWithLabel =
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

        assertThat(multiAssociatedObjectWithLabel.associationTypes())
            .containsExactly(
                AssociationSpecWithLabel.builder()
                    .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
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
                    AssociationSpecWithLabel.builder()
                        .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
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
