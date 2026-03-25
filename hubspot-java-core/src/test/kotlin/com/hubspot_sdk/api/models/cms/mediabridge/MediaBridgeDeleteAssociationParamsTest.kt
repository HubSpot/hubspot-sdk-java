// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeDeleteAssociationParamsTest {

    @Test
    fun create() {
        MediaBridgeDeleteAssociationParams.builder()
            .appId("appId")
            .objectType("objectType")
            .associationId("associationId")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeDeleteAssociationParams.builder()
                .appId("appId")
                .objectType("objectType")
                .associationId("associationId")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("appId")
        assertThat(params._pathParam(1)).isEqualTo("objectType")
        assertThat(params._pathParam(2)).isEqualTo("associationId")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
