// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.settings.BlogLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SettingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val pageFuture = settingServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun attachToLangGroup() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val future =
            settingServiceAsync.attachToLangGroup(
                AttachToLangPrimaryRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryId("primaryId")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createLanguageVariation() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val blogFuture =
            settingServiceAsync.createLanguageVariation(
                BlogLanguageCloneRequestVNext.builder()
                    .id("id")
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .slug("slug")
                    .build()
            )

        val blog = blogFuture.get()
        blog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun detachFromLangGroup() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val future =
            settingServiceAsync.detachFromLangGroup(
                DetachFromLangGroupRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val blogFuture = settingServiceAsync.get("blogId")

        val blog = blogFuture.get()
        blog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getRevision() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val versionBlogFuture =
            settingServiceAsync.getRevision(
                SettingGetRevisionParams.builder().blogId("blogId").revisionId("revisionId").build()
            )

        val versionBlog = versionBlogFuture.get()
        versionBlog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRevisions() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val collectionResponseWithTotalVersionBlogFuture =
            settingServiceAsync.listRevisions(
                SettingListRevisionsParams.builder()
                    .blogId("blogId")
                    .after("after")
                    .before("before")
                    .limit(0)
                    .build()
            )

        val collectionResponseWithTotalVersionBlog =
            collectionResponseWithTotalVersionBlogFuture.get()
        collectionResponseWithTotalVersionBlog.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val future =
            settingServiceAsync.setNewLangPrimary(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLanguages() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val settingServiceAsync = client.cms().blogs().settings()

        val future =
            settingServiceAsync.updateLanguages(
                UpdateLanguagesRequestVNext.builder()
                    .languages(
                        UpdateLanguagesRequestVNext.Languages.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .primaryId("primaryId")
                    .build()
            )

        val response = future.get()
    }
}
