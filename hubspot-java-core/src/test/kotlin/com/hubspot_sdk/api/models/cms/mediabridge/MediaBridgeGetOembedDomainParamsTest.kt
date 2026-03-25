// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetOembedDomainParamsTest {

    @Test
    fun create() {
        MediaBridgeGetOembedDomainParams.builder()
            .appId("appId")
            .oEmbedDomainId("oEmbedDomainId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeGetOembedDomainParams.builder()
                .appId("appId")
                .oEmbedDomainId("oEmbedDomainId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("oEmbedDomainId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
