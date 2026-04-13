// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.pages

import com.hubspot.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.pages.ContentFolder
import com.hubspot.models.cms.pages.folders.FolderBatchGetParams
import com.hubspot.models.cms.pages.folders.FolderDeleteParams
import com.hubspot.models.cms.pages.folders.FolderGetParams
import com.hubspot.models.cms.pages.folders.FolderGetRevisionParams
import com.hubspot.models.cms.pages.folders.FolderRestoreRevisionParams
import com.hubspot.models.cms.pages.folders.FolderUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.create(
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
    fun update() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.update(
                FolderUpdateParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val pageFuture = folderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val future =
            folderServiceAsync.delete(
                FolderDeleteParams.builder().objectId("objectId").archived(true).build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchGet() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val batchResponseContentFolderFuture =
            folderServiceAsync.batchGet(
                FolderBatchGetParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseContentFolder = batchResponseContentFolderFuture.get()
        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.get(
                FolderGetParams.builder()
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
    fun getRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderVersionFuture =
            folderServiceAsync.getRevision(
                FolderGetRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val contentFolderVersion = contentFolderVersionFuture.get()
        contentFolderVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRevisions() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val pageFuture = folderServiceAsync.listRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().folders()

        val contentFolderFuture =
            folderServiceAsync.restoreRevision(
                FolderRestoreRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        val contentFolder = contentFolderFuture.get()
        contentFolder.validate()
    }
}
