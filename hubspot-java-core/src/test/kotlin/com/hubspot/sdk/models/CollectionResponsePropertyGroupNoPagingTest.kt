// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
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
                        .label("label")
                        .name("name")
                        .displayOrder(0)
                        .build()
                )
                .build()

        assertThat(collectionResponsePropertyGroupNoPaging.results())
            .containsExactly(
                PropertyGroup.builder()
                    .archived(true)
                    .label("label")
                    .name("name")
                    .displayOrder(0)
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
                        .label("label")
                        .name("name")
                        .displayOrder(0)
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
