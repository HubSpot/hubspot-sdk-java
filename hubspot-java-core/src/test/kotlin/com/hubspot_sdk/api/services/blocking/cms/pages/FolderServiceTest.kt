// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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

internal class FolderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.createFolder(
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

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        folderService.deleteFolder(
            FolderDeleteFolderParams.builder().objectId("objectId").archived(true).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.getFolder(
                FolderGetFolderParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFolderRevision() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val contentFolderVersion =
            folderService.getFolderRevision(
                FolderGetFolderRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        contentFolderVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getFoldersBatch() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val batchResponseContentFolder =
            folderService.getFoldersBatch(
                FolderGetFoldersBatchParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolderRevisions() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val page = folderService.listFolderRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listFolders() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val page = folderService.listFolders()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreFolderRevision() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.restoreFolderRevision(
                FolderRestoreFolderRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFolder() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.updateFolder(
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

        contentFolder.validate()
    }
}
