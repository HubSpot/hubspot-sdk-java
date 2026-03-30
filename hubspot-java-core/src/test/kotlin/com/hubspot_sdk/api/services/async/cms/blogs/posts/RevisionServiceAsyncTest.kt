// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs.posts

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class RevisionServiceAsyncTest {

    @Test
    fun getPreviousVersion(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val revisionServiceAsync = client.cms().blogs().posts().revisions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            revisionServiceAsync.getPreviousVersion(
                RevisionGetPreviousVersionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getPreviousVersions(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val revisionServiceAsync = client.cms().blogs().posts().revisions()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            revisionServiceAsync.getPreviousVersions(
                RevisionGetPreviousVersionsParams.builder()
                    .objectId("objectId")
                    .after("after")
                    .before("before")
                    .limit(0)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun restorePreviousVersion(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val revisionServiceAsync = client.cms().blogs().posts().revisions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            revisionServiceAsync.restorePreviousVersion(
                RevisionRestorePreviousVersionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun restorePreviousVersionToDraft(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val revisionServiceAsync = client.cms().blogs().posts().revisions()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            revisionServiceAsync.restorePreviousVersionToDraft(
                RevisionRestorePreviousVersionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
