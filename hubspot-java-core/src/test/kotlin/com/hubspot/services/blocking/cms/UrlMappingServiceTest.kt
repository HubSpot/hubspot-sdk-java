// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.cms.urlmappings.UrlMappingsUrlMapping
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class UrlMappingServiceTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlMappingService = client.cms().urlMappings()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMapping =
            urlMappingService.create(
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

        assertThat(urlMapping.body()).hasContent("abc")
    }

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlMappingService = client.cms().urlMappings()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMappings = urlMappingService.list()

        assertThat(urlMappings.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val urlMappingService = client.cms().urlMappings()

        urlMappingService.delete(0L)
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val urlMappingService = client.cms().urlMappings()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val urlMapping = urlMappingService.get(0L)

        assertThat(urlMapping.body()).hasContent("abc")
    }
}
