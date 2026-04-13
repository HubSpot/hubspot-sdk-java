// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.blogs.settings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import com.hubspot.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BlogTest {

    @Test
    fun create() {
        val blog =
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

        assertThat(blog.id()).isEqualTo("id")
        assertThat(blog.absoluteUrl()).isEqualTo("absoluteUrl")
        assertThat(blog.allowComments()).isEqualTo(true)
        assertThat(blog.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blog.deletedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(blog.description()).isEqualTo("description")
        assertThat(blog.htmlTitle()).isEqualTo("htmlTitle")
        assertThat(blog.language()).isEqualTo(Blog.Language.AA)
        assertThat(blog.listingPageId()).isEqualTo("listingPageId")
        assertThat(blog.name()).isEqualTo("name")
        assertThat(blog.publicAccessRules()).containsExactly(PublicAccessRule.builder().build())
        assertThat(blog.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(blog.publicTitle()).isEqualTo("publicTitle")
        assertThat(blog.slug()).isEqualTo("slug")
        assertThat(blog.translatedFromId()).isEqualTo("translatedFromId")
        assertThat(blog.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val blog =
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

        val roundtrippedBlog =
            jsonMapper.readValue(jsonMapper.writeValueAsString(blog), jacksonTypeRef<Blog>())

        assertThat(roundtrippedBlog).isEqualTo(blog)
    }
}
