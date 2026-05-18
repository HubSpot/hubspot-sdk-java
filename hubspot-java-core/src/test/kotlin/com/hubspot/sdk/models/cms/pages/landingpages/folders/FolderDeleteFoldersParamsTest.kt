// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.pages.landingpages.folders

import com.hubspot.sdk.models.BatchInputString
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderDeleteFoldersParamsTest {

    @Test
    fun create() {
        FolderDeleteFoldersParams.builder()
            .batchInputString(BatchInputString.builder().addInput("string").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            FolderDeleteFoldersParams.builder()
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(BatchInputString.builder().addInput("string").build())
    }
}
