// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.files.FileUpdateInput
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetByPathParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationGetSignedUrlParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationReplaceParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUpdateParams
import com.hubspot_sdk.api.models.files.fileoperations.FileOperationUploadParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileOperationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val file =
            fileOperationService.update(
                FileOperationUpdateParams.builder()
                    .fileId("321669910225")
                    .fileUpdateInput(
                        FileUpdateInput.builder()
                            .access(FileUpdateInput.Access.HIDDEN_INDEXABLE)
                            .clearExpires(true)
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

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        fileOperationService.delete("321669910225")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gdprDelete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        fileOperationService.gdprDelete("321669910225")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val file =
            fileOperationService.get(
                FileOperationGetParams.builder()
                    .fileId("321669910225")
                    .addProperty("string")
                    .build()
            )

        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByPath() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val fileStat =
            fileOperationService.getByPath(
                FileOperationGetByPathParams.builder()
                    .filePath("file_path")
                    .addProperty("string")
                    .build()
            )

        fileStat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val fileActionResponse = fileOperationService.getImportTaskStatus("taskId")

        fileActionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSignedUrl() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val signedUrl =
            fileOperationService.getSignedUrl(
                FileOperationGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileOperationGetSignedUrlParams.Size.ICON)
                    .upscale(true)
                    .build()
            )

        signedUrl.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val importFromUrlTaskLocator =
            fileOperationService.importFromUrlAsync(
                ImportFromUrlInput.builder()
                    .access(ImportFromUrlInput.Access.HIDDEN_INDEXABLE)
                    .url("url")
                    .duplicateValidationScope(
                        ImportFromUrlInput.DuplicateValidationScope.ENTIRE_PORTAL
                    )
                    .duplicateValidationStrategy(
                        ImportFromUrlInput.DuplicateValidationStrategy.NONE
                    )
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .folderId("folderId")
                    .folderPath("folderPath")
                    .name("name")
                    .overwrite(true)
                    .ttl("ttl")
                    .build()
            )

        importFromUrlTaskLocator.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val file =
            fileOperationService.replace(
                FileOperationReplaceParams.builder()
                    .fileId("321669910225")
                    .charsetHunch("charsetHunch")
                    .file("some content".byteInputStream())
                    .options("options")
                    .build()
            )

        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val page = fileOperationService.search()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationService = client.files().fileOperations()

        val file =
            fileOperationService.upload(
                FileOperationUploadParams.builder()
                    .charsetHunch("charsetHunch")
                    .file("some content".byteInputStream())
                    .fileName("fileName")
                    .folderId("folderId")
                    .folderPath("folderPath")
                    .options("options")
                    .build()
            )

        file.validate()
    }
}
