// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.crm.lists

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ListDeleteFolderParamsTest {

    @Test
    fun create() {
        ListDeleteFolderParams.builder().folderId("folderId").build()
    }

    @Test
    fun pathParams() {
        val params = ListDeleteFolderParams.builder().folderId("folderId").build()

        assertThat(params._pathParam(0)).isEqualTo("folderId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
