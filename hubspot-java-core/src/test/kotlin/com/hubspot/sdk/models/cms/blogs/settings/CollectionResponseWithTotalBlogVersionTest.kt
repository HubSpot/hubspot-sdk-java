// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.NextPage
import com.hubspot.sdk.models.Paging
import com.hubspot.sdk.models.PreviousPage
import com.hubspot.sdk.models.VersionUser
import com.hubspot.sdk.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalBlogVersionTest {

    @Test
    fun create() {
        val collectionResponseWithTotalBlogVersion =
            CollectionResponseWithTotalBlogVersion.builder()
                .addResult(
                    VersionBlog.builder()
                        .id("id")
                        .object_(
                            Blog.builder()
                                .id("id")
                                .absoluteUrl("absoluteUrl")
                                .allowComments(true)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .description("description")
                                .htmlTitle("htmlTitle")
                                .language(Blog.Language.AA)
                                .listingPageId("listingPageId")
                                .name("name")
                                .addPublicAccessRule(PublicAccessRule.builder().build())
                                .publicAccessRulesEnabled(true)
                                .publicTitle("publicTitle")
                                .slug("slug")
                                .translatedFromId("translatedFromId")
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalBlogVersion.results())
            .containsExactly(
                VersionBlog.builder()
                    .id("id")
                    .object_(
                        Blog.builder()
                            .id("id")
                            .absoluteUrl("absoluteUrl")
                            .allowComments(true)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .description("description")
                            .htmlTitle("htmlTitle")
                            .language(Blog.Language.AA)
                            .listingPageId("listingPageId")
                            .name("name")
                            .addPublicAccessRule(PublicAccessRule.builder().build())
                            .publicAccessRulesEnabled(true)
                            .publicTitle("publicTitle")
                            .slug("slug")
                            .translatedFromId("translatedFromId")
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .user(
                        VersionUser.builder().id("id").email("email").fullName("fullName").build()
                    )
                    .build()
            )
        assertThat(collectionResponseWithTotalBlogVersion.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalBlogVersion.paging())
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
        val collectionResponseWithTotalBlogVersion =
            CollectionResponseWithTotalBlogVersion.builder()
                .addResult(
                    VersionBlog.builder()
                        .id("id")
                        .object_(
                            Blog.builder()
                                .id("id")
                                .absoluteUrl("absoluteUrl")
                                .allowComments(true)
                                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .description("description")
                                .htmlTitle("htmlTitle")
                                .language(Blog.Language.AA)
                                .listingPageId("listingPageId")
                                .name("name")
                                .addPublicAccessRule(PublicAccessRule.builder().build())
                                .publicAccessRulesEnabled(true)
                                .publicTitle("publicTitle")
                                .slug("slug")
                                .translatedFromId("translatedFromId")
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
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalBlogVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalBlogVersion),
                jacksonTypeRef<CollectionResponseWithTotalBlogVersion>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalBlogVersion)
            .isEqualTo(collectionResponseWithTotalBlogVersion)
    }
}
