// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogAuthorCloneRequestVNextTest {

    @Test
    fun create() {
        val blogAuthorCloneRequestVNext =
            BlogAuthorCloneRequestVNext.builder()
                .id("id")
                .blogAuthor(
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
                        .language(BlogAuthor.Language.AF)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .language("language")
                .primaryLanguage("primaryLanguage")
                .build()

        assertThat(blogAuthorCloneRequestVNext.id()).isEqualTo("id")
        assertThat(blogAuthorCloneRequestVNext.blogAuthor())
            .isEqualTo(
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
                    .language(BlogAuthor.Language.AF)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
        assertThat(blogAuthorCloneRequestVNext.language()).contains("language")
        assertThat(blogAuthorCloneRequestVNext.primaryLanguage()).contains("primaryLanguage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogAuthorCloneRequestVNext =
            BlogAuthorCloneRequestVNext.builder()
                .id("id")
                .blogAuthor(
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
                        .language(BlogAuthor.Language.AF)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .language("language")
                .primaryLanguage("primaryLanguage")
                .build()

        val roundtrippedBlogAuthorCloneRequestVNext =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogAuthorCloneRequestVNext),
                jacksonTypeRef<BlogAuthorCloneRequestVNext>(),
            )

        assertThat(roundtrippedBlogAuthorCloneRequestVNext).isEqualTo(blogAuthorCloneRequestVNext)
    }
}
