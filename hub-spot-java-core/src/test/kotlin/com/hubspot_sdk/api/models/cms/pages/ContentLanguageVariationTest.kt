// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.pages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.cms.PublicAccessRule
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContentLanguageVariationTest {

    @Test
    fun create() {
        val contentLanguageVariation =
            ContentLanguageVariation.builder()
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

        assertThat(contentLanguageVariation.id()).isEqualTo(0L)
        assertThat(contentLanguageVariation.archivedInDashboard()).isEqualTo(true)
        assertThat(contentLanguageVariation.authorName()).isEqualTo("authorName")
        assertThat(contentLanguageVariation.campaign()).isEqualTo("campaign")
        assertThat(contentLanguageVariation.created())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentLanguageVariation.name()).isEqualTo("name")
        assertThat(contentLanguageVariation.password()).isEqualTo("password")
        assertThat(contentLanguageVariation.publicAccessRules())
            .containsExactly(PublicAccessRule.builder().build())
        assertThat(contentLanguageVariation.publicAccessRulesEnabled()).isEqualTo(true)
        assertThat(contentLanguageVariation.publishDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentLanguageVariation.slug()).isEqualTo("slug")
        assertThat(contentLanguageVariation.state()).isEqualTo("state")
        assertThat(contentLanguageVariation.updated())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(contentLanguageVariation.tagIds().getOrNull()).containsExactly(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contentLanguageVariation =
            ContentLanguageVariation.builder()
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

        val roundtrippedContentLanguageVariation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contentLanguageVariation),
                jacksonTypeRef<ContentLanguageVariation>(),
            )

        assertThat(roundtrippedContentLanguageVariation).isEqualTo(contentLanguageVariation)
    }
}
