// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectCreateResponseTest {

    @Test
    fun create() {
        val urlRedirectCreateResponse =
            UrlRedirectCreateResponse.builder()
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

        assertThat(urlRedirectCreateResponse.id()).isEqualTo("id")
        assertThat(urlRedirectCreateResponse.destination()).isEqualTo("destination")
        assertThat(urlRedirectCreateResponse.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.isMatchQueryString()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.isPattern()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlRedirectCreateResponse.precedence()).isEqualTo(0)
        assertThat(urlRedirectCreateResponse.redirectStyle()).isEqualTo(0)
        assertThat(urlRedirectCreateResponse.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlRedirectCreateResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(urlRedirectCreateResponse.updated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlRedirectCreateResponse =
            UrlRedirectCreateResponse.builder()
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

        val roundtrippedUrlRedirectCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlRedirectCreateResponse),
                jacksonTypeRef<UrlRedirectCreateResponse>(),
            )

        assertThat(roundtrippedUrlRedirectCreateResponse).isEqualTo(urlRedirectCreateResponse)
    }
}
