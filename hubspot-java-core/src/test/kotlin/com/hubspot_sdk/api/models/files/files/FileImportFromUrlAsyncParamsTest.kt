// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.hubspot_sdk.api.models.files.ImportFromUrlInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileImportFromUrlAsyncParamsTest {

    @Test
    fun create() {
        FileImportFromUrlAsyncParams.builder()
            .importFromUrlInput(
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
            .build()
    }

    @Test
    fun body() {
        val params =
            FileImportFromUrlAsyncParams.builder()
                .importFromUrlInput(
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileImportFromUrlAsyncParams.builder()
                .importFromUrlInput(
                    ImportFromUrlInput.builder()
                        .access(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
                        .url("url")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ImportFromUrlInput.builder()
                    .access(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
                    .url("url")
                    .build()
            )
    }
}
