// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.VersionUser
import com.hubspot.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogVersionTest {

    @Test
    fun create() {
        val blogVersion =
            BlogVersion.builder()
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
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        assertThat(blogVersion.id()).isEqualTo("id")
        assertThat(blogVersion.object_())
            .isEqualTo(
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
        assertThat(blogVersion.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogVersion.user())
            .isEqualTo(VersionUser.builder().id("id").email("email").fullName("fullName").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogVersion =
            BlogVersion.builder()
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
                .user(VersionUser.builder().id("id").email("email").fullName("fullName").build())
                .build()

        val roundtrippedBlogVersion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogVersion),
                jacksonTypeRef<BlogVersion>(),
            )

        assertThat(roundtrippedBlogVersion).isEqualTo(blogVersion)
    }
}
