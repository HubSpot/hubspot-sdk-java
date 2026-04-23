// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageVersionFuture =
            pageServiceAsync.getLandingPageRevision(
                PageGetLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageVersion = pageVersionFuture.get()
        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageVersionFuture =
            pageServiceAsync.getSitePageRevision(
                PageGetSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageVersion = pageVersionFuture.get()
        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLandingPageRevisions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageFuture = pageServiceAsync.listLandingPageRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSitePageRevisions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageFuture = pageServiceAsync.listSitePageRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetSitePageDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val future = pageServiceAsync.resetSitePageDraft("objectId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageDataFuture =
            pageServiceAsync.restoreLandingPageRevision(
                PageRestoreLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevisionToDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageDataFuture =
            pageServiceAsync.restoreLandingPageRevisionToDraft(
                PageRestoreLandingPageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageDataFuture =
            pageServiceAsync.restoreSitePageRevision(
                PageRestoreSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevisionToDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val pageDataFuture =
            pageServiceAsync.restoreSitePageRevisionToDraft(
                PageRestoreSitePageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val pageData = pageDataFuture.get()
        pageData.validate()
    }
}
