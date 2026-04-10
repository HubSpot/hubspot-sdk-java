// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesByQueryParams
import com.hubspot_sdk.api.models.cms.pages.PageGetSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreLandingPageRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreSitePageRevisionToDraftParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageFolders() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultContentFolderLongFuture =
            pageServiceAsync.getLandingPageFolders(
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

        val cursorPagedResultContentFolderLong = cursorPagedResultContentFolderLongFuture.get()
        cursorPagedResultContentFolderLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPageFoldersByQuery() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultContentFolderLongFuture =
            pageServiceAsync.getLandingPageFoldersByQuery(
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

        val cursorPagedResultContentFolderLong = cursorPagedResultContentFolderLongFuture.get()
        cursorPagedResultContentFolderLong.validate()
    }

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
    fun getLandingPages() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.getLandingPages(
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

        val cursorPagedResultPageLong = cursorPagedResultPageLongFuture.get()
        cursorPagedResultPageLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getLandingPagesByQuery() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.getLandingPagesByQuery(
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

        val cursorPagedResultPageLong = cursorPagedResultPageLongFuture.get()
        cursorPagedResultPageLong.validate()
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
    fun getSitePages() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.getSitePages(
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

        val cursorPagedResultPageLong = cursorPagedResultPageLongFuture.get()
        cursorPagedResultPageLong.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSitePagesByQuery() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.getSitePagesByQuery(
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

        val cursorPagedResultPageLong = cursorPagedResultPageLongFuture.get()
        cursorPagedResultPageLong.validate()
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
