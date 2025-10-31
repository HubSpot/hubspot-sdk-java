// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListMoveRequest
import com.hubspot_sdk.api.models.crm.lists.folders.FolderGetParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderRenameParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        val listFolderCreateResponse =
            folderService.create(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )

        listFolderCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        folderService.delete("folderId")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        val listFolderFetchResponse =
            folderService.get(FolderGetParams.builder().folderId("folderId").build())

        listFolderFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun move() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        val listFolderFetchResponse =
            folderService.move(
                FolderMoveParams.builder()
                    .folderId("folderId")
                    .newParentFolderId("newParentFolderId")
                    .build()
            )

        listFolderFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun moveList() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        folderService.moveList(
            ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun rename() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val folderService = client.crm().lists().folders()

        val listFolderFetchResponse =
            folderService.rename(
                FolderRenameParams.builder()
                    .folderId("folderId")
                    .newFolderName("newFolderName")
                    .build()
            )

        listFolderFetchResponse.validate()
    }
}
