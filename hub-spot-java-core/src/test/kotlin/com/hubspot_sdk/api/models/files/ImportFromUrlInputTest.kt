// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ImportFromUrlInputTest {

    @Test
    fun create() {
        val importFromUrlInput =
            ImportFromUrlInput.builder()
                .access(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
                .url("url")
                .duplicateValidationScope(ImportFromUrlInput.DuplicateValidationScope.ENTIRE_PORTAL)
                .duplicateValidationStrategy(ImportFromUrlInput.DuplicateValidationStrategy.NONE)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderId("folderId")
                .folderPath("folderPath")
                .name("name")
                .overwrite(true)
                .ttl("ttl")
                .build()

        assertThat(importFromUrlInput.access())
            .isEqualTo(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
        assertThat(importFromUrlInput.url()).isEqualTo("url")
        assertThat(importFromUrlInput.duplicateValidationScope())
            .contains(ImportFromUrlInput.DuplicateValidationScope.ENTIRE_PORTAL)
        assertThat(importFromUrlInput.duplicateValidationStrategy())
            .contains(ImportFromUrlInput.DuplicateValidationStrategy.NONE)
        assertThat(importFromUrlInput.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(importFromUrlInput.folderId()).contains("folderId")
        assertThat(importFromUrlInput.folderPath()).contains("folderPath")
        assertThat(importFromUrlInput.name()).contains("name")
        assertThat(importFromUrlInput.overwrite()).contains(true)
        assertThat(importFromUrlInput.ttl()).contains("ttl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val importFromUrlInput =
            ImportFromUrlInput.builder()
                .access(ImportFromUrlInput.Access.PUBLIC_INDEXABLE)
                .url("url")
                .duplicateValidationScope(ImportFromUrlInput.DuplicateValidationScope.ENTIRE_PORTAL)
                .duplicateValidationStrategy(ImportFromUrlInput.DuplicateValidationStrategy.NONE)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderId("folderId")
                .folderPath("folderPath")
                .name("name")
                .overwrite(true)
                .ttl("ttl")
                .build()

        val roundtrippedImportFromUrlInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(importFromUrlInput),
                jacksonTypeRef<ImportFromUrlInput>(),
            )

        assertThat(roundtrippedImportFromUrlInput).isEqualTo(importFromUrlInput)
    }
}
