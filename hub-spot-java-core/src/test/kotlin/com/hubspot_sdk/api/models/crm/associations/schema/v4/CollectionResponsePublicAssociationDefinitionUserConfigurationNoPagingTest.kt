// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicAssociationDefinitionUserConfigurationNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.builder()
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.results())
            .containsExactly(
                PublicAssociationDefinitionUserConfiguration.builder()
                    .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging.builder()
                .addResult(
                    PublicAssociationDefinitionUserConfiguration.builder()
                        .category(
                            PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED
                        )
                        .typeId(0)
                        .label("label")
                        .userEnforcedMaxToObjectIds(0)
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
                ),
                jacksonTypeRef<
                    CollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
                >(),
            )

        assertThat(
                roundtrippedCollectionResponsePublicAssociationDefinitionUserConfigurationNoPaging
            )
            .isEqualTo(collectionResponsePublicAssociationDefinitionUserConfigurationNoPaging)
    }
}
