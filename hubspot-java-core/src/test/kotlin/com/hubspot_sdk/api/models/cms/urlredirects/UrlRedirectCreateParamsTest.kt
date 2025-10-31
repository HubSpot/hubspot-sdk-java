// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.urlredirects

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlRedirectCreateParamsTest {

    @Test
    fun create() {
        UrlRedirectCreateParams.builder()
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
    }

    @Test
    fun body() {
        val params =
            UrlRedirectCreateParams.builder()
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

        val body = params._body()

        assertThat(body.destination()).isEqualTo("destination")
        assertThat(body.redirectStyle()).isEqualTo(0)
        assertThat(body.routePrefix()).isEqualTo("routePrefix")
        assertThat(body.isMatchFullUrl()).contains(true)
        assertThat(body.isMatchQueryString()).contains(true)
        assertThat(body.isOnlyAfterNotFound()).contains(true)
        assertThat(body.isPattern()).contains(true)
        assertThat(body.isProtocolAgnostic()).contains(true)
        assertThat(body.isTrailingSlashOptional()).contains(true)
        assertThat(body.precedence()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UrlRedirectCreateParams.builder()
                .destination("destination")
                .redirectStyle(0)
                .routePrefix("routePrefix")
                .build()

        val body = params._body()

        assertThat(body.destination()).isEqualTo("destination")
        assertThat(body.redirectStyle()).isEqualTo(0)
        assertThat(body.routePrefix()).isEqualTo("routePrefix")
    }
}
