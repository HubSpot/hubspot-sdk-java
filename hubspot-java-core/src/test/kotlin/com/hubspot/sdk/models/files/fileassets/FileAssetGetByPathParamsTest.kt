// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.fileassets

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetGetByPathParamsTest {

    @Test
    fun create() {
        FileAssetGetByPathParams.builder().path("path").addProperty("string").build()
    }

    @Test
    fun pathParams() {
        val params = FileAssetGetByPathParams.builder().path("path").build()

        assertThat(params._pathParam(0)).isEqualTo("path")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = FileAssetGetByPathParams.builder().path("path").addProperty("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("properties", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileAssetGetByPathParams.builder().path("path").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
