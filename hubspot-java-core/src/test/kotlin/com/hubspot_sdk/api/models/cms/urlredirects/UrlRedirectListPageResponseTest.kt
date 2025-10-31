// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectListPageResponseTest {

    @Test
    fun create() {
        val urlRedirectListPageResponse =
            UrlRedirectListPageResponse.builder()
                .addResult(
                    UrlRedirectListResponse.builder()
                        .id("id")
                        .destination("destination")
                        .isMatchFullUrl(true)
                        .isMatchQueryString(true)
                        .isOnlyAfterNotFound(true)
                        .isPattern(true)
                        .isProtocolAgnostic(true)
                        .isTrailingSlashOptional(true)
                        .precedence(0)
                        .redirectStyle(0)
                        .routePrefix("routePrefix")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(urlRedirectListPageResponse.results())
            .containsExactly(
                UrlRedirectListResponse.builder()
                    .id("id")
                    .destination("destination")
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isTrailingSlashOptional(true)
                    .precedence(0)
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(urlRedirectListPageResponse.total()).isEqualTo(0)
        assertThat(urlRedirectListPageResponse.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlRedirectListPageResponse =
            UrlRedirectListPageResponse.builder()
                .addResult(
                    UrlRedirectListResponse.builder()
                        .id("id")
                        .destination("destination")
                        .isMatchFullUrl(true)
                        .isMatchQueryString(true)
                        .isOnlyAfterNotFound(true)
                        .isPattern(true)
                        .isProtocolAgnostic(true)
                        .isTrailingSlashOptional(true)
                        .precedence(0)
                        .redirectStyle(0)
                        .routePrefix("routePrefix")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedUrlRedirectListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlRedirectListPageResponse),
                jacksonTypeRef<UrlRedirectListPageResponse>(),
            )

        assertThat(roundtrippedUrlRedirectListPageResponse).isEqualTo(urlRedirectListPageResponse)
    }
}
