// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TagTest {

    @Test
    fun create() {
        val tag =
            Tag.builder()
                .id("id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .language(Tag.Language.AA)
                .name("name")
                .slug("slug")
                .translatedFromId(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(tag.id()).isEqualTo("id")
        assertThat(tag.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tag.deletedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(tag.language()).isEqualTo(Tag.Language.AA)
        assertThat(tag.name()).isEqualTo("name")
        assertThat(tag.slug()).isEqualTo("slug")
        assertThat(tag.translatedFromId()).isEqualTo(0L)
        assertThat(tag.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tag =
            Tag.builder()
                .id("id")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .language(Tag.Language.AA)
                .name("name")
                .slug("slug")
                .translatedFromId(0L)
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedTag =
            jsonMapper.readValue(jsonMapper.writeValueAsString(tag), jacksonTypeRef<Tag>())

        assertThat(roundtrippedTag).isEqualTo(tag)
    }
}
