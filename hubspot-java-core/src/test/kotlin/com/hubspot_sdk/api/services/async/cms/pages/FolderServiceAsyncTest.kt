// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.models.cms.pages.folders.FolderDeleteFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderGetFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.folders.FolderUpdateFolderParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFolder() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.createFolder(
                ContentFolder.builder()
                    .id("id")
                    .category(0)
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .parentFolderId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val contentFolder = contentFolderFuture.get()
        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolder() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val future =
            folderServiceAsync.deleteFolder(
                FolderDeleteFolderParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFolder() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.getFolder(
                FolderGetFolderParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        val contentFolder = contentFolderFuture.get()
        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFolderRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderVersionFuture =
            folderServiceAsync.getFolderRevision(
                FolderGetFolderRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val contentFolderVersion = contentFolderVersionFuture.get()
        contentFolderVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFoldersBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val batchResponseContentFolderFuture =
            folderServiceAsync.getFoldersBatch(
                FolderGetFoldersBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseContentFolder = batchResponseContentFolderFuture.get()
        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolderRevisions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val pageFuture = folderServiceAsync.listFolderRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolders() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val pageFuture = folderServiceAsync.listFolders()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreFolderRevision() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.restoreFolderRevision(
                FolderRestoreFolderRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val contentFolder = contentFolderFuture.get()
        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFolder() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.updateFolder(
                FolderUpdateFolderParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .contentFolder(
                        ContentFolder.builder()
                            .id("id")
                            .category(0)
                            .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .name("name")
                            .parentFolderId(0L)
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )

        val contentFolder = contentFolderFuture.get()
        contentFolder.validate()
    }
}
