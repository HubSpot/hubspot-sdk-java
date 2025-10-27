// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicAssociationDefinitionNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicAssociationDefinitionNoPaging =
            CollectionResponsePublicAssociationDefinitionNoPaging.builder()
                .addResult(
                    PublicAssociationDefinition.builder().id("1").name("contact_to_company").build()
                )
                .build()

        assertThat(collectionResponsePublicAssociationDefinitionNoPaging.results())
            .containsExactly(
                PublicAssociationDefinition.builder().id("1").name("contact_to_company").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicAssociationDefinitionNoPaging =
            CollectionResponsePublicAssociationDefinitionNoPaging.builder()
                .addResult(
                    PublicAssociationDefinition.builder().id("1").name("contact_to_company").build()
                )
                .build()

        val roundtrippedCollectionResponsePublicAssociationDefinitionNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicAssociationDefinitionNoPaging
                ),
                jacksonTypeRef<CollectionResponsePublicAssociationDefinitionNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicAssociationDefinitionNoPaging)
            .isEqualTo(collectionResponsePublicAssociationDefinitionNoPaging)
    }
}
