// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.lists

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateRequest
import com.hubspot_sdk.api.models.crm.lists.ListMoveRequest
import com.hubspot_sdk.api.models.crm.lists.folders.FolderGetParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderMoveParams
import com.hubspot_sdk.api.models.crm.lists.folders.FolderRenameParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val listFolderCreateResponseFuture =
            folderServiceAsync.create(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )

        val listFolderCreateResponse = listFolderCreateResponseFuture.get()
        listFolderCreateResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val future = folderServiceAsync.delete("folderId")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val listFolderFetchResponseFuture =
            folderServiceAsync.get(FolderGetParams.builder().folderId("folderId").build())

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun move() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val listFolderFetchResponseFuture =
            folderServiceAsync.move(
                FolderMoveParams.builder()
                    .folderId("folderId")
                    .newParentFolderId("newParentFolderId")
                    .build()
            )

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun moveList() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val future =
            folderServiceAsync.moveList(
                ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun rename() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val folderServiceAsync = client.crm().lists().folders()

        val listFolderFetchResponseFuture =
            folderServiceAsync.rename(
                FolderRenameParams.builder()
                    .folderId("folderId")
                    .newFolderName("newFolderName")
                    .build()
            )

        val listFolderFetchResponse = listFolderFetchResponseFuture.get()
        listFolderFetchResponse.validate()
    }
}
