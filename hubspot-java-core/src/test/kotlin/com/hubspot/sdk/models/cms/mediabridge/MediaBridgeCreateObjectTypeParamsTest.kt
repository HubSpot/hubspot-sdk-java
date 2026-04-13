// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeCreateObjectTypeParamsTest {

    @Test
    fun create() {
        MediaBridgeCreateObjectTypeParams.builder()
            .appId(0)
            .integratorObjectCreationRequest(
                IntegratorObjectCreationRequest.builder()
                    .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeCreateObjectTypeParams.builder()
                .appId(0)
                .integratorObjectCreationRequest(
                    IntegratorObjectCreationRequest.builder()
                        .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeCreateObjectTypeParams.builder()
                .appId(0)
                .integratorObjectCreationRequest(
                    IntegratorObjectCreationRequest.builder()
                        .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                IntegratorObjectCreationRequest.builder()
                    .addMediaType(IntegratorObjectCreationRequest.MediaType.VIDEO)
                    .build()
            )
    }
}
