// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.files.FileUpdateInput
import com.hubspot_sdk.api.models.files.FolderInput
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.files.FileGetByPathParams
import com.hubspot_sdk.api.models.files.files.FileGetParams
import com.hubspot_sdk.api.models.files.files.FileGetSignedUrlParams
import com.hubspot_sdk.api.models.files.files.FileReplaceParams
import com.hubspot_sdk.api.models.files.files.FileUpdateParams
import com.hubspot_sdk.api.models.files.files.FileUploadParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val folder =
            fileService.create(
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val file =
            fileService.update(
                FileUpdateParams.builder()
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        fileService.delete("321669910225")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun gdprDelete() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        fileService.gdprDelete("321669910225")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val file =
            fileService.get(
                FileGetParams.builder().fileId("321669910225").addProperty("string").build()
            )

        file.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByPath() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val fileStat =
            fileService.getByPath(
                FileGetByPathParams.builder().path("path").addProperty("string").build()
            )

        fileStat.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val fileActionResponse = fileService.getImportTaskStatus("taskId")

        fileActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSignedUrl() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val signedUrl =
            fileService.getSignedUrl(
                FileGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileGetSignedUrlParams.Size.ICON)
                    .upscale(true)
                    .build()
            )

        signedUrl.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val importFromUrlTaskLocator =
            fileService.importFromUrlAsync(
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val file =
            fileService.replace(
                FileReplaceParams.builder()
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
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val page = fileService.search()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun upload() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val file =
            fileService.upload(
                FileUploadParams.builder()
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
