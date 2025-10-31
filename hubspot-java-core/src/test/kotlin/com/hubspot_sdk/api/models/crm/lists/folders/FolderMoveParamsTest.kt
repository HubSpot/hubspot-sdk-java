// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.lists.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderMoveParamsTest {

    @Test
    fun create() {
        FolderMoveParams.builder()
            .folderId("folderId")
            .newParentFolderId("newParentFolderId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FolderMoveParams.builder()
                .folderId("folderId")
                .newParentFolderId("newParentFolderId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("folderId")
        assertThat(params._pathParam(1)).isEqualTo("newParentFolderId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
