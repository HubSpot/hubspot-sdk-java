// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import com.hubspot_sdk.api.models.files.FolderInput
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileCreateParamsTest {

    @Test
    fun create() {
        FileCreateParams.builder()
            .folderInput(
                FolderInput.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentPath("parentPath")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FileCreateParams.builder()
                .folderInput(
                    FolderInput.builder()
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .parentPath("parentPath")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FolderInput.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentPath("parentPath")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileCreateParams.builder()
                .folderInput(FolderInput.builder().name("name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(FolderInput.builder().name("name").build())
    }
}
