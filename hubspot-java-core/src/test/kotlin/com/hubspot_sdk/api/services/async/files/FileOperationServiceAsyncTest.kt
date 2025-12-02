// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class FileOperationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileFuture =
            fileOperationServiceAsync.update(
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

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val future = fileOperationServiceAsync.delete("321669910225")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gdprDelete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val future = fileOperationServiceAsync.gdprDelete("321669910225")

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
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileFuture =
            fileOperationServiceAsync.get(
                FileOperationGetParams.builder()
                    .fileId("321669910225")
                    .addProperty("string")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByPath() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileStatFuture =
            fileOperationServiceAsync.getByPath(
                FileOperationGetByPathParams.builder().path("path").addProperty("string").build()
            )

        val fileStat = fileStatFuture.get()
        fileStat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileActionResponseFuture = fileOperationServiceAsync.getImportTaskStatus("taskId")

        val fileActionResponse = fileActionResponseFuture.get()
        fileActionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSignedUrl() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val signedUrlFuture =
            fileOperationServiceAsync.getSignedUrl(
                FileOperationGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileOperationGetSignedUrlParams.Size.ICON)
                    .upscale(true)
                    .build()
            )

        val signedUrl = signedUrlFuture.get()
        signedUrl.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val importFromUrlTaskLocatorFuture =
            fileOperationServiceAsync.importFromUrlAsync(
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

        val importFromUrlTaskLocator = importFromUrlTaskLocatorFuture.get()
        importFromUrlTaskLocator.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replace() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileFuture =
            fileOperationServiceAsync.replace(
                FileOperationReplaceParams.builder()
                    .fileId("321669910225")
                    .charsetHunch("charsetHunch")
                    .file("some content".byteInputStream())
                    .options("options")
                    .build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val pageFuture = fileOperationServiceAsync.search()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val fileOperationServiceAsync = client.files().fileOperations()

        val fileFuture =
            fileOperationServiceAsync.upload(
                FileOperationUploadParams.builder()
                    .charsetHunch("charsetHunch")
                    .file("some content".byteInputStream())
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
