// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs.posts

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class RevisionServiceTest {

    @Test
    fun getPreviousVersion(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val revisionService = client.cms().blogs().posts().revisions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            revisionService.getPreviousVersion(
                RevisionGetPreviousVersionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getPreviousVersions(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val revisionService = client.cms().blogs().posts().revisions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            revisionService.getPreviousVersions(
                RevisionGetPreviousVersionsParams.builder()
                    .objectId("objectId")
                    .after("after")
                    .before("before")
                    .limit(0)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun restorePreviousVersion(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val revisionService = client.cms().blogs().posts().revisions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            revisionService.restorePreviousVersion(
                RevisionRestorePreviousVersionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun restorePreviousVersionToDraft(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val revisionService = client.cms().blogs().posts().revisions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            revisionService.restorePreviousVersionToDraft(
                RevisionRestorePreviousVersionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
