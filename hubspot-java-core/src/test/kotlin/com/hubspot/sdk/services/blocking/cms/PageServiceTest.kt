// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageFoldersByQueryParams
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageFoldersParams
import com.hubspot.sdk.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageGetLandingPagesByQueryParams
import com.hubspot.sdk.models.cms.pages.PageGetLandingPagesParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePagesByQueryParams
import com.hubspot.sdk.models.cms.pages.PageGetSitePagesParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot.sdk.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultContentFolderLong =
            pageService.getLandingPageFolders(
                PageGetLandingPageFoldersParams.builder()
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

        cursorPagedResultContentFolderLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageFoldersByQuery() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultContentFolderLong =
            pageService.getLandingPageFoldersByQuery(
                PageGetLandingPageFoldersByQueryParams.builder()
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

        cursorPagedResultContentFolderLong.validate()
    }

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
    fun getLandingPages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultPageLong =
            pageService.getLandingPages(
                PageGetLandingPagesParams.builder()
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

        cursorPagedResultPageLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPagesByQuery() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultPageLong =
            pageService.getLandingPagesByQuery(
                PageGetLandingPagesByQueryParams.builder()
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

        cursorPagedResultPageLong.validate()
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
    fun getSitePages() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultPageLong =
            pageService.getSitePages(
                PageGetSitePagesParams.builder()
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

        cursorPagedResultPageLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePagesByQuery() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val cursorPagedResultPageLong =
            pageService.getSitePagesByQuery(
                PageGetSitePagesByQueryParams.builder()
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

        cursorPagedResultPageLong.validate()
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

        val pageData =
            pageService.restoreLandingPageRevision(
                PageRestoreLandingPageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreLandingPageRevisionToDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pageData =
            pageService.restoreLandingPageRevisionToDraft(
                PageRestoreLandingPageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pageData =
            pageService.restoreSitePageRevision(
                PageRestoreSitePageRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        pageData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreSitePageRevisionToDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val pageService = client.cms().pages()

        val pageData =
            pageService.restoreSitePageRevisionToDraft(
                PageRestoreSitePageRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        pageData.validate()
    }
}
