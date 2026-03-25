// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeDeletePropertyParamsTest {

    @Test
    fun create() {
        MediaBridgeDeletePropertyParams.builder()
            .appId("appId")
            .objectType("objectType")
            .propertyName("propertyName")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeDeletePropertyParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("propertyName")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
