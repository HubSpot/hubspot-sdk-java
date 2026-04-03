// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileassets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetDeleteParamsTest {

    @Test
    fun create() {
        FileAssetDeleteParams.builder().fileId("321669910225").build()
    }

    @Test
    fun pathParams() {
        val params = FileAssetDeleteParams.builder().fileId("321669910225").build()

        assertThat(params._pathParam(0)).isEqualTo("321669910225")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
