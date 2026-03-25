// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalBlogAuthorForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalBlogAuthorForwardPaging =
            CollectionResponseWithTotalBlogAuthorForwardPaging.builder()
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AA)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalBlogAuthorForwardPaging.results())
            .containsExactly(
                BlogAuthor.builder()
                    .id("id")
                    .avatar("avatar")
                    .bio("bio")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("displayName")
                    .email("email")
                    .facebook("facebook")
                    .fullName("fullName")
                    .language(BlogAuthor.Language.AA)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
        assertThat(collectionResponseWithTotalBlogAuthorForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalBlogAuthorForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalBlogAuthorForwardPaging =
            CollectionResponseWithTotalBlogAuthorForwardPaging.builder()
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AA)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalBlogAuthorForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalBlogAuthorForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalBlogAuthorForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalBlogAuthorForwardPaging)
            .isEqualTo(collectionResponseWithTotalBlogAuthorForwardPaging)
    }
}
