// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.properties

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePropertyGroupTest {

    @Test
    fun create() {
        val collectionResponsePropertyGroup =
            CollectionResponsePropertyGroup.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePropertyGroup.results())
            .containsExactly(
                PropertyGroup.builder()
                    .archived(true)
                    .displayOrder(-1)
                    .label("My Property Group")
                    .name("mypropertygroup")
                    .build()
            )
        assertThat(collectionResponsePropertyGroup.paging())
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
        val collectionResponsePropertyGroup =
            CollectionResponsePropertyGroup.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePropertyGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePropertyGroup),
                jacksonTypeRef<CollectionResponsePropertyGroup>(),
            )

        assertThat(roundtrippedCollectionResponsePropertyGroup)
            .isEqualTo(collectionResponsePropertyGroup)
    }
}
