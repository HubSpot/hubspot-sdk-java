// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.revisions.RevisionRestoreLandingPageRevisionToDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RevisionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.cms().pages().landingPages().revisions()

        val pageVersion =
            revisionService.getLandingPageRevision(
                RevisionGetLandingPageRevisionParams.builder()
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
        val revisionService = client.cms().pages().landingPages().revisions()

        val page = revisionService.listLandingPageRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val revisionService = client.cms().pages().landingPages().revisions()

        val pagesPage =
            revisionService.restoreLandingPageRevision(
                RevisionRestoreLandingPageRevisionParams.builder()
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
        val revisionService = client.cms().pages().landingPages().revisions()

        val pagesPage =
            revisionService.restoreLandingPageRevisionToDraft(
                RevisionRestoreLandingPageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pagesPage.validate()
    }
}
