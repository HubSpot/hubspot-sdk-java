// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.urlredirects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectCreateParamsTest {

    @Test
    fun create() {
        UrlRedirectCreateParams.builder()
            .urlMappingCreateRequestBody(
                UrlMappingCreateRequestBody.builder()
                    .destination("destination")
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isTrailingSlashOptional(true)
                    .precedence(0)
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            UrlRedirectCreateParams.builder()
                .urlMappingCreateRequestBody(
                    UrlMappingCreateRequestBody.builder()
                        .destination("destination")
                        .redirectStyle(0)
                        .routePrefix("routePrefix")
                        .isMatchFullUrl(true)
                        .isMatchQueryString(true)
                        .isOnlyAfterNotFound(true)
                        .isPattern(true)
                        .isProtocolAgnostic(true)
                        .isTrailingSlashOptional(true)
                        .precedence(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UrlMappingCreateRequestBody.builder()
                    .destination("destination")
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isTrailingSlashOptional(true)
                    .precedence(0)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UrlRedirectCreateParams.builder()
                .urlMappingCreateRequestBody(
                    UrlMappingCreateRequestBody.builder()
                        .destination("destination")
                        .redirectStyle(0)
                        .routePrefix("routePrefix")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UrlMappingCreateRequestBody.builder()
                    .destination("destination")
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .build()
            )
    }
}
