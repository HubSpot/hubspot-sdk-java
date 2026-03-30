// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalBlogTest {

    @Test
    fun create() {
        val collectionResponseWithTotalBlog =
            CollectionResponseWithTotalBlog.builder()
                .addResult(
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
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalBlog.results())
            .containsExactly(
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
        assertThat(collectionResponseWithTotalBlog.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalBlog.paging())
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
        val collectionResponseWithTotalBlog =
            CollectionResponseWithTotalBlog.builder()
                .addResult(
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
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalBlog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalBlog),
                jacksonTypeRef<CollectionResponseWithTotalBlog>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalBlog)
            .isEqualTo(collectionResponseWithTotalBlog)
    }
}
