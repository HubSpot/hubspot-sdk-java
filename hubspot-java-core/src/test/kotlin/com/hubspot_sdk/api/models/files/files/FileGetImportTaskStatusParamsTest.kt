// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileGetImportTaskStatusParamsTest {

    @Test
    fun create() {
        FileGetImportTaskStatusParams.builder().taskId("taskId").build()
    }

    @Test
    fun pathParams() {
        val params = FileGetImportTaskStatusParams.builder().taskId("taskId").build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
