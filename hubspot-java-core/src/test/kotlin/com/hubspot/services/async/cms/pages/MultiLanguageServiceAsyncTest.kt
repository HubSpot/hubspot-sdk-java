// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.core.JsonValue
import com.hubspot.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.models.cms.pages.ContentLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MultiLanguageServiceAsyncTest {

    @Test
    fun attachToLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageServiceAsync = client.cms().pages().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            multiLanguageServiceAsync.attachToLangGroup(
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLanguageVariation() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val multiLanguageServiceAsync = client.cms().pages().multiLanguage()

        val pageDataFuture =
            multiLanguageServiceAsync.createLanguageVariation(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Test
    fun detachFromLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageServiceAsync = client.cms().pages().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            multiLanguageServiceAsync.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val multiLanguageServiceAsync = client.cms().pages().multiLanguage()

        val future =
            multiLanguageServiceAsync.setNewLangPrimary(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Test
    fun updateLanguages(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageServiceAsync = client.cms().pages().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            multiLanguageServiceAsync.updateLanguages(
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
