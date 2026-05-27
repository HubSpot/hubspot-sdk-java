// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectCreateUrlMappingParamsTest {

    @Test
    fun create() {
        UrlRedirectCreateUrlMappingParams.builder()
            .urlMapping(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            UrlRedirectCreateUrlMappingParams.builder()
                .urlMapping(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }
}
