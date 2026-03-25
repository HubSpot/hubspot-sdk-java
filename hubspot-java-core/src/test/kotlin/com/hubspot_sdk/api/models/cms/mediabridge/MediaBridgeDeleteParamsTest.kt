// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeDeleteParamsTest {

    @Test
    fun create() {
        MediaBridgeDeleteParams.builder()
            .mediaType(MediaBridgeDeleteParams.MediaType.AUDIO)
            .objectId(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeDeleteParams.builder()
                .mediaType(MediaBridgeDeleteParams.MediaType.AUDIO)
                .objectId(0L)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("AUDIO")
        assertThat(params._pathParam(1)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
