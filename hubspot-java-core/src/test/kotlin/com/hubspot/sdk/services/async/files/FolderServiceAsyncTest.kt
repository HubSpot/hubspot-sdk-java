// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.files

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot.sdk.models.files.FolderUpdateInput
import com.hubspot.sdk.models.files.FolderUpdateInputWithId
import com.hubspot.sdk.models.files.folders.FolderGetByIdParams
import com.hubspot.sdk.models.files.folders.FolderGetByPathParams
import com.hubspot.sdk.models.files.folders.FolderUpdateByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val future = folderServiceAsync.deleteById("321669910225")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByPath() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val future = folderServiceAsync.deleteByPath("folderPath")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val folderFuture =
            folderServiceAsync.getById(
                FolderGetByIdParams.builder().folderId("321669910225").addProperty("string").build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByPath() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val folderFuture =
            folderServiceAsync.getByPath(
                FolderGetByPathParams.builder()
                    .folderPath("folderPath")
                    .addProperty("string")
                    .build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUpdateAsyncStatus() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val folderActionResponseFuture = folderServiceAsync.getUpdateAsyncStatus("taskId")

        val folderActionResponse = folderActionResponseFuture.get()
        folderActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val pageFuture = folderServiceAsync.search()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAsyncById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val folderUpdateTaskLocatorFuture =
            folderServiceAsync.updateAsyncById(
                FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()
            )

        val folderUpdateTaskLocator = folderUpdateTaskLocatorFuture.get()
        folderUpdateTaskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val folderServiceAsync = client.files().folders()

        val folderFuture =
            folderServiceAsync.updateById(
                FolderUpdateByIdParams.builder()
                    .folderId("321669910225")
                    .folderUpdateInput(
                        FolderUpdateInput.builder().name("name").parentFolderId(0L).build()
                    )
                    .build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }
}
