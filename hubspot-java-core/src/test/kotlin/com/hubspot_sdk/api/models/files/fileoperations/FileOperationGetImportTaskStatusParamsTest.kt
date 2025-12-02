// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.files.fileoperations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileOperationGetImportTaskStatusParamsTest {

    @Test
    fun create() {
        FileOperationGetImportTaskStatusParams.builder().taskId("taskId").build()
    }

    @Test
    fun pathParams() {
        val params = FileOperationGetImportTaskStatusParams.builder().taskId("taskId").build()

        assertThat(params._pathParam(0)).isEqualTo("taskId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
