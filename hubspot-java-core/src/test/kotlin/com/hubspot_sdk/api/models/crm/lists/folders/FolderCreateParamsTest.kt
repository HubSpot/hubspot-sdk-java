// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.folders

import com.hubspot_sdk.api.models.crm.lists.ListFolderCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderCreateParamsTest {

    @Test
    fun create() {
        FolderCreateParams.builder()
            .listFolderCreateRequest(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FolderCreateParams.builder()
                .listFolderCreateRequest(
                    ListFolderCreateRequest.builder()
                        .name("name")
                        .parentFolderId("parentFolderId")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListFolderCreateRequest.builder()
                    .name("name")
                    .parentFolderId("parentFolderId")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            FolderCreateParams.builder()
                .listFolderCreateRequest(ListFolderCreateRequest.builder().name("name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ListFolderCreateRequest.builder().name("name").build())
    }
}
