// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.settings.users

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicUserForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicUserForwardPaging =
            CollectionResponsePublicUserForwardPaging.builder()
                .addResult(
                    PublicUser.builder()
                        .id("123")
                        .email("newUser@email.com")
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("101")
                        .roleId("100")
                        .addRoleId("string")
                        .addSecondaryTeamId("102")
                        .sendWelcomeEmail(true)
                        .superAdmin(true)
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
                    .id("123")
                    .email("newUser@email.com")
                    .firstName("firstName")
                    .lastName("lastName")
                    .primaryTeamId("101")
                    .roleId("100")
                    .addRoleId("string")
                    .addSecondaryTeamId("102")
                    .sendWelcomeEmail(true)
                    .superAdmin(true)
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
                        .id("123")
                        .email("newUser@email.com")
                        .firstName("firstName")
                        .lastName("lastName")
                        .primaryTeamId("101")
                        .roleId("100")
                        .addRoleId("string")
                        .addSecondaryTeamId("102")
                        .sendWelcomeEmail(true)
                        .superAdmin(true)
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
