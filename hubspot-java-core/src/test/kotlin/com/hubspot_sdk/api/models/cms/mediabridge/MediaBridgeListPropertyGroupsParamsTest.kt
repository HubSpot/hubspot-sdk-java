// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeListPropertyGroupsParamsTest {

    @Test
    fun create() {
        MediaBridgeListPropertyGroupsParams.builder().appId(0).objectType("objectType").build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeListPropertyGroupsParams.builder().appId(0).objectType("objectType").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
