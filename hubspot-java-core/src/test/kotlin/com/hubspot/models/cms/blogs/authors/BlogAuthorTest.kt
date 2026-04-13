// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogAuthorTest {

    @Test
    fun create() {
        val blogAuthor =
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

        assertThat(blogAuthor.id()).isEqualTo("id")
        assertThat(blogAuthor.avatar()).isEqualTo("avatar")
        assertThat(blogAuthor.bio()).isEqualTo("bio")
        assertThat(blogAuthor.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogAuthor.deletedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogAuthor.displayName()).isEqualTo("displayName")
        assertThat(blogAuthor.email()).isEqualTo("email")
        assertThat(blogAuthor.facebook()).isEqualTo("facebook")
        assertThat(blogAuthor.fullName()).isEqualTo("fullName")
        assertThat(blogAuthor.language()).isEqualTo(BlogAuthor.Language.AA)
        assertThat(blogAuthor.linkedin()).isEqualTo("linkedin")
        assertThat(blogAuthor.name()).isEqualTo("name")
        assertThat(blogAuthor.slug()).isEqualTo("slug")
        assertThat(blogAuthor.translatedFromId()).isEqualTo(0L)
        assertThat(blogAuthor.twitter()).isEqualTo("twitter")
        assertThat(blogAuthor.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blogAuthor.website()).isEqualTo("website")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blogAuthor =
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

        val roundtrippedBlogAuthor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(blogAuthor),
                jacksonTypeRef<BlogAuthor>(),
            )

        assertThat(roundtrippedBlogAuthor).isEqualTo(blogAuthor)
    }
}
