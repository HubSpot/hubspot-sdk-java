// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.cms.urlredirects.UrlMapping
import com.hubspot.models.cms.urlredirects.UrlMappingCreateRequestBody
import com.hubspot.models.cms.urlredirects.UrlRedirectUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UrlRedirectServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val urlMappingFuture =
            urlRedirectServiceAsync.create(
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

        val urlMapping = urlMappingFuture.get()
        urlMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val urlMappingFuture =
            urlRedirectServiceAsync.update(
                UrlRedirectUpdateParams.builder()
                    .urlRedirectId("urlRedirectId")
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
            )

        val urlMapping = urlMappingFuture.get()
        urlMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val pageFuture = urlRedirectServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val future = urlRedirectServiceAsync.delete("urlRedirectId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val urlMappingFuture = urlRedirectServiceAsync.get("urlRedirectId")

        val urlMapping = urlMappingFuture.get()
        urlMapping.validate()
    }
}
