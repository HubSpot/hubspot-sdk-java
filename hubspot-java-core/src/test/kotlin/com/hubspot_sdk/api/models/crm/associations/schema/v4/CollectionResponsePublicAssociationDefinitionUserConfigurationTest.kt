// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.schema.v4

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicAssociationDefinitionUserConfigurationTest {

    @Test
    fun create() {
        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            CollectionResponsePublicAssociationDefinitionUserConfiguration.builder()
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicAssociationDefinitionUserConfiguration.results())
            .containsExactly(
                PublicAssociationDefinitionUserConfiguration.builder()
                    .category(PublicAssociationDefinitionUserConfiguration.Category.HUBSPOT_DEFINED)
                    .typeId(0)
                    .label("label")
                    .userEnforcedMaxToObjectIds(0)
                    .build()
            )
        assertThat(collectionResponsePublicAssociationDefinitionUserConfiguration.paging())
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
        val collectionResponsePublicAssociationDefinitionUserConfiguration =
            CollectionResponsePublicAssociationDefinitionUserConfiguration.builder()
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
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicAssociationDefinitionUserConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    collectionResponsePublicAssociationDefinitionUserConfiguration
                ),
                jacksonTypeRef<CollectionResponsePublicAssociationDefinitionUserConfiguration>(),
            )

        assertThat(roundtrippedCollectionResponsePublicAssociationDefinitionUserConfiguration)
            .isEqualTo(collectionResponsePublicAssociationDefinitionUserConfiguration)
    }
}
