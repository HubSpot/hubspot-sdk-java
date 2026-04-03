// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.files.FileUpdateInput
import com.hubspot_sdk.api.models.files.FolderInput
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.fileassets.FileAssetGetByPathParams
import com.hubspot_sdk.api.models.files.fileassets.FileAssetGetParams
import com.hubspot_sdk.api.models.files.fileassets.FileAssetGetSignedUrlParams
import com.hubspot_sdk.api.models.files.fileassets.FileAssetReplaceParams
import com.hubspot_sdk.api.models.files.fileassets.FileAssetUpdateParams
import com.hubspot_sdk.api.models.files.fileassets.FileAssetUploadParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileAssetServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val folderFuture =
            fileAssetServiceAsync.create(
                FolderInput.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentPath("parentPath")
                    .build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileFuture =
            fileAssetServiceAsync.update(
                FileAssetUpdateParams.builder()
                    .fileId("321669910225")
                    .fileUpdateInput(
                        FileUpdateInput.builder()
                            .clearExpires(true)
                            .access(FileUpdateInput.Access.HIDDEN_INDEXABLE)
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .isUsableInContent(true)
                            .name("name")
                            .parentFolderId("parentFolderId")
                            .parentFolderPath("parentFolderPath")
                            .build()
                    )
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val future = fileAssetServiceAsync.delete("321669910225")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun gdprDelete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val future = fileAssetServiceAsync.gdprDelete("321669910225")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileFuture =
            fileAssetServiceAsync.get(
                FileAssetGetParams.builder().fileId("321669910225").addProperty("string").build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByPath() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileStatFuture =
            fileAssetServiceAsync.getByPath(
                FileAssetGetByPathParams.builder().path("path").addProperty("string").build()
            )

        val fileStat = fileStatFuture.get()
        fileStat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileActionResponseFuture = fileAssetServiceAsync.getImportTaskStatus("taskId")

        val fileActionResponse = fileActionResponseFuture.get()
        fileActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSignedUrl() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val signedUrlFuture =
            fileAssetServiceAsync.getSignedUrl(
                FileAssetGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileAssetGetSignedUrlParams.Size.ICON)
                    .upscale(true)
                    .build()
            )

        val signedUrl = signedUrlFuture.get()
        signedUrl.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val importFromUrlTaskLocatorFuture =
            fileAssetServiceAsync.importFromUrlAsync(
                ImportFromUrlInput.builder()
                    .access(ImportFromUrlInput.Access.HIDDEN_INDEXABLE)
                    .duplicateValidationScope(
                        ImportFromUrlInput.DuplicateValidationScope.ENTIRE_PORTAL
                    )
                    .duplicateValidationStrategy(
                        ImportFromUrlInput.DuplicateValidationStrategy.NONE
                    )
                    .overwrite(true)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .folderId("folderId")
                    .folderPath("folderPath")
                    .name("name")
                    .ttl("ttl")
                    .url("url")
                    .build()
            )

        val importFromUrlTaskLocator = importFromUrlTaskLocatorFuture.get()
        importFromUrlTaskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileFuture =
            fileAssetServiceAsync.replace(
                FileAssetReplaceParams.builder()
                    .fileId("321669910225")
                    .charsetHunch("charsetHunch")
                    .file("Example data".byteInputStream())
                    .options("options")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val pageFuture = fileAssetServiceAsync.search()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val fileAssetServiceAsync = client.files().fileAssets()

        val fileFuture =
            fileAssetServiceAsync.upload(
                FileAssetUploadParams.builder()
                    .charsetHunch("charsetHunch")
                    .file("Example data".byteInputStream())
                    .fileName("fileName")
                    .folderId("folderId")
                    .folderPath("folderPath")
                    .options("options")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }
}
