// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
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

        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.results())
            .containsExactly(
                UrlMapping.builder()
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
        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalUrlMappingForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
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

        val roundtrippedCollectionResponseWithTotalUrlMappingForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalUrlMappingForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalUrlMappingForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalUrlMappingForwardPaging)
            .isEqualTo(collectionResponseWithTotalUrlMappingForwardPaging)
    }
}
