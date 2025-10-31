// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociationSpecWithLabel1Test {

    @Test
    fun create() {
        val associationSpecWithLabel1 =
            AssociationSpecWithLabel1.builder()
                .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .build()

        assertThat(associationSpecWithLabel1.category())
            .isEqualTo(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
        assertThat(associationSpecWithLabel1.typeId()).isEqualTo(0)
        assertThat(associationSpecWithLabel1.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val associationSpecWithLabel1 =
            AssociationSpecWithLabel1.builder()
                .category(AssociationSpecWithLabel1.Category.HUBSPOT_DEFINED)
                .typeId(0)
                .label("label")
                .build()

        val roundtrippedAssociationSpecWithLabel1 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(associationSpecWithLabel1),
                jacksonTypeRef<AssociationSpecWithLabel1>(),
            )

        assertThat(roundtrippedAssociationSpecWithLabel1).isEqualTo(associationSpecWithLabel1)
    }
}
