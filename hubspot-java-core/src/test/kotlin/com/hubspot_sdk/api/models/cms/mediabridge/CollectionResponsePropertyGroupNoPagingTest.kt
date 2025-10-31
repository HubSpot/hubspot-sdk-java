// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.crm.properties.PropertyGroup
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePropertyGroupNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePropertyGroupNoPaging =
            CollectionResponsePropertyGroupNoPaging.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .build()

        assertThat(collectionResponsePropertyGroupNoPaging.results())
            .containsExactly(
                PropertyGroup.builder()
                    .archived(true)
                    .displayOrder(-1)
                    .label("My Property Group")
                    .name("mypropertygroup")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePropertyGroupNoPaging =
            CollectionResponsePropertyGroupNoPaging.builder()
                .addResult(
                    PropertyGroup.builder()
                        .archived(true)
                        .displayOrder(-1)
                        .label("My Property Group")
                        .name("mypropertygroup")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePropertyGroupNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePropertyGroupNoPaging),
                jacksonTypeRef<CollectionResponsePropertyGroupNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePropertyGroupNoPaging)
            .isEqualTo(collectionResponsePropertyGroupNoPaging)
    }
}
