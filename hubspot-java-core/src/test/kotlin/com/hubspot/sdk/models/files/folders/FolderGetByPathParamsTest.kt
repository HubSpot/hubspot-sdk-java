// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.folders

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderGetByPathParamsTest {

    @Test
    fun create() {
        FolderGetByPathParams.builder().folderPath("folderPath").addProperty("string").build()
    }

    @Test
    fun pathParams() {
        val params = FolderGetByPathParams.builder().folderPath("folderPath").build()

        assertThat(params._pathParam(0)).isEqualTo("folderPath")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FolderGetByPathParams.builder().folderPath("folderPath").addProperty("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("properties", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderGetByPathParams.builder().folderPath("folderPath").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
