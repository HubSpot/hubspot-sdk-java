// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.files.fileassets

import com.hubspot.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetGetSignedUrlParamsTest {

    @Test
    fun create() {
        FileAssetGetSignedUrlParams.builder()
            .fileId("321669910225")
            .expirationSeconds(0L)
            .size(FileAssetGetSignedUrlParams.Size.ICON)
            .upscale(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileAssetGetSignedUrlParams.builder().fileId("321669910225").build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FileAssetGetSignedUrlParams.builder()
                .fileId("321669910225")
                .expirationSeconds(0L)
                .size(FileAssetGetSignedUrlParams.Size.ICON)
                .upscale(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("expirationSeconds", "0")
                    .put("size", "icon")
                    .put("upscale", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileAssetGetSignedUrlParams.builder().fileId("321669910225").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
