// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListMoveListParamsTest {

    @Test
    fun create() {
        ListMoveListParams.builder()
            .listMoveRequest(
                ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            ListMoveListParams.builder()
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
