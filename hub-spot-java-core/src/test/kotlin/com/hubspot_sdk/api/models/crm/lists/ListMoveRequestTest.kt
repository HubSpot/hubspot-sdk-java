// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListMoveRequestTest {

    @Test
    fun create() {
        val listMoveRequest =
            ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()

        assertThat(listMoveRequest.listId()).isEqualTo("listId")
        assertThat(listMoveRequest.newFolderId()).isEqualTo("newFolderId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listMoveRequest =
            ListMoveRequest.builder().listId("listId").newFolderId("newFolderId").build()

        val roundtrippedListMoveRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listMoveRequest),
                jacksonTypeRef<ListMoveRequest>(),
            )

        assertThat(roundtrippedListMoveRequest).isEqualTo(listMoveRequest)
    }
}
