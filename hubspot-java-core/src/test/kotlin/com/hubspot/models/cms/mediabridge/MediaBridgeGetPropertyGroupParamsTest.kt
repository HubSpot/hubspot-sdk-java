// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetPropertyGroupParamsTest {

    @Test
    fun create() {
        MediaBridgeGetPropertyGroupParams.builder()
            .appId(0)
            .objectType("objectType")
            .groupName("groupName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeGetPropertyGroupParams.builder()
                .appId(0)
                .objectType("objectType")
                .groupName("groupName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("groupName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
