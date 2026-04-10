// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.patch
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetCursorParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetPostsCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetPostsCursorParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetTagsCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetTagsCursorParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class AuthorServiceTest {

    @Test
    fun create(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val author =
            authorService.create(
                BlogAuthor.builder()
                    .id("id")
                    .avatar("avatar")
                    .bio("bio")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("displayName")
                    .email("email")
                    .facebook("facebook")
                    .fullName("fullName")
                    .language(BlogAuthor.Language.AA)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )

        assertThat(author.body()).hasContent("abc")
    }

    @Test
    fun update(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(patch(anyUrl()).willReturn(ok().withBody("abc")))

        val author =
            authorService.update(
                AuthorUpdateParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .blogAuthor(
                        BlogAuthor.builder()
                            .id("id")
                            .avatar("avatar")
                            .bio("bio")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .displayName("displayName")
                            .email("email")
                            .facebook("facebook")
                            .fullName("fullName")
                            .language(BlogAuthor.Language.AA)
                            .linkedin("linkedin")
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .twitter("twitter")
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .website("website")
                            .build()
                    )
                    .build()
            )

        assertThat(author.body()).hasContent("abc")
    }

    @Test
    fun list(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val authors =
            authorService.list(
                AuthorListParams.builder()
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

        assertThat(authors.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val authorService = client.cms().blogs().authors()

        authorService.delete(
            AuthorDeleteParams.builder().objectId("objectId").archived(true).build()
        )
    }

    @Test
    fun attachToLangGroup(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.attachToLangGroup(
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
    fun createLanguageVariation(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.createLanguageVariation(
                BlogAuthorCloneRequestVNext.builder()
                    .id("id")
                    .blogAuthor(
                        BlogAuthor.builder()
                            .id("id")
                            .avatar("avatar")
                            .bio("bio")
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .displayName("displayName")
                            .email("email")
                            .facebook("facebook")
                            .fullName("fullName")
                            .language(BlogAuthor.Language.AA)
                            .linkedin("linkedin")
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .twitter("twitter")
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .website("website")
                            .build()
                    )
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
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
        val authorService = client.cms().blogs().authors()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun get(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val author =
            authorService.get(
                AuthorGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        assertThat(author.body()).hasContent("abc")
    }

    @Test
    fun getCursor(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getCursor(
                AuthorGetCursorParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getCursorByQuery(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getCursorByQuery(
                AuthorGetCursorByQueryParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getPostsCursor(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getPostsCursor(
                AuthorGetPostsCursorParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getPostsCursorByQuery(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getPostsCursorByQuery(
                AuthorGetPostsCursorByQueryParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getTagsCursor(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getTagsCursor(
                AuthorGetTagsCursorParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun getTagsCursorByQuery(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
                .build()
        val authorService = client.cms().blogs().authors()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.getTagsCursorByQuery(
                AuthorGetTagsCursorByQueryParams.builder()
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

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val authorService = client.cms().blogs().authors()

        authorService.setNewLangPrimary(
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
        val authorService = client.cms().blogs().authors()
        stubFor(post(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            authorService.updateLanguages(
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
