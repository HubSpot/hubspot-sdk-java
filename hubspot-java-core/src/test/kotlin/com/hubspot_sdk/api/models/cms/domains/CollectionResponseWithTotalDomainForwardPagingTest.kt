// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalDomainForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalDomainForwardPaging =
            CollectionResponseWithTotalDomainForwardPaging.builder()
                .addResult(
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
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalDomainForwardPaging.results())
            .containsExactly(
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
            )
        assertThat(collectionResponseWithTotalDomainForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalDomainForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalDomainForwardPaging =
            CollectionResponseWithTotalDomainForwardPaging.builder()
                .addResult(
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
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalDomainForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalDomainForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalDomainForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalDomainForwardPaging)
            .isEqualTo(collectionResponseWithTotalDomainForwardPaging)
    }
}
