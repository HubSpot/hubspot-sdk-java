// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.blogs.posts

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.sdk.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.sdk.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.sdk.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.sdk.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class MultiLanguageServiceTest {

    @Test
    fun attachToLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().posts().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.attachToLangGroup(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language(AttachToLangPrimaryRequestVNext.Language.AA)
                    .primaryId("primaryId")
                    .primaryLanguage(AttachToLangPrimaryRequestVNext.PrimaryLanguage.AA)
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun createLangVariation(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().posts().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.createLangVariation(
                BlogPostLanguageCloneRequestVNext.builder().id("id").language("language").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun detachFromLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().posts().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setLangPrimary() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val multiLanguageService = client.cms().blogs().posts().multiLanguage()

        multiLanguageService.setLangPrimary(
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
        )
    }

    @Test
    fun updateLangs(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().posts().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.updateLangs(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("aa"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }
}
