// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectGetResponseTest {

    @Test
    fun create() {
        val urlRedirectGetResponse =
            UrlRedirectGetResponse.builder()
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

        assertThat(urlRedirectGetResponse.id()).isEqualTo("id")
        assertThat(urlRedirectGetResponse.destination()).isEqualTo("destination")
        assertThat(urlRedirectGetResponse.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.isMatchQueryString()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.isPattern()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlRedirectGetResponse.precedence()).isEqualTo(0)
        assertThat(urlRedirectGetResponse.redirectStyle()).isEqualTo(0)
        assertThat(urlRedirectGetResponse.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlRedirectGetResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(urlRedirectGetResponse.updated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlRedirectGetResponse =
            UrlRedirectGetResponse.builder()
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

        val roundtrippedUrlRedirectGetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlRedirectGetResponse),
                jacksonTypeRef<UrlRedirectGetResponse>(),
            )

        assertThat(roundtrippedUrlRedirectGetResponse).isEqualTo(urlRedirectGetResponse)
    }
}
