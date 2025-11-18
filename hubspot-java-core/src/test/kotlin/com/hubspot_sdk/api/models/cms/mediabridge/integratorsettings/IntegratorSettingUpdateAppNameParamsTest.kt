// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings

import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderPartial
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntegratorSettingUpdateAppNameParamsTest {

    @Test
    fun create() {
        IntegratorSettingUpdateAppNameParams.builder()
            .appId(0)
            .mediaBridgeProviderPartial(
                MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            IntegratorSettingUpdateAppNameParams.builder()
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
            IntegratorSettingUpdateAppNameParams.builder()
                .appId(0)
                .mediaBridgeProviderPartial(
                    MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            IntegratorSettingUpdateAppNameParams.builder()
                .appId(0)
                .mediaBridgeProviderPartial(
                    MediaBridgeProviderPartial.builder().updatedAt(0L).build()
                )
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(MediaBridgeProviderPartial.builder().updatedAt(0L).build())
    }
}
