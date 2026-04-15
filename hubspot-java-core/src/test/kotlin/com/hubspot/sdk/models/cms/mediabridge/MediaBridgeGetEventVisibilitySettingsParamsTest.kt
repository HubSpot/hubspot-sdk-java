// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetEventVisibilitySettingsParamsTest {

    @Test
    fun create() {
        MediaBridgeGetEventVisibilitySettingsParams.builder().appId(0).build()
    }

    @Test
    fun pathParams() {
        val params = MediaBridgeGetEventVisibilitySettingsParams.builder().appId(0).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
