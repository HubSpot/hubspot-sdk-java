// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileassets

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileAssetGetImportTaskStatusParamsTest {

    @Test
    fun create() {
        FileAssetGetImportTaskStatusParams.builder().taskId("taskId").build()
    }

    @Test
    fun pathParams() {
        val params = FileAssetGetImportTaskStatusParams.builder().taskId("taskId").build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
