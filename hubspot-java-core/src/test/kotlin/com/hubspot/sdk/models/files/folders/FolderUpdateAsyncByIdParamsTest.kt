// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.folders

import com.hubspot.sdk.models.files.FolderUpdateInputWithId
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateAsyncByIdParamsTest {

    @Test
    fun create() {
        FolderUpdateAsyncByIdParams.builder()
            .folderUpdateInputWithId(
                FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FolderUpdateAsyncByIdParams.builder()
                .folderUpdateInputWithId(
                    FolderUpdateInputWithId.builder()
                        .id("id")
                        .name("name")
                        .parentFolderId(0L)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FolderUpdateInputWithId.builder().id("id").name("name").parentFolderId(0L).build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FolderUpdateAsyncByIdParams.builder()
                .folderUpdateInputWithId(FolderUpdateInputWithId.builder().id("id").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(FolderUpdateInputWithId.builder().id("id").build())
    }
}
