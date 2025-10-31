// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicSearchResultsTest {

    @Test
    fun create() {
        val publicSearchResults =
            PublicSearchResults.builder()
                .limit(0)
                .offset(0)
                .page(0)
                .addResult(
                    ContentSearchResult.builder()
                        .id(0)
                        .domain("domain")
                        .score(0.0)
                        .type(ContentSearchResult.Type.LANDING_PAGE)
                        .url("url")
                        .authorFullName("authorFullName")
                        .category("category")
                        .combinedId("combinedId")
                        .description("description")
                        .featuredImageUrl("featuredImageUrl")
                        .language(ContentSearchResult.Language.AF)
                        .publishedDate(0L)
                        .rowId(0L)
                        .subcategory("subcategory")
                        .tableId(0L)
                        .addTag("string")
                        .title("title")
                        .build()
                )
                .total(0)
                .searchTerm("searchTerm")
                .build()

        assertThat(publicSearchResults.limit()).isEqualTo(0)
        assertThat(publicSearchResults.offset()).isEqualTo(0)
        assertThat(publicSearchResults.page()).isEqualTo(0)
        assertThat(publicSearchResults.results())
            .containsExactly(
                ContentSearchResult.builder()
                    .id(0)
                    .domain("domain")
                    .score(0.0)
                    .type(ContentSearchResult.Type.LANDING_PAGE)
                    .url("url")
                    .authorFullName("authorFullName")
                    .category("category")
                    .combinedId("combinedId")
                    .description("description")
                    .featuredImageUrl("featuredImageUrl")
                    .language(ContentSearchResult.Language.AF)
                    .publishedDate(0L)
                    .rowId(0L)
                    .subcategory("subcategory")
                    .tableId(0L)
                    .addTag("string")
                    .title("title")
                    .build()
            )
        assertThat(publicSearchResults.total()).isEqualTo(0)
        assertThat(publicSearchResults.searchTerm()).contains("searchTerm")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicSearchResults =
            PublicSearchResults.builder()
                .limit(0)
                .offset(0)
                .page(0)
                .addResult(
                    ContentSearchResult.builder()
                        .id(0)
                        .domain("domain")
                        .score(0.0)
                        .type(ContentSearchResult.Type.LANDING_PAGE)
                        .url("url")
                        .authorFullName("authorFullName")
                        .category("category")
                        .combinedId("combinedId")
                        .description("description")
                        .featuredImageUrl("featuredImageUrl")
                        .language(ContentSearchResult.Language.AF)
                        .publishedDate(0L)
                        .rowId(0L)
                        .subcategory("subcategory")
                        .tableId(0L)
                        .addTag("string")
                        .title("title")
                        .build()
                )
                .total(0)
                .searchTerm("searchTerm")
                .build()

        val roundtrippedPublicSearchResults =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicSearchResults),
                jacksonTypeRef<PublicSearchResults>(),
            )

        assertThat(roundtrippedPublicSearchResults).isEqualTo(publicSearchResults)
    }
}
