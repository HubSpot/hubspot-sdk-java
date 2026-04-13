// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateInputTest {

    @Test
    fun create() {
        val folderUpdateInput = FolderUpdateInput.builder().name("name").parentFolderId(0L).build()

        assertThat(folderUpdateInput.name()).contains("name")
        assertThat(folderUpdateInput.parentFolderId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderUpdateInput = FolderUpdateInput.builder().name("name").parentFolderId(0L).build()

        val roundtrippedFolderUpdateInput =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderUpdateInput),
                jacksonTypeRef<FolderUpdateInput>(),
            )

        assertThat(roundtrippedFolderUpdateInput).isEqualTo(folderUpdateInput)
    }
}
