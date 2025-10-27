// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.VersionUser
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VersionBlogTest {

    @Test
    fun create() {
        val versionBlog =
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
                        .language(Blog.Language.AF)
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

        assertThat(versionBlog.id()).isEqualTo("id")
        assertThat(versionBlog.object_())
            .isEqualTo(
                Blog.builder()
                    .id("id")
                    .absoluteUrl("absoluteUrl")
                    .allowComments(true)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("description")
                    .htmlTitle("htmlTitle")
                    .language(Blog.Language.AF)
                    .name("name")
                    .addPublicAccessRule(PublicAccessRule.builder().build())
                    .publicAccessRulesEnabled(true)
                    .publicTitle("publicTitle")
                    .slug("slug")
                    .translatedFromId("translatedFromId")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(versionBlog.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(versionBlog.user())
            .isEqualTo(VersionUser.builder().id("id").email("email").fullName("fullName").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val versionBlog =
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
                        .language(Blog.Language.AF)
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

        val roundtrippedVersionBlog =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(versionBlog),
                jacksonTypeRef<VersionBlog>(),
            )

        assertThat(roundtrippedVersionBlog).isEqualTo(versionBlog)
    }
}
