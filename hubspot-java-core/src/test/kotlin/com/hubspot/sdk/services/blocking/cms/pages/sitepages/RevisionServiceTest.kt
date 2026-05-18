// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.sitepages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.sitepages.revisions.RevisionRestoreSitePageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.cms().pages().sitePages().revisions()

        val pageVersion =
            revisionService.getSitePageRevision(
                RevisionGetSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSitePageRevisions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.cms().pages().sitePages().revisions()

        val page = revisionService.listSitePageRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.cms().pages().sitePages().revisions()

        val pagesPage =
            revisionService.restoreSitePageRevision(
                RevisionRestoreSitePageRevisionParams.builder()
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
        val revisionService = client.cms().pages().sitePages().revisions()

        val pagesPage =
            revisionService.restoreSitePageRevisionToDraft(
                RevisionRestoreSitePageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pagesPage.validate()
    }
}
