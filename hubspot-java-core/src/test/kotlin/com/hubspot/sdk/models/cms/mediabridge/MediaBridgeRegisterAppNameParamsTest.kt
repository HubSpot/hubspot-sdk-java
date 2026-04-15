// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeRegisterAppNameParamsTest {

    @Test
    fun create() {
        MediaBridgeRegisterAppNameParams.builder()
            .appId(0)
            .mediaBridgeProviderPartial(
                MediaBridgeProviderPartial.builder()
                    .updatedAt(0L)
                    .allowImportOnDisconnect(true)
                    .moduleName("moduleName")
                    .name("name")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MediaBridgeRegisterAppNameParams.builder()
                .appId(0)
                .mediaBridgeProviderPartial(
                    MediaBridgeProviderPartial.builder().updatedAt(0L).build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MediaBridgeRegisterAppNameParams.builder()
                .appId(0)
                .mediaBridgeProviderPartial(
                    MediaBridgeProviderPartial.builder()
                        .updatedAt(0L)
                        .allowImportOnDisconnect(true)
                        .moduleName("moduleName")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                MediaBridgeProviderPartial.builder()
                    .updatedAt(0L)
                    .allowImportOnDisconnect(true)
                    .moduleName("moduleName")
                    .name("name")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MediaBridgeRegisterAppNameParams.builder()
                .appId(0)
                .mediaBridgeProviderPartial(
                    MediaBridgeProviderPartial.builder().updatedAt(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MediaBridgeProviderPartial.builder().updatedAt(0L).build())
    }
}
