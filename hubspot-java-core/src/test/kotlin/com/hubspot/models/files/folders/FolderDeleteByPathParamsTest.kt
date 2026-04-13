// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.files.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderDeleteByPathParamsTest {

    @Test
    fun create() {
        FolderDeleteByPathParams.builder().folderPath("folderPath").build()
    }

    @Test
    fun pathParams() {
        val params = FolderDeleteByPathParams.builder().folderPath("folderPath").build()

        assertThat(params._pathParam(0)).isEqualTo("folderPath")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
