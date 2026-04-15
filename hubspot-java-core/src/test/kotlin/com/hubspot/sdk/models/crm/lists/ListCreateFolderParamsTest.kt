// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListCreateFolderParamsTest {

    @Test
    fun create() {
        ListCreateFolderParams.builder()
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
            ListCreateFolderParams.builder()
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
            ListCreateFolderParams.builder()
                .listFolderCreateRequest(ListFolderCreateRequest.builder().name("name").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ListFolderCreateRequest.builder().name("name").build())
    }
}
