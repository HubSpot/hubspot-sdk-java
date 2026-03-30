// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.cms.pages.PageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageListLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageListSitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPageFoldersParams
import com.hubspot_sdk.api.models.cms.pages.PageQueryLandingPagesParams
import com.hubspot_sdk.api.models.cms.pages.PageQuerySitePagesParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.PageRestoreRevisionToDraftParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val pageVersionFuture =
            pageServiceAsync.getRevision(
                PageGetRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val pageVersion = pageVersionFuture.get()
        pageVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listLandingPageFolders() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultContentFolderLongFuture =
            pageServiceAsync.listLandingPageFolders(
                PageListLandingPageFoldersParams.builder()
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
    fun listLandingPages() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.listLandingPages(
                PageListLandingPagesParams.builder()
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
    fun listRevisions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val pageFuture = pageServiceAsync.listRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSitePages() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.listSitePages(
                PageListSitePagesParams.builder()
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
    fun queryLandingPageFolders() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultContentFolderLongFuture =
            pageServiceAsync.queryLandingPageFolders(
                PageQueryLandingPageFoldersParams.builder()
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
    fun queryLandingPages() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.queryLandingPages(
                PageQueryLandingPagesParams.builder()
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
    fun querySitePages() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val cursorPagedResultPageLongFuture =
            pageServiceAsync.querySitePages(
                PageQuerySitePagesParams.builder()
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
    fun resetDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val future = pageServiceAsync.resetDraft("objectId")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val pageFuture =
            pageServiceAsync.restoreRevision(
                PageRestoreRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevisionToDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val pageServiceAsync = client.cms().pages()

        val pageFuture =
            pageServiceAsync.restoreRevisionToDraft(
                PageRestoreRevisionToDraftParams.builder()
                    .objectId("objectId")
                    .revisionId(0L)
                    .build()
            )

        val page = pageFuture.get()
        page.validate()
    }
}
