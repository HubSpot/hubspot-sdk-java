// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetSchemaParamsTest {

    @Test
    fun create() {
        MediaBridgeGetSchemaParams.builder().appId("appId").objectType("objectType").build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeGetSchemaParams.builder().appId("appId").objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
