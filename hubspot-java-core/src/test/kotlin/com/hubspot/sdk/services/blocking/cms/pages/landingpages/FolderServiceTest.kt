// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
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

internal class FolderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

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
        val folderService = client.cms().pages().landingPages().folders()

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
        val folderService = client.cms().pages().landingPages().folders()

        val page = folderService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

        folderService.delete(
            FolderDeleteParams.builder().objectId("objectId").archived(true).build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun batchGet() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

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
    fun createFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

        val batchResponseContentFolder =
            folderService.createFolders(
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

        batchResponseContentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

        folderService.deleteFolders(BatchInputString.builder().addInput("string").build())
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

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
        val folderService = client.cms().pages().landingPages().folders()

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
        val folderService = client.cms().pages().landingPages().folders()

        val page = folderService.listRevisions("objectId")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun restoreRevision() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

        val contentFolder =
            folderService.restoreRevision(
                FolderRestoreRevisionParams.builder()
                    .objectId("objectId")
                    .revisionId("revisionId")
                    .build()
            )

        contentFolder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateFolders() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.cms().pages().landingPages().folders()

        val batchResponseContentFolder =
            folderService.updateFolders(
                FolderUpdateFoldersParams.builder()
                    .archived(true)
                    .batchInputJsonNode(
                        BatchInputJsonNode.builder()
                            .addInput(JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )

        batchResponseContentFolder.validate()
    }
}
