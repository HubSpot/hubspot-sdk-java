// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files.folders

import com.hubspot.models.files.FolderUpdateInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderUpdateByIdParamsTest {

    @Test
    fun create() {
        FolderUpdateByIdParams.builder()
            .folderId("321669910225")
            .folderUpdateInput(FolderUpdateInput.builder().name("name").parentFolderId(0L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FolderUpdateByIdParams.builder()
                .folderId("321669910225")
                .folderUpdateInput(FolderUpdateInput.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FolderUpdateByIdParams.builder()
                .folderId("321669910225")
                .folderUpdateInput(
                    FolderUpdateInput.builder().name("name").parentFolderId(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(FolderUpdateInput.builder().name("name").parentFolderId(0L).build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FolderUpdateByIdParams.builder()
                .folderId("321669910225")
                .folderUpdateInput(FolderUpdateInput.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(FolderUpdateInput.builder().build())
    }
}
