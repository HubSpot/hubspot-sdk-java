// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeExtractAsyncParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeValidateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SourceCodeServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val sourceCodeFuture =
            sourceCodeServiceAsync.create(
                SourceCodeCreateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        val sourceCode = sourceCodeFuture.get()
        sourceCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val future =
            sourceCodeServiceAsync.delete(
                SourceCodeDeleteParams.builder().environment("environment").path("path").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun extractAsync() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val taskLocatorFuture =
            sourceCodeServiceAsync.extractAsync(
                SourceCodeExtractAsyncParams.builder().path("path").build()
            )

        val taskLocator = taskLocatorFuture.get()
        taskLocator.validate()
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val sourceCodeFuture =
            sourceCodeServiceAsync.get(
                SourceCodeGetParams.builder().environment("environment").path("path").build()
            )

        val sourceCode = sourceCodeFuture.get()
        assertThat(sourceCode.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getExtractionStatus() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val actionResponseFuture = sourceCodeServiceAsync.getExtractionStatus(0)

        val actionResponse = actionResponseFuture.get()
        actionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getMetadata() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val responseFuture =
            sourceCodeServiceAsync.getMetadata(
                SourceCodeGetMetadataParams.builder()
                    .environment("environment")
                    .path("path")
                    .properties("properties")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upsert() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val responseFuture =
            sourceCodeServiceAsync.upsert(
                SourceCodeUpsertParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun validate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            sourceCodeServiceAsync.validate(
                SourceCodeValidateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
