// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.crm.lists

import com.hubspot.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListListFoldersParamsTest {

    @Test
    fun create() {
        ListListFoldersParams.builder().folderId("folderId").build()
    }

    @Test
    fun queryParams() {
        val params = ListListFoldersParams.builder().folderId("folderId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("folderId", "folderId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ListListFoldersParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
