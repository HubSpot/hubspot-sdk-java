// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileassets

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetGetParamsTest {

    @Test
    fun create() {
        FileAssetGetParams.builder().fileId("321669910225").addProperty("string").build()
    }

    @Test
    fun pathParams() {
        val params = FileAssetGetParams.builder().fileId("321669910225").build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileAssetGetParams.builder().fileId("321669910225").addProperty("string").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("properties", listOf("string").joinToString(",")).build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileAssetGetParams.builder().fileId("321669910225").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
