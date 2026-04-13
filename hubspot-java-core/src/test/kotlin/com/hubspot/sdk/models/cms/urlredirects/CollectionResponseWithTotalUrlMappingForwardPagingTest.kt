// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import com.hubspot.sdk.models.ForwardPaging
import com.hubspot.sdk.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalUrlMappingForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalUrlMappingForwardPaging =
            CollectionResponseWithTotalUrlMappingForwardPaging.builder()
                .addResult(
                    UrlMapping.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.results())
            .containsExactly(
                UrlMapping.builder()
                    .id("id")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.paging())
            .contains(
                ForwardPaging.builder()
                    .next(NextPage.builder().after("after").link("link").build())
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalUrlMappingForwardPaging =
            CollectionResponseWithTotalUrlMappingForwardPaging.builder()
                .addResult(
                    UrlMapping.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
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

        val roundtrippedCollectionResponseWithTotalUrlMappingForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalUrlMappingForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalUrlMappingForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalUrlMappingForwardPaging)
            .isEqualTo(collectionResponseWithTotalUrlMappingForwardPaging)
    }
}
