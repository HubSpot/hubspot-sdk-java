// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs.tags

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.BatchInputJsonNode
import com.hubspot.models.cms.blogs.tags.BatchInputTag
import com.hubspot.models.cms.blogs.tags.Tag
import com.hubspot.models.cms.blogs.tags.batch.BatchGetBatchParams
import com.hubspot.models.cms.blogs.tags.batch.BatchUpdateBatchParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class BatchServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val batchService = client.cms().blogs().tags().batch()

        batchService.delete(BatchInputString.builder().addInput("string").build())
    }

    @Test
    fun createBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val batchService = client.cms().blogs().tags().batch()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            batchService.createBatch(
                BatchInputTag.builder()
                    .addInput(
                        Tag.builder()
                            .id("id")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .language(Tag.Language.AA)
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val batchService = client.cms().blogs().tags().batch()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            batchService.getBatch(
                BatchGetBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun updateBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val batchService = client.cms().blogs().tags().batch()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            batchService.updateBatch(
                BatchUpdateBatchParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
