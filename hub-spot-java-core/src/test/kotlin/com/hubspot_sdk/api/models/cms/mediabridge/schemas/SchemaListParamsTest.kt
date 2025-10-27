// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.schemas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SchemaListParamsTest {

    @Test
    fun create() {
        SchemaListParams.builder().appId("appId").build()
    }

    @Test
    fun pathParams() {
        val params = SchemaListParams.builder().appId("appId").build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
