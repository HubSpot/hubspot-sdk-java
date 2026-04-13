// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateInputWithIdTest {

    @Test
    fun create() {
        val folderUpdateInputWithId =
            FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()

        assertThat(folderUpdateInputWithId.id()).isEqualTo("id")
        assertThat(folderUpdateInputWithId.name()).contains("name")
        assertThat(folderUpdateInputWithId.parentFolderId()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderUpdateInputWithId =
            FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()

        val roundtrippedFolderUpdateInputWithId =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderUpdateInputWithId),
                jacksonTypeRef<FolderUpdateInputWithId>(),
            )

        assertThat(roundtrippedFolderUpdateInputWithId).isEqualTo(folderUpdateInputWithId)
    }
}
