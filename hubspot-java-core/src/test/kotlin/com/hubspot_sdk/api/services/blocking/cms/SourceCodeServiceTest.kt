// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class SourceCodeServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        val sourceCode =
            sourceCodeService.create(
                SourceCodeCreateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        sourceCode.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        sourceCodeService.delete(
            SourceCodeDeleteParams.builder().environment("environment").path("path").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun extractAsync() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        val taskLocator =
            sourceCodeService.extractAsync(
                SourceCodeExtractAsyncParams.builder().path("path").build()
            )

        taskLocator.validate()
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val sourceCode =
            sourceCodeService.get(
                SourceCodeGetParams.builder().environment("environment").path("path").build()
            )

        assertThat(sourceCode.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getExtractionStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        val actionResponse = sourceCodeService.getExtractionStatus(0)

        actionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getMetadata() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        val response =
            sourceCodeService.getMetadata(
                SourceCodeGetMetadataParams.builder()
                    .environment("environment")
                    .path("path")
                    .properties("properties")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upsert() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()

        val response =
            sourceCodeService.upsert(
                SourceCodeUpsertParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        response.validate()
    }

    @Test
    fun validate(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val sourceCodeService = client.cms().sourceCode()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            sourceCodeService.validate(
                SourceCodeValidateParams.builder()
                    .environment("environment")
                    .path("path")
                    .file("some content".byteInputStream())
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
