// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.ForwardPaging
import com.hubspot.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponsePublicOwnerForwardPagingTest {

    @Test
    fun create() {
        val collectionResponsePublicOwnerForwardPaging =
            CollectionResponsePublicOwnerForwardPaging.builder()
                .addResult(
                    PublicOwner.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PublicOwner.Type.PERSON)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .addTeam(PublicTeam.builder().id("id").name("name").primary(true).build())
                        .userId(0)
                        .userIdIncludingInactive(0)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicOwnerForwardPaging.results())
            .containsExactly(
                PublicOwner.builder()
                    .id("id")
                    .archived(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PublicOwner.Type.PERSON)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .addTeam(PublicTeam.builder().id("id").name("name").primary(true).build())
                    .userId(0)
                    .userIdIncludingInactive(0)
                    .build()
            )
        assertThat(collectionResponsePublicOwnerForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicOwnerForwardPaging =
            CollectionResponsePublicOwnerForwardPaging.builder()
                .addResult(
                    PublicOwner.builder()
                        .id("id")
                        .archived(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(PublicOwner.Type.PERSON)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .addTeam(PublicTeam.builder().id("id").name("name").primary(true).build())
                        .userId(0)
                        .userIdIncludingInactive(0)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponsePublicOwnerForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponsePublicOwnerForwardPaging),
                jacksonTypeRef<CollectionResponsePublicOwnerForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponsePublicOwnerForwardPaging)
            .isEqualTo(collectionResponsePublicOwnerForwardPaging)
    }
}
