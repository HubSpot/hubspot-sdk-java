// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.patch
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.blogs.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.blogs.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchInputTag
import com.hubspot_sdk.api.models.cms.blogs.tags.Tag
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TagServiceAsyncTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val tagFuture =
            tagServiceAsync.create(
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

        val tag = tagFuture.get()
        assertThat(tag.body()).hasContent("abc")
    }

    @Test
    fun update(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(patch(anyUrl()).willReturn(ok().withBody("abc")))

        val tagFuture =
            tagServiceAsync.update(
                TagUpdateParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .tag(
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

        val tag = tagFuture.get()
        assertThat(tag.body()).hasContent("abc")
    }

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val tagsFuture =
            tagServiceAsync.list(
                TagListParams.builder()
                    .after("after")
                    .archived(true)
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(0)
                    .property("property")
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val tags = tagsFuture.get()
        assertThat(tags.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val tagServiceAsync = client.cms().blogs().tags()

        val future =
            tagServiceAsync.delete(
                TagDeleteParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Test
    fun attachToLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.attachToLangGroup(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language(AttachToLangPrimaryRequestVNext.Language.AA)
                    .primaryId("primaryId")
                    .primaryLanguage(AttachToLangPrimaryRequestVNext.PrimaryLanguage.AA)
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun createBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.createBatch(
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

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun createLangVariation(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.createLangVariation(
                TagCloneRequestVNext.builder()
                    .id("id")
                    .name("name")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val tagServiceAsync = client.cms().blogs().tags()

        val future =
            tagServiceAsync.deleteBatch(BatchInputString.builder().addInput("string").build())

        val response = future.get()
    }

    @Test
    fun detachFromLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val tagFuture =
            tagServiceAsync.get(
                TagGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        val tag = tagFuture.get()
        assertThat(tag.body()).hasContent("abc")
    }

    @Test
    fun getBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.getBatch(
                TagGetBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setLangPrimary() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val tagServiceAsync = client.cms().blogs().tags()

        val future =
            tagServiceAsync.setLangPrimary(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Test
    fun updateBatch(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.updateBatch(
                TagUpdateBatchParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun updateLangs(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tagServiceAsync = client.cms().blogs().tags()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tagServiceAsync.updateLangs(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("aa"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }
}
