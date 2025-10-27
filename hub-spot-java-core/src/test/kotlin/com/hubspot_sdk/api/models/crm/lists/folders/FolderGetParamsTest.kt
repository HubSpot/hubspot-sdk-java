// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.folders

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderGetParamsTest {

    @Test
    fun create() {
        FolderGetParams.builder().folderId("folderId").build()
    }

    @Test
    fun queryParams() {
        val params = FolderGetParams.builder().folderId("folderId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("folderId", "folderId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderGetParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
