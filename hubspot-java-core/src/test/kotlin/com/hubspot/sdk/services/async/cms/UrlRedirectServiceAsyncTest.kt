// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.urlredirects.UrlMapping
import com.hubspot.sdk.models.cms.urlredirects.UrlMappingCreateRequestBody
import com.hubspot.sdk.models.cms.urlredirects.UrlRedirectUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
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

    @Test
    fun createUrlMapping(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            urlRedirectServiceAsync.createUrlMapping(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteUrlMapping() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()

        val future = urlRedirectServiceAsync.deleteUrlMapping(0L)

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

    @Test
    fun getUrlMapping(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = urlRedirectServiceAsync.getUrlMapping(0L)

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun listUrlMappings(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectServiceAsync = client.cms().urlRedirects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture = urlRedirectServiceAsync.listUrlMappings()

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
