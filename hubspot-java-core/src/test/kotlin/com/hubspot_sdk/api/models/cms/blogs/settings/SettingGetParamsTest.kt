// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.settings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SettingGetParamsTest {

    @Test
    fun create() {
        SettingGetParams.builder().blogId("blogId").build()
    }

    @Test
    fun pathParams() {
        val params = SettingGetParams.builder().blogId("blogId").build()

        assertThat(params._pathParam(0)).isEqualTo("blogId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
