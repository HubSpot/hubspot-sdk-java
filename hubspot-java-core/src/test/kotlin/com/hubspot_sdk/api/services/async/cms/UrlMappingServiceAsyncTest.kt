// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.urlredirects.UrlMapping
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class UrlMappingServiceAsyncTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val urlMappingServiceAsync = client.cms().urlMappings()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMappingFuture =
            urlMappingServiceAsync.create(
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

        val urlMapping = urlMappingFuture.get()
        assertThat(urlMapping.body()).hasContent("abc")
    }

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val urlMappingServiceAsync = client.cms().urlMappings()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMappingsFuture = urlMappingServiceAsync.list()

        val urlMappings = urlMappingsFuture.get()
        assertThat(urlMappings.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val urlMappingServiceAsync = client.cms().urlMappings()

        val future = urlMappingServiceAsync.delete(0L)

        val response = future.get()
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val urlMappingServiceAsync = client.cms().urlMappings()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMappingFuture = urlMappingServiceAsync.get(0L)

        val urlMapping = urlMappingFuture.get()
        assertThat(urlMapping.body()).hasContent("abc")
    }
}
