// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectUpdateParamsTest {

    @Test
    fun create() {
        UrlRedirectUpdateParams.builder()
            .urlRedirectId("urlRedirectId")
            .urlMapping(
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
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UrlRedirectUpdateParams.builder()
                .urlRedirectId("urlRedirectId")
                .urlMapping(
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
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("urlRedirectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UrlRedirectUpdateParams.builder()
                .urlRedirectId("urlRedirectId")
                .urlMapping(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UrlRedirectUpdateParams.builder()
                .urlRedirectId("urlRedirectId")
                .urlMapping(
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
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .build()
            )
    }
}
