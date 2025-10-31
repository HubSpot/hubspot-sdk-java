// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectListResponseTest {

    @Test
    fun create() {
        val urlRedirectListResponse =
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

        assertThat(urlRedirectListResponse.id()).isEqualTo("id")
        assertThat(urlRedirectListResponse.destination()).isEqualTo("destination")
        assertThat(urlRedirectListResponse.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlRedirectListResponse.isMatchQueryString()).isEqualTo(true)
        assertThat(urlRedirectListResponse.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlRedirectListResponse.isPattern()).isEqualTo(true)
        assertThat(urlRedirectListResponse.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlRedirectListResponse.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlRedirectListResponse.precedence()).isEqualTo(0)
        assertThat(urlRedirectListResponse.redirectStyle()).isEqualTo(0)
        assertThat(urlRedirectListResponse.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlRedirectListResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(urlRedirectListResponse.updated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlRedirectListResponse =
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

        val roundtrippedUrlRedirectListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlRedirectListResponse),
                jacksonTypeRef<UrlRedirectListResponse>(),
            )

        assertThat(roundtrippedUrlRedirectListResponse).isEqualTo(urlRedirectListResponse)
    }
}
