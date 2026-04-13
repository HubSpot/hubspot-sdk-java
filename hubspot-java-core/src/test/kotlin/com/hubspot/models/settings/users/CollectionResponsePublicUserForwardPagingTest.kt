// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicUserForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicUserForwardPaging =
            CollectionResponsePublicUserForwardPaging.builder()
                .addResult(
                    PublicUser.builder()
                        .id("id")
                        .email("email")
                        .addRoleId("string")
                        .superAdmin(true)
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("primaryTeamId")
                        .roleId("roleId")
                        .addSecondaryTeamId("string")
                        .sendWelcomeEmail(true)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicUserForwardPaging.results())
            .containsExactly(
                PublicUser.builder()
                    .id("id")
                    .email("email")
                    .addRoleId("string")
                    .superAdmin(true)
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("primaryTeamId")
                    .roleId("roleId")
                    .addSecondaryTeamId("string")
                    .sendWelcomeEmail(true)
                    .build()
            )
        assertThat(collectionResponsePublicUserForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicUserForwardPaging =
            CollectionResponsePublicUserForwardPaging.builder()
                .addResult(
                    PublicUser.builder()
                        .id("id")
                        .email("email")
                        .addRoleId("string")
                        .superAdmin(true)
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("primaryTeamId")
                        .roleId("roleId")
                        .addSecondaryTeamId("string")
                        .sendWelcomeEmail(true)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicUserForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicUserForwardPaging),
                jacksonTypeRef<CollectionResponsePublicUserForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicUserForwardPaging)
            .isEqualTo(collectionResponsePublicUserForwardPaging)
    }
}
