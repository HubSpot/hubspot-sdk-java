// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.VersionUser
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalVersionContentFolderTest {

    @Test
    fun create() {
        val collectionResponseWithTotalVersionContentFolder =
            CollectionResponseWithTotalVersionContentFolder.builder()
                .addResult(
                    VersionContentFolder.builder()
                        .id("id")
                        .object_(
                            ContentFolder.builder()
                                .id("id")
                                .category(0)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .name("name")
                                .parentFolderId(0L)
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .user(
                            VersionUser.builder()
                                .id("id")
                                .email("email")
                                .fullName("fullName")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalVersionContentFolder.results())
            .containsExactly(
                VersionContentFolder.builder()
                    .id("id")
                    .object_(
                        ContentFolder.builder()
                            .id("id")
                            .category(0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .name("name")
                            .parentFolderId(0L)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .user(
                        VersionUser.builder().id("id").email("email").fullName("fullName").build()
                    )
                    .build()
            )
        assertThat(collectionResponseWithTotalVersionContentFolder.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalVersionContentFolder.paging())
            .contains(
                EmailsPaging.builder()
                    .next(NextPage.builder().after("").link("").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalVersionContentFolder =
            CollectionResponseWithTotalVersionContentFolder.builder()
                .addResult(
                    VersionContentFolder.builder()
                        .id("id")
                        .object_(
                            ContentFolder.builder()
                                .id("id")
                                .category(0)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .name("name")
                                .parentFolderId(0L)
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .user(
                            VersionUser.builder()
                                .id("id")
                                .email("email")
                                .fullName("fullName")
                                .build()
                        )
                        .build()
                )
                .total(0)
                .paging(
                    EmailsPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalVersionContentFolder =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalVersionContentFolder),
                jacksonTypeRef<CollectionResponseWithTotalVersionContentFolder>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalVersionContentFolder)
            .isEqualTo(collectionResponseWithTotalVersionContentFolder)
    }
}
