// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.sitepages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().sitePages().revisions()

        val pageVersionFuture =
            revisionServiceAsync.getSitePageRevision(
                RevisionGetSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageVersion = pageVersionFuture.get()
        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSitePageRevisions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().sitePages().revisions()

        val pageFuture = revisionServiceAsync.listSitePageRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().sitePages().revisions()

        val pagesPageFuture =
            revisionServiceAsync.restoreSitePageRevision(
                RevisionRestoreSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pagesPage = pagesPageFuture.get()
        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevisionToDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().sitePages().revisions()

        val pagesPageFuture =
            revisionServiceAsync.restoreSitePageRevisionToDraft(
                RevisionRestoreSitePageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val pagesPage = pagesPageFuture.get()
        pagesPage.validate()
    }
}
