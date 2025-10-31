// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicTeamNoPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicTeamNoPaging =
            CollectionResponsePublicTeamNoPaging.builder()
                .addResult(
                    PublicTeam.builder()
                        .id("100")
                        .name("Test Team")
                        .addSecondaryUserId("124")
                        .addUserId("123")
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicTeamNoPaging.results())
            .containsExactly(
                PublicTeam.builder()
                    .id("100")
                    .name("Test Team")
                    .addSecondaryUserId("124")
                    .addUserId("123")
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
                        .id("100")
                        .name("Test Team")
                        .addSecondaryUserId("124")
                        .addUserId("123")
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
