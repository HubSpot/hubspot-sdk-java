// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.files

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FileServiceTest {

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
    fun search() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val fileService = client.files().files()

        val page = fileService.search()

        page.response().validate()
    }
}
