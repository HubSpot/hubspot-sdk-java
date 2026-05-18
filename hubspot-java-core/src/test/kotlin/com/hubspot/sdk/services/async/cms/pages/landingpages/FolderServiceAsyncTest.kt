// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.pages.landingpages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.cms.BatchInputJsonNode
import com.hubspot.sdk.models.cms.pages.BatchInputContentFolder
import com.hubspot.sdk.models.cms.pages.ContentFolder
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderBatchGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderDeleteParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderGetParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderGetRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderRestoreRevisionParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderUpdateFoldersParams
import com.hubspot.sdk.models.cms.pages.landingpages.folders.FolderUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
        val folderServiceAsync = client.cms().pages().landingPages().folders()

        val pageFuture = folderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
    fun createFolders() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

        val batchResponseContentFolderFuture =
            folderServiceAsync.createFolders(
                BatchInputContentFolder.builder()
                    .addInput(
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

        val batchResponseContentFolder = batchResponseContentFolderFuture.get()
        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolders() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

        val future =
            folderServiceAsync.deleteFolders(BatchInputString.builder().addInput("string").build())

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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
        val folderServiceAsync = client.cms().pages().landingPages().folders()

        val pageFuture = folderServiceAsync.listRevisions("objectId")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFolders() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.cms().pages().landingPages().folders()

        val batchResponseContentFolderFuture =
            folderServiceAsync.updateFolders(
                FolderUpdateFoldersParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        val batchResponseContentFolder = batchResponseContentFolderFuture.get()
        batchResponseContentFolder.validate()
    }
}
