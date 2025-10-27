// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.models.files.FileUpdateInput
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
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileFuture =
            fileServiceAsync.update(
                FileUpdateParams.builder()
                    .fileId("321669910225")
                    .fileUpdateInput(
                        FileUpdateInput.builder()
                            .access(FileUpdateInput.Access.PUBLIC_INDEXABLE)
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val future = fileServiceAsync.delete("321669910225")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun gdprDelete() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val future = fileServiceAsync.gdprDelete("321669910225")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileFuture =
            fileServiceAsync.get(
                FileGetParams.builder().fileId("321669910225").addProperty("string").build()
            )

        val file = fileFuture.get()
        file.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getByPath() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileStatFuture =
            fileServiceAsync.getByPath(
                FileGetByPathParams.builder().path("path").addProperty("string").build()
            )

        val fileStat = fileStatFuture.get()
        fileStat.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileActionResponseFuture = fileServiceAsync.getImportTaskStatus("taskId")

        val fileActionResponse = fileActionResponseFuture.get()
        fileActionResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSignedUrl() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val signedUrlFuture =
            fileServiceAsync.getSignedUrl(
                FileGetSignedUrlParams.builder()
                    .fileId("321669910225")
                    .expirationSeconds(0L)
                    .size(FileGetSignedUrlParams.Size.THUMB)
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val importFromUrlTaskLocatorFuture =
            fileServiceAsync.importFromUrlAsync(
                ImportFromUrlInput.builder()
                    .access(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileFuture =
            fileServiceAsync.replace(
                FileReplaceParams.builder()
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
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val pageFuture = fileServiceAsync.search()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun upload() {
        val client =
            HubSpotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val fileServiceAsync = client.files().files()

        val fileFuture =
            fileServiceAsync.upload(
                FileUploadParams.builder()
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
