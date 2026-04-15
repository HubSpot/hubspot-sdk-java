// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.BatchInputString
import com.hubspot.sdk.models.cms.pages.ContentFolder
import com.hubspot.sdk.models.cms.pages.folders.FolderBatchGetParams
import com.hubspot.sdk.models.cms.pages.folders.FolderDeleteParams
import com.hubspot.sdk.models.cms.pages.folders.FolderGetParams
import com.hubspot.sdk.models.cms.pages.folders.FolderGetRevisionParams
import com.hubspot.sdk.models.cms.pages.folders.FolderRestoreRevisionParams
import com.hubspot.sdk.models.cms.pages.folders.FolderUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.create(
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
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.update(
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

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val page = folderService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        folderService.delete(
            FolderDeleteParams.builder().objectId("objectId").archived(true).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchGet() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val batchResponseContentFolder =
            folderService.batchGet(
                FolderBatchGetParams.builder()
                    .archived(true)
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.get(
                FolderGetParams.builder()
                    .objectId("objectId")
                    .archived(true)
                    .property("property")
                    .build()
            )

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val contentFolderVersion =
            folderService.getRevision(
                FolderGetRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        contentFolderVersion.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listRevisions() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val page = folderService.listRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().folders()

        val contentFolder =
            folderService.restoreRevision(
                FolderRestoreRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        contentFolder.validate()
    }
}
