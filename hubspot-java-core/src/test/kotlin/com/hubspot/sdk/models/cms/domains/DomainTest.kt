// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.domains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DomainTest {

    @Test
    fun create() {
        val domain =
            Domain.builder()
                .id("id")
                .correctCname("correctCname")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isResolving(true)
                .isSslEnabled(true)
                .isSslOnly(true)
                .isUsedForBlogPost(true)
                .isUsedForEmail(true)
                .isUsedForKnowledge(true)
                .isUsedForLandingPage(true)
                .isUsedForSitePage(true)
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
        assertThat(domain.correctCname()).isEqualTo("correctCname")
        assertThat(domain.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(domain.domain()).isEqualTo("domain")
        assertThat(domain.isResolving()).isEqualTo(true)
        assertThat(domain.isSslEnabled()).isEqualTo(true)
        assertThat(domain.isSslOnly()).isEqualTo(true)
        assertThat(domain.isUsedForBlogPost()).isEqualTo(true)
        assertThat(domain.isUsedForEmail()).isEqualTo(true)
        assertThat(domain.isUsedForKnowledge()).isEqualTo(true)
        assertThat(domain.isUsedForLandingPage()).isEqualTo(true)
        assertThat(domain.isUsedForSitePage()).isEqualTo(true)
        assertThat(domain.manuallyMarkedAsResolving()).isEqualTo(true)
        assertThat(domain.primaryBlogPost()).isEqualTo(true)
        assertThat(domain.primaryEmail()).isEqualTo(true)
        assertThat(domain.primaryKnowledge()).isEqualTo(true)
        assertThat(domain.primaryLandingPage()).isEqualTo(true)
        assertThat(domain.primarySitePage()).isEqualTo(true)
        assertThat(domain.secondaryToDomain()).isEqualTo("secondaryToDomain")
        assertThat(domain.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val domain =
            Domain.builder()
                .id("id")
                .correctCname("correctCname")
                .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .domain("domain")
                .isResolving(true)
                .isSslEnabled(true)
                .isSslOnly(true)
                .isUsedForBlogPost(true)
                .isUsedForEmail(true)
                .isUsedForKnowledge(true)
                .isUsedForLandingPage(true)
                .isUsedForSitePage(true)
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
