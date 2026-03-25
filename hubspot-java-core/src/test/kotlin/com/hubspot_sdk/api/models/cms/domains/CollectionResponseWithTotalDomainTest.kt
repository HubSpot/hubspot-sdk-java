// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.domains

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.models.PreviousPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalDomainTest {

    @Test
    fun create() {
        val collectionResponseWithTotalDomain =
            CollectionResponseWithTotalDomain.builder()
                .addResult(
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
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalDomain.results())
            .containsExactly(
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
            )
        assertThat(collectionResponseWithTotalDomain.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalDomain.paging())
            .contains(
                Paging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .prev(PreviousPage.builder().before("before").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalDomain =
            CollectionResponseWithTotalDomain.builder()
                .addResult(
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
                )
                .total(0)
                .paging(
                    Paging.builder()
                        .next(NextPage.builder().after("after").link("link").build())
                        .prev(PreviousPage.builder().before("before").link("link").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalDomain =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalDomain),
                jacksonTypeRef<CollectionResponseWithTotalDomain>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalDomain)
            .isEqualTo(collectionResponseWithTotalDomain)
    }
}
