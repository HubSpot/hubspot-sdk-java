// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.folders

import com.hubspot_sdk.api.models.crm.lists.ListMoveRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderMoveListParamsTest {

    @Test
    fun create() {
        FolderMoveListParams.builder()
            .listMoveRequest(
                ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            FolderMoveListParams.builder()
                .listMoveRequest(
                    ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
            )
    }
}
