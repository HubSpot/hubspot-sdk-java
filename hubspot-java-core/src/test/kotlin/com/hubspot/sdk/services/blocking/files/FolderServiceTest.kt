// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.files

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.files.FolderUpdateInput
import com.hubspot.sdk.models.files.FolderUpdateInputWithId
import com.hubspot.sdk.models.files.folders.FolderGetByIdParams
import com.hubspot.sdk.models.files.folders.FolderGetByPathParams
import com.hubspot.sdk.models.files.folders.FolderUpdateByIdParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FolderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        folderService.deleteById("321669910225")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByPath() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        folderService.deleteByPath("folderPath")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val folder =
            folderService.getById(
                FolderGetByIdParams.builder().folderId("321669910225").addProperty("string").build()
            )

        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByPath() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val folder =
            folderService.getByPath(
                FolderGetByPathParams.builder()
                    .folderPath("folderPath")
                    .addProperty("string")
                    .build()
            )

        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getUpdateAsyncStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val folderActionResponse = folderService.getUpdateAsyncStatus("taskId")

        folderActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val page = folderService.search()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateAsyncById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val folderUpdateTaskLocator =
            folderService.updateAsyncById(
                FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()
            )

        folderUpdateTaskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateById() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val folderService = client.files().folders()

        val folder =
            folderService.updateById(
                FolderUpdateByIdParams.builder()
                    .folderId("321669910225")
                    .folderUpdateInput(
                        FolderUpdateInput.builder().name("name").parentFolderId(0L).build()
                    )
                    .build()
            )

        folder.validate()
    }
}
