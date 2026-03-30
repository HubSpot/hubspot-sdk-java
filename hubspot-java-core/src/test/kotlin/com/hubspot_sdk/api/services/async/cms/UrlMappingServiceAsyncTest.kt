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
import com.hubspot_sdk.api.models.cms.urlmappings.UrlMappingsUrlMapping
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
                UrlMappingsUrlMapping.builder()
                    .id(0L)
                    .cdnPurgeEmbargoTime(0L)
                    .contentGroupId(0L)
                    .cosObjectType(UrlMappingsUrlMapping.CosObjectType.ACCESS_GROUP_MEMBERSHIP)
                    .created(0L)
                    .createdById(0)
                    .deletedAt(0L)
                    .destination("destination")
                    .internallyCreated(true)
                    .isActive(true)
                    .isMatchFullUrl(true)
                    .isMatchQueryString(true)
                    .isOnlyAfterNotFound(true)
                    .isPattern(true)
                    .isProtocolAgnostic(true)
                    .isRegex(true)
                    .isTrailingSlashOptional(true)
                    .label("label")
                    .name("name")
                    .note("note")
                    .portalId(0)
                    .precedence(0)
                    .redirectStyle(0)
                    .routePrefix("routePrefix")
                    .updated(0L)
                    .updatedById(0)
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
