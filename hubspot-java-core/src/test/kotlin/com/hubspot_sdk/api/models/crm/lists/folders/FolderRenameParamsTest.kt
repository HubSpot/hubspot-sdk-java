// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.folders

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderRenameParamsTest {

    @Test
    fun create() {
        FolderRenameParams.builder().folderId("folderId").newFolderName("newFolderName").build()
    }

    @Test
    fun pathParams() {
        val params = FolderRenameParams.builder().folderId("folderId").build()

        assertThat(params._pathParam(0)).isEqualTo("folderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FolderRenameParams.builder().folderId("folderId").newFolderName("newFolderName").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("newFolderName", "newFolderName").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderRenameParams.builder().folderId("folderId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
