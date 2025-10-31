// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DomainTest {

    @Test
    fun create() {
        val domain =
            Domain.builder()
                .id("id")
                .domain("domain")
                .isResolving(true)
                .isUsedForBlogPost(true)
                .isUsedForEmail(true)
                .isUsedForKnowledge(true)
                .isUsedForLandingPage(true)
                .isUsedForSitePage(true)
                .correctCname("correctCname")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isSslEnabled(true)
                .isSslOnly(true)
                .manuallyMarkedAsResolving(true)
                .primaryBlogPost(true)
                .primaryEmail(true)
                .primaryKnowledge(true)
                .primaryLandingPage(true)
                .primarySitePage(true)
                .secondaryToDomain("secondaryToDomain")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(domain.id()).isEqualTo("id")
        assertThat(domain.domain()).isEqualTo("domain")
        assertThat(domain.isResolving()).isEqualTo(true)
        assertThat(domain.isUsedForBlogPost()).isEqualTo(true)
        assertThat(domain.isUsedForEmail()).isEqualTo(true)
        assertThat(domain.isUsedForKnowledge()).isEqualTo(true)
        assertThat(domain.isUsedForLandingPage()).isEqualTo(true)
        assertThat(domain.isUsedForSitePage()).isEqualTo(true)
        assertThat(domain.correctCname()).contains("correctCname")
        assertThat(domain.created()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(domain.isSslEnabled()).contains(true)
        assertThat(domain.isSslOnly()).contains(true)
        assertThat(domain.manuallyMarkedAsResolving()).contains(true)
        assertThat(domain.primaryBlogPost()).contains(true)
        assertThat(domain.primaryEmail()).contains(true)
        assertThat(domain.primaryKnowledge()).contains(true)
        assertThat(domain.primaryLandingPage()).contains(true)
        assertThat(domain.primarySitePage()).contains(true)
        assertThat(domain.secondaryToDomain()).contains("secondaryToDomain")
        assertThat(domain.updated()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val domain =
            Domain.builder()
                .id("id")
                .domain("domain")
                .isResolving(true)
                .isUsedForBlogPost(true)
                .isUsedForEmail(true)
                .isUsedForKnowledge(true)
                .isUsedForLandingPage(true)
                .isUsedForSitePage(true)
                .correctCname("correctCname")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isSslEnabled(true)
                .isSslOnly(true)
                .manuallyMarkedAsResolving(true)
                .primaryBlogPost(true)
                .primaryEmail(true)
                .primaryKnowledge(true)
                .primaryLandingPage(true)
                .primarySitePage(true)
                .secondaryToDomain("secondaryToDomain")
                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedDomain =
            jsonMapper.readValue(jsonMapper.writeValueAsString(domain), jacksonTypeRef<Domain>())

        assertThat(roundtrippedDomain).isEqualTo(domain)
    }
}
