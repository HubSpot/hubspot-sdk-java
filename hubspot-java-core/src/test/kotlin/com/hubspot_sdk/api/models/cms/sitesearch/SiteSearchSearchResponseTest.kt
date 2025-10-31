// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.sitesearch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiteSearchSearchResponseTest {

    @Test
    fun create() {
        val siteSearchSearchResponse =
            SiteSearchSearchResponse.builder()
                .limit(0)
                .offset(0)
                .page(0)
                .addResult(
                    SiteSearchSearchResponse.Result.builder()
                        .id(0)
                        .domain("domain")
                        .score(0.0)
                        .type(SiteSearchSearchResponse.Result.Type.LANDING_PAGE)
                        .url("url")
                        .authorFullName("authorFullName")
                        .category("category")
                        .combinedId("combinedId")
                        .description("description")
                        .featuredImageUrl("featuredImageUrl")
                        .language(SiteSearchSearchResponse.Result.Language.AF)
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

        assertThat(siteSearchSearchResponse.limit()).isEqualTo(0)
        assertThat(siteSearchSearchResponse.offset()).isEqualTo(0)
        assertThat(siteSearchSearchResponse.page()).isEqualTo(0)
        assertThat(siteSearchSearchResponse.results())
            .containsExactly(
                SiteSearchSearchResponse.Result.builder()
                    .id(0)
                    .domain("domain")
                    .score(0.0)
                    .type(SiteSearchSearchResponse.Result.Type.LANDING_PAGE)
                    .url("url")
                    .authorFullName("authorFullName")
                    .category("category")
                    .combinedId("combinedId")
                    .description("description")
                    .featuredImageUrl("featuredImageUrl")
                    .language(SiteSearchSearchResponse.Result.Language.AF)
                    .publishedDate(0L)
                    .rowId(0L)
                    .subcategory("subcategory")
                    .tableId(0L)
                    .addTag("string")
                    .title("title")
                    .build()
            )
        assertThat(siteSearchSearchResponse.total()).isEqualTo(0)
        assertThat(siteSearchSearchResponse.searchTerm()).contains("searchTerm")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val siteSearchSearchResponse =
            SiteSearchSearchResponse.builder()
                .limit(0)
                .offset(0)
                .page(0)
                .addResult(
                    SiteSearchSearchResponse.Result.builder()
                        .id(0)
                        .domain("domain")
                        .score(0.0)
                        .type(SiteSearchSearchResponse.Result.Type.LANDING_PAGE)
                        .url("url")
                        .authorFullName("authorFullName")
                        .category("category")
                        .combinedId("combinedId")
                        .description("description")
                        .featuredImageUrl("featuredImageUrl")
                        .language(SiteSearchSearchResponse.Result.Language.AF)
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

        val roundtrippedSiteSearchSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(siteSearchSearchResponse),
                jacksonTypeRef<SiteSearchSearchResponse>(),
            )

        assertThat(roundtrippedSiteSearchSearchResponse).isEqualTo(siteSearchSearchResponse)
    }
}
