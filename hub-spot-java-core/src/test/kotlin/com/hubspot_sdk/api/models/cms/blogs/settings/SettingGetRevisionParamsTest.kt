// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingGetRevisionParamsTest {

    @Test
    fun create() {
        SettingGetRevisionParams.builder().blogId("blogId").revisionId("revisionId").build()
    }

    @Test
    fun pathParams() {
        val params =
            SettingGetRevisionParams.builder().blogId("blogId").revisionId("revisionId").build()

        assertThat(params._pathParam(0)).isEqualTo("blogId")
        assertThat(params._pathParam(1)).isEqualTo("revisionId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
