// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.sourcecode.FileExtractRequest
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeCreateParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeDeleteParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetMetadataParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeGetParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeUpsertParams
import com.hubspot_sdk.api.models.cms.sourcecode.SourceCodeValidateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class SourceCodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val assetFileMetadataFuture =
            sourceCodeServiceAsync.create(
                SourceCodeCreateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("Example data".byteInputStream())
                    .build()
            )

        val assetFileMetadata = assetFileMetadataFuture.get()
        assetFileMetadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val future =
            sourceCodeServiceAsync.delete(
                SourceCodeDeleteParams.builder().environment("environment").path("path").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun extractAsync() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val taskLocatorFuture =
            sourceCodeServiceAsync.extractAsync(FileExtractRequest.builder().path("path").build())

        val taskLocator = taskLocatorFuture.get()
        taskLocator.validate()
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getExtractionStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val actionResponseFuture = sourceCodeServiceAsync.getExtractionStatus(0)

        val actionResponse = actionResponseFuture.get()
        actionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMetadata() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val assetFileMetadataFuture =
            sourceCodeServiceAsync.getMetadata(
                SourceCodeGetMetadataParams.builder()
                    .environment("environment")
                    .path("path")
                    .properties("properties")
                    .build()
            )

        val assetFileMetadata = assetFileMetadataFuture.get()
        assetFileMetadata.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upsert() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val sourceCodeServiceAsync = client.cms().sourceCode()

        val assetFileMetadataFuture =
            sourceCodeServiceAsync.upsert(
                SourceCodeUpsertParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("Example data".byteInputStream())
                    .build()
            )

        val assetFileMetadata = assetFileMetadataFuture.get()
        assetFileMetadata.validate()
    }

    @Test
    fun validate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val sourceCodeServiceAsync = client.cms().sourceCode()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            sourceCodeServiceAsync.validate(
                SourceCodeValidateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("Example data".byteInputStream())
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
