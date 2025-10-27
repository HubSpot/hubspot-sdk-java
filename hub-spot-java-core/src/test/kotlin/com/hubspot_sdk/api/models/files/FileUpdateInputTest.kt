// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUpdateInputTest {

    @Test
    fun create() {
        val fileUpdateInput =
            FileUpdateInput.builder()
                .access(FileUpdateInput.Access.PUBLIC_INDEXABLE)
                .clearExpires(true)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isUsableInContent(true)
                .name("name")
                .parentFolderId("parentFolderId")
                .parentFolderPath("parentFolderPath")
                .build()

        assertThat(fileUpdateInput.access()).contains(FileUpdateInput.Access.PUBLIC_INDEXABLE)
        assertThat(fileUpdateInput.clearExpires()).contains(true)
        assertThat(fileUpdateInput.expiresAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileUpdateInput.isUsableInContent()).contains(true)
        assertThat(fileUpdateInput.name()).contains("name")
        assertThat(fileUpdateInput.parentFolderId()).contains("parentFolderId")
        assertThat(fileUpdateInput.parentFolderPath()).contains("parentFolderPath")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUpdateInput =
            FileUpdateInput.builder()
                .access(FileUpdateInput.Access.PUBLIC_INDEXABLE)
                .clearExpires(true)
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .isUsableInContent(true)
                .name("name")
                .parentFolderId("parentFolderId")
                .parentFolderPath("parentFolderPath")
                .build()

        val roundtrippedFileUpdateInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUpdateInput),
                jacksonTypeRef<FileUpdateInput>(),
            )

        assertThat(roundtrippedFileUpdateInput).isEqualTo(fileUpdateInput)
    }
}
