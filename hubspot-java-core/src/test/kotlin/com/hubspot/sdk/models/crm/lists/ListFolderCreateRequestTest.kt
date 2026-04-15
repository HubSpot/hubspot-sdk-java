// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListFolderCreateRequestTest {

    @Test
    fun create() {
        val listFolderCreateRequest =
            ListFolderCreateRequest.builder().name("name").parentFolderId("parentFolderId").build()

        assertThat(listFolderCreateRequest.name()).isEqualTo("name")
        assertThat(listFolderCreateRequest.parentFolderId()).contains("parentFolderId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val listFolderCreateRequest =
            ListFolderCreateRequest.builder().name("name").parentFolderId("parentFolderId").build()

        val roundtrippedListFolderCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(listFolderCreateRequest),
                jacksonTypeRef<ListFolderCreateRequest>(),
            )

        assertThat(roundtrippedListFolderCreateRequest).isEqualTo(listFolderCreateRequest)
    }
}
