// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.objects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationSpecWithLabelTest {

    @Test
    fun create() {
        val associationSpecWithLabel =
            AssociationSpecWithLabel.builder()
                .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .build()

        assertThat(associationSpecWithLabel.category())
            .isEqualTo(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
        assertThat(associationSpecWithLabel.typeId()).isEqualTo(0)
        assertThat(associationSpecWithLabel.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationSpecWithLabel =
            AssociationSpecWithLabel.builder()
                .category(AssociationSpecWithLabel.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .build()

        val roundtrippedAssociationSpecWithLabel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSpecWithLabel),
                jacksonTypeRef<AssociationSpecWithLabel>(),
            )

        assertThat(roundtrippedAssociationSpecWithLabel).isEqualTo(associationSpecWithLabel)
    }
}
