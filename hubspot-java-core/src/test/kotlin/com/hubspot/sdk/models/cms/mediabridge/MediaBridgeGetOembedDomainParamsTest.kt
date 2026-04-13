// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeGetOembedDomainParamsTest {

    @Test
    fun create() {
        MediaBridgeGetOembedDomainParams.builder().appId(0).oEmbedDomainId("oEmbedDomainId").build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeGetOembedDomainParams.builder()
                .appId(0)
                .oEmbedDomainId("oEmbedDomainId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("oEmbedDomainId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
