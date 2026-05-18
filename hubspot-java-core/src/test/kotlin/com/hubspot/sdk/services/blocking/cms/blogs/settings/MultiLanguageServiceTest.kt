// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.blogs.settings

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
import com.hubspot.sdk.models.cms.blogs.settings.BlogLanguageCloneRequestVNext
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
        val multiLanguageService = client.cms().blogs().settings().multiLanguage()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun createLanguageVariation() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val multiLanguageService = client.cms().blogs().settings().multiLanguage()

        val blog =
            multiLanguageService.createLanguageVariation(
                BlogLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .slug("slug")
                    .usePublished(true)
                    .build()
            )

        blog.validate()
    }

    @Test
    fun detachFromLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().settings().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val multiLanguageService = client.cms().blogs().settings().multiLanguage()

        multiLanguageService.setNewLangPrimary(
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
        )
    }

    @Test
    fun updateLanguages(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().blogs().settings().multiLanguage()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            multiLanguageService.updateLanguages(
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
