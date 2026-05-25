// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
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
internal class UrlRedirectServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping =
            urlRedirectService.create(
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

        urlMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping =
            urlRedirectService.update(
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

        urlMapping.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        val page = urlRedirectService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        urlRedirectService.delete("urlRedirectId")
    }

    @Test
    fun createUrlMapping(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectService = client.cms().urlRedirects()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            urlRedirectService.createUrlMapping(
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

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteUrlMapping() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        urlRedirectService.deleteUrlMapping(0L)
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlRedirectService = client.cms().urlRedirects()

        val urlMapping = urlRedirectService.get("urlRedirectId")

        urlMapping.validate()
    }

    @Test
    fun getUrlMapping(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectService = client.cms().urlRedirects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = urlRedirectService.getUrlMapping(0L)

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun listUrlMappings(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlRedirectService = client.cms().urlRedirects()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response = urlRedirectService.listUrlMappings()

        assertThat(response.body()).hasContent("abc")
    }
}
