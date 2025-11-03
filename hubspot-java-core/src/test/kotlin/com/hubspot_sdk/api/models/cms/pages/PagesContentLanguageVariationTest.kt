// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PagesContentLanguageVariationTest {

    @Test
    fun create() {
        val pagesContentLanguageVariation =
            PagesContentLanguageVariation.builder()
                .id(0L)
                .archivedInDashboard(true)
                .authorName("authorName")
                .campaign("campaign")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .password("password")
                .addPublicAccessRule(PublicAccessRule.builder().build())
                .publicAccessRulesEnabled(true)
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .slug("slug")
                .state("state")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagId(0L)
                .build()

        assertThat(pagesContentLanguageVariation.id()).isEqualTo(0L)
        assertThat(pagesContentLanguageVariation.archivedInDashboard()).isEqualTo(true)
        assertThat(pagesContentLanguageVariation.authorName()).isEqualTo("authorName")
        assertThat(pagesContentLanguageVariation.campaign()).isEqualTo("campaign")
        assertThat(pagesContentLanguageVariation.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesContentLanguageVariation.name()).isEqualTo("name")
        assertThat(pagesContentLanguageVariation.password()).isEqualTo("password")
        assertThat(pagesContentLanguageVariation.publicAccessRules())
            .containsExactly(PublicAccessRule.builder().build())
        assertThat(pagesContentLanguageVariation.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(pagesContentLanguageVariation.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesContentLanguageVariation.slug()).isEqualTo("slug")
        assertThat(pagesContentLanguageVariation.state()).isEqualTo("state")
        assertThat(pagesContentLanguageVariation.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(pagesContentLanguageVariation.tagIds().getOrNull()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pagesContentLanguageVariation =
            PagesContentLanguageVariation.builder()
                .id(0L)
                .archivedInDashboard(true)
                .authorName("authorName")
                .campaign("campaign")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .password("password")
                .addPublicAccessRule(PublicAccessRule.builder().build())
                .publicAccessRulesEnabled(true)
                .publishDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .slug("slug")
                .state("state")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addTagId(0L)
                .build()

        val roundtrippedPagesContentLanguageVariation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pagesContentLanguageVariation),
                jacksonTypeRef<PagesContentLanguageVariation>(),
            )

        assertThat(roundtrippedPagesContentLanguageVariation)
            .isEqualTo(pagesContentLanguageVariation)
    }
}
