// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.owners

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.settings.users.PublicTeam
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
                        .id("6166860")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .type(PublicOwner.Type.PERSON)
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                        .email("jsmith@example.com")
                        .firstName("John")
                        .lastName("Smith")
                        .addTeam(
                            PublicTeam.builder()
                                .id("178588")
                                .name("West Coast Sales")
                                .addSecondaryUserId("124")
                                .addUserId("123")
                                .build()
                        )
                        .addTeam(
                            PublicTeam.builder()
                                .id("178590")
                                .name("California Sales")
                                .addSecondaryUserId("124")
                                .addUserId("123")
                                .build()
                        )
                        .userId(1296619)
                        .userIdIncludingInactive(6166860)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponsePublicOwnerForwardPaging.results())
            .containsExactly(
                PublicOwner.builder()
                    .id("6166860")
                    .archived(false)
                    .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                    .type(PublicOwner.Type.PERSON)
                    .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                    .email("jsmith@example.com")
                    .firstName("John")
                    .lastName("Smith")
                    .addTeam(
                        PublicTeam.builder()
                            .id("178588")
                            .name("West Coast Sales")
                            .addSecondaryUserId("124")
                            .addUserId("123")
                            .build()
                    )
                    .addTeam(
                        PublicTeam.builder()
                            .id("178590")
                            .name("California Sales")
                            .addSecondaryUserId("124")
                            .addUserId("123")
                            .build()
                    )
                    .userId(1296619)
                    .userIdIncludingInactive(6166860)
                    .build()
            )
        assertThat(collectionResponsePublicOwnerForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponsePublicOwnerForwardPaging =
            CollectionResponsePublicOwnerForwardPaging.builder()
                .addResult(
                    PublicOwner.builder()
                        .id("6166860")
                        .archived(false)
                        .createdAt(OffsetDateTime.parse("2019-10-30T03:30:17.883Z"))
                        .type(PublicOwner.Type.PERSON)
                        .updatedAt(OffsetDateTime.parse("2019-12-07T16:50:06.678Z"))
                        .email("jsmith@example.com")
                        .firstName("John")
                        .lastName("Smith")
                        .addTeam(
                            PublicTeam.builder()
                                .id("178588")
                                .name("West Coast Sales")
                                .addSecondaryUserId("124")
                                .addUserId("123")
                                .build()
                        )
                        .addTeam(
                            PublicTeam.builder()
                                .id("178590")
                                .name("California Sales")
                                .addSecondaryUserId("124")
                                .addUserId("123")
                                .build()
                        )
                        .userId(1296619)
                        .userIdIncludingInactive(6166860)
                        .build()
                )
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
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
