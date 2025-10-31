// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchInputBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AuthorServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val blogAuthorFuture =
            authorServiceAsync.create(
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
                    .language(BlogAuthor.Language.AF)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )

        val blogAuthor = blogAuthorFuture.get()
        blogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val blogAuthorFuture =
            authorServiceAsync.update(
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
                            .language(BlogAuthor.Language.AF)
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

        val blogAuthor = blogAuthorFuture.get()
        blogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val pageFuture = authorServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.delete(
                AuthorDeleteParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun attachToLangGroup() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.attachToLangGroup(
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
    fun createBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val batchResponseBlogAuthorFuture =
            authorServiceAsync.createBatch(
                BatchInputBlogAuthor.builder()
                    .addInput(
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
                            .language(BlogAuthor.Language.AF)
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

        val batchResponseBlogAuthor = batchResponseBlogAuthorFuture.get()
        batchResponseBlogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createLanguageVariation() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val blogAuthorFuture =
            authorServiceAsync.createLanguageVariation(
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
                            .language(BlogAuthor.Language.AF)
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

        val blogAuthor = blogAuthorFuture.get()
        blogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.deleteBatch(BatchInputString.builder().addInput("string").build())

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun detachFromLangGroup() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.detachFromLangGroup(
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val blogAuthorFuture =
            authorServiceAsync.get(
                AuthorGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        val blogAuthor = blogAuthorFuture.get()
        blogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val batchResponseBlogAuthorFuture =
            authorServiceAsync.getBatch(
                AuthorGetBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseBlogAuthor = batchResponseBlogAuthorFuture.get()
        batchResponseBlogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun setNewLangPrimary() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.setNewLangPrimary(
                SetNewLanguagePrimaryRequestVNext.builder().id("id").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val batchResponseBlogAuthorFuture =
            authorServiceAsync.updateBatch(
                AuthorUpdateBatchParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val batchResponseBlogAuthor = batchResponseBlogAuthorFuture.get()
        batchResponseBlogAuthor.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateLanguages() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val authorServiceAsync = client.cms().blogs().authors()

        val future =
            authorServiceAsync.updateLanguages(
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
