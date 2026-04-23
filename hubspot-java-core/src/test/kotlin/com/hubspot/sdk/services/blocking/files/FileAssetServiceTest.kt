// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.files

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.files.FileUpdateInput
import com.hubspot.sdk.models.files.FolderInput
import com.hubspot.sdk.models.files.ImportFromUrlInput
import com.hubspot.sdk.models.files.fileassets.FileAssetGetParams
import com.hubspot.sdk.models.files.fileassets.FileAssetGetSignedUrlParams
import com.hubspot.sdk.models.files.fileassets.FileAssetReplaceParams
import com.hubspot.sdk.models.files.fileassets.FileAssetUpdateParams
import com.hubspot.sdk.models.files.fileassets.FileAssetUploadParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileAssetServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val folder =
            fileAssetService.create(
                FolderInput.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentPath("parentPath")
                    .build()
            )

        folder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val file =
            fileAssetService.update(
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

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        fileAssetService.delete("321669910225")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun gdprDelete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        fileAssetService.gdprDelete("321669910225")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val file =
            fileAssetService.get(
                FileAssetGetParams.builder().fileId("321669910225").addProperty("string").build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val fileActionResponse = fileAssetService.getImportTaskStatus("taskId")

        fileActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSignedUrl() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val signedUrl =
            fileAssetService.getSignedUrl(
                FileAssetGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileAssetGetSignedUrlParams.Size.ICON)
                    .upscale(true)
                    .build()
            )

        signedUrl.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val importFromUrlTaskLocator =
            fileAssetService.importFromUrlAsync(
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

        importFromUrlTaskLocator.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val file =
            fileAssetService.replace(
                FileAssetReplaceParams.builder()
                    .fileId("321669910225")
                    .charsetHunch("charsetHunch")
                    .file("Example data".byteInputStream())
                    .options("options")
                    .build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun search() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val page = fileAssetService.search()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val fileAssetService = client.files().fileAssets()

        val file =
            fileAssetService.upload(
                FileAssetUploadParams.builder()
                    .charsetHunch("charsetHunch")
                    .file("Example data".byteInputStream())
                    .fileName("fileName")
                    .folderId("folderId")
                    .folderPath("folderPath")
                    .options("options")
                    .build()
            )

        file.validate()
    }
}
