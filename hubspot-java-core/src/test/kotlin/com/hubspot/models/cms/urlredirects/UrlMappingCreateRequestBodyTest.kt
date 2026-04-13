// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.urlredirects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UrlMappingCreateRequestBodyTest {

    @Test
    fun create() {
        val urlMappingCreateRequestBody =
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

        assertThat(urlMappingCreateRequestBody.destination()).isEqualTo("destination")
        assertThat(urlMappingCreateRequestBody.redirectStyle()).isEqualTo(0)
        assertThat(urlMappingCreateRequestBody.routePrefix()).isEqualTo("routePrefix")
        assertThat(urlMappingCreateRequestBody.isMatchFullUrl()).contains(true)
        assertThat(urlMappingCreateRequestBody.isMatchQueryString()).contains(true)
        assertThat(urlMappingCreateRequestBody.isOnlyAfterNotFound()).contains(true)
        assertThat(urlMappingCreateRequestBody.isPattern()).contains(true)
        assertThat(urlMappingCreateRequestBody.isProtocolAgnostic()).contains(true)
        assertThat(urlMappingCreateRequestBody.isTrailingSlashOptional()).contains(true)
        assertThat(urlMappingCreateRequestBody.precedence()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val urlMappingCreateRequestBody =
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

        val roundtrippedUrlMappingCreateRequestBody =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(urlMappingCreateRequestBody),
                jacksonTypeRef<UrlMappingCreateRequestBody>(),
            )

        assertThat(roundtrippedUrlMappingCreateRequestBody).isEqualTo(urlMappingCreateRequestBody)
    }
}
