// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectUpdateResponseTest {

    @Test
    fun create() {
        val urlRedirectUpdateResponse =
            UrlRedirectUpdateResponse.builder()
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

        assertThat(urlRedirectUpdateResponse.id()).isEqualTo("id")
        assertThat(urlRedirectUpdateResponse.destination()).isEqualTo("destination")
        assertThat(urlRedirectUpdateResponse.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.isMatchQueryString()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.isPattern()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlRedirectUpdateResponse.precedence()).isEqualTo(0)
        assertThat(urlRedirectUpdateResponse.redirectStyle()).isEqualTo(0)
        assertThat(urlRedirectUpdateResponse.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlRedirectUpdateResponse.created())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(urlRedirectUpdateResponse.updated())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlRedirectUpdateResponse =
            UrlRedirectUpdateResponse.builder()
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

        val roundtrippedUrlRedirectUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlRedirectUpdateResponse),
                jacksonTypeRef<UrlRedirectUpdateResponse>(),
            )

        assertThat(roundtrippedUrlRedirectUpdateResponse).isEqualTo(urlRedirectUpdateResponse)
    }
}
