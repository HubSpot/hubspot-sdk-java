// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicTeamNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicTeamNoPaging =
            CollectionResponsePublicTeamNoPaging.builder()
                .addResult(
                    PublicTeam.builder()
                        .id("id")
                        .name("name")
                        .addSecondaryUserId("string")
                        .addUserId("string")
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicTeamNoPaging.results())
            .containsExactly(
                PublicTeam.builder()
                    .id("id")
                    .name("name")
                    .addSecondaryUserId("string")
                    .addUserId("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicTeamNoPaging =
            CollectionResponsePublicTeamNoPaging.builder()
                .addResult(
                    PublicTeam.builder()
                        .id("id")
                        .name("name")
                        .addSecondaryUserId("string")
                        .addUserId("string")
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicTeamNoPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicTeamNoPaging),
                jacksonTypeRef<CollectionResponsePublicTeamNoPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicTeamNoPaging)
            .isEqualTo(collectionResponsePublicTeamNoPaging)
    }
}
