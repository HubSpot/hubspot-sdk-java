// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentSearchResultTest {

    @Test
    fun create() {
        val contentSearchResult =
            ContentSearchResult.builder()
                .id(0)
                .domain("domain")
                .score(0.0)
                .type(ContentSearchResult.Type.BLOG_POST)
                .url("url")
                .authorFullName("authorFullName")
                .category("category")
                .combinedId("combinedId")
                .contentType("contentType")
                .description("description")
                .featuredImageUrl("featuredImageUrl")
                .inBeta(true)
                .isPrivate(true)
                .language(ContentSearchResult.Language.AA)
                .publishedDate(0L)
                .rowId(0L)
                .subcategory("subcategory")
                .tableId(0L)
                .addTag("string")
                .title("title")
                .build()

        assertThat(contentSearchResult.id()).isEqualTo(0)
        assertThat(contentSearchResult.domain()).isEqualTo("domain")
        assertThat(contentSearchResult.score()).isEqualTo(0.0)
        assertThat(contentSearchResult.type()).isEqualTo(ContentSearchResult.Type.BLOG_POST)
        assertThat(contentSearchResult.url()).isEqualTo("url")
        assertThat(contentSearchResult.authorFullName()).contains("authorFullName")
        assertThat(contentSearchResult.category()).contains("category")
        assertThat(contentSearchResult.combinedId()).contains("combinedId")
        assertThat(contentSearchResult.contentType()).contains("contentType")
        assertThat(contentSearchResult.description()).contains("description")
        assertThat(contentSearchResult.featuredImageUrl()).contains("featuredImageUrl")
        assertThat(contentSearchResult.inBeta()).contains(true)
        assertThat(contentSearchResult.isPrivate()).contains(true)
        assertThat(contentSearchResult.language()).contains(ContentSearchResult.Language.AA)
        assertThat(contentSearchResult.publishedDate()).contains(0L)
        assertThat(contentSearchResult.rowId()).contains(0L)
        assertThat(contentSearchResult.subcategory()).contains("subcategory")
        assertThat(contentSearchResult.tableId()).contains(0L)
        assertThat(contentSearchResult.tags().getOrNull()).containsExactly("string")
        assertThat(contentSearchResult.title()).contains("title")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentSearchResult =
            ContentSearchResult.builder()
                .id(0)
                .domain("domain")
                .score(0.0)
                .type(ContentSearchResult.Type.BLOG_POST)
                .url("url")
                .authorFullName("authorFullName")
                .category("category")
                .combinedId("combinedId")
                .contentType("contentType")
                .description("description")
                .featuredImageUrl("featuredImageUrl")
                .inBeta(true)
                .isPrivate(true)
                .language(ContentSearchResult.Language.AA)
                .publishedDate(0L)
                .rowId(0L)
                .subcategory("subcategory")
                .tableId(0L)
                .addTag("string")
                .title("title")
                .build()

        val roundtrippedContentSearchResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentSearchResult),
                jacksonTypeRef<ContentSearchResult>(),
            )

        assertThat(roundtrippedContentSearchResult).isEqualTo(contentSearchResult)
    }
}
