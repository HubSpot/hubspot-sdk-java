// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderInputTest {

    @Test
    fun create() {
        val folderInput =
            FolderInput.builder()
                .name("name")
                .parentFolderId("parentFolderId")
                .parentPath("parentPath")
                .build()

        assertThat(folderInput.name()).isEqualTo("name")
        assertThat(folderInput.parentFolderId()).contains("parentFolderId")
        assertThat(folderInput.parentPath()).contains("parentPath")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderInput =
            FolderInput.builder()
                .name("name")
                .parentFolderId("parentFolderId")
                .parentPath("parentPath")
                .build()

        val roundtrippedFolderInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderInput),
                jacksonTypeRef<FolderInput>(),
            )

        assertThat(roundtrippedFolderInput).isEqualTo(folderInput)
    }
}
