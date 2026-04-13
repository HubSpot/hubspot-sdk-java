// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlMappingTest {

    @Test
    fun create() {
        val urlMapping =
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

        assertThat(urlMapping.id()).isEqualTo("id")
        assertThat(urlMapping.created()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(urlMapping.destination()).isEqualTo("destination")
        assertThat(urlMapping.isMatchFullUrl()).isEqualTo(true)
        assertThat(urlMapping.isMatchQueryString()).isEqualTo(true)
        assertThat(urlMapping.isOnlyAfterNotFound()).isEqualTo(true)
        assertThat(urlMapping.isPattern()).isEqualTo(true)
        assertThat(urlMapping.isProtocolAgnostic()).isEqualTo(true)
        assertThat(urlMapping.isTrailingSlashOptional()).isEqualTo(true)
        assertThat(urlMapping.precedence()).isEqualTo(0)
        assertThat(urlMapping.redirectStyle()).isEqualTo(0)
        assertThat(urlMapping.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlMapping.updated()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlMapping =
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

        val roundtrippedUrlMapping =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlMapping),
                jacksonTypeRef<UrlMapping>(),
            )

        assertThat(roundtrippedUrlMapping).isEqualTo(urlMapping)
    }
}
