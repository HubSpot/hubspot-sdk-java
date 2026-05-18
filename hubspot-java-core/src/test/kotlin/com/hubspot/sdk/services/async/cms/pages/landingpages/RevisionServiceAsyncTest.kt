// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().landingPages().revisions()

        val pageVersionFuture =
            revisionServiceAsync.getLandingPageRevision(
                RevisionGetLandingPageRevisionParams.builder()
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
        val revisionServiceAsync = client.cms().pages().landingPages().revisions()

        val pageFuture = revisionServiceAsync.listLandingPageRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().landingPages().revisions()

        val pagesPageFuture =
            revisionServiceAsync.restoreLandingPageRevision(
                RevisionRestoreLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pagesPage = pagesPageFuture.get()
        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevisionToDraft() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val revisionServiceAsync = client.cms().pages().landingPages().revisions()

        val pagesPageFuture =
            revisionServiceAsync.restoreLandingPageRevisionToDraft(
                RevisionRestoreLandingPageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val pagesPage = pagesPageFuture.get()
        pagesPage.validate()
    }
}
