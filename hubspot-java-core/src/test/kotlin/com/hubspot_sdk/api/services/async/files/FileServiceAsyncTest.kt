// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.files

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getImportTaskStatus() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileServiceAsync = client.files().files()

        val fileActionResponseFuture = fileServiceAsync.getImportTaskStatus("taskId")

        val fileActionResponse = fileActionResponseFuture.get()
        fileActionResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun importFromUrlAsync() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileServiceAsync = client.files().files()

        val importFromUrlTaskLocatorFuture =
            fileServiceAsync.importFromUrlAsync(
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
    fun search() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileServiceAsync = client.files().files()

        val pageFuture = fileServiceAsync.search()

        val page = pageFuture.get()
        page.response().validate()
    }
}
