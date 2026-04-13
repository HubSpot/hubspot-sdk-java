// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.fileassets

import com.hubspot.sdk.models.files.FileUpdateInput
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetUpdateParamsTest {

    @Test
    fun create() {
        FileAssetUpdateParams.builder()
            .fileId("321669910225")
            .fileUpdateInput(
                FileUpdateInput.builder()
                    .clearExpires(true)
                    .access(FileUpdateInput.Access.HIDDEN_INDEXABLE)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isUsableInContent(true)
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentFolderPath("parentFolderPath")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FileAssetUpdateParams.builder()
                .fileId("321669910225")
                .fileUpdateInput(FileUpdateInput.builder().clearExpires(true).build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FileAssetUpdateParams.builder()
                .fileId("321669910225")
                .fileUpdateInput(
                    FileUpdateInput.builder()
                        .clearExpires(true)
                        .access(FileUpdateInput.Access.HIDDEN_INDEXABLE)
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .isUsableInContent(true)
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .parentFolderPath("parentFolderPath")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                FileUpdateInput.builder()
                    .clearExpires(true)
                    .access(FileUpdateInput.Access.HIDDEN_INDEXABLE)
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isUsableInContent(true)
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .parentFolderPath("parentFolderPath")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FileAssetUpdateParams.builder()
                .fileId("321669910225")
                .fileUpdateInput(FileUpdateInput.builder().clearExpires(true).build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(FileUpdateInput.builder().clearExpires(true).build())
    }
}
