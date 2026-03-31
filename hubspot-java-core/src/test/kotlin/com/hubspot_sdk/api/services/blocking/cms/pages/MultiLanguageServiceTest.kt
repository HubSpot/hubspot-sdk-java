// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
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
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().pages().multiLanguage()
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
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val multiLanguageService = client.cms().pages().multiLanguage()

        val page =
            multiLanguageService.createLanguageVariation(
                ContentLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )

        page.validate()
    }

    @Test
    fun detachFromLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().pages().multiLanguage()
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
        val client = HubspotOkHttpClient.builder().accessToken("My Access Token").build()
        val multiLanguageService = client.cms().pages().multiLanguage()

        multiLanguageService.setNewLangPrimary(
            SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
        )
    }

    @Test
    fun updateLanguages(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val multiLanguageService = client.cms().pages().multiLanguage()
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
