// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pageVersion =
            pageService.getLandingPageRevision(
                PageGetLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pageVersion =
            pageService.getSitePageRevision(
                PageGetSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLandingPageRevisions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val page = pageService.listLandingPageRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSitePageRevisions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val page = pageService.listSitePageRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetSitePageDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        pageService.resetSitePageDraft("objectId")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pagesPage =
            pageService.restoreLandingPageRevision(
                PageRestoreLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevisionToDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pagesPage =
            pageService.restoreLandingPageRevisionToDraft(
                PageRestoreLandingPageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pagesPage =
            pageService.restoreSitePageRevision(
                PageRestoreSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pagesPage.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevisionToDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pagesPage =
            pageService.restoreSitePageRevisionToDraft(
                PageRestoreSitePageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pagesPage.validate()
    }
}
