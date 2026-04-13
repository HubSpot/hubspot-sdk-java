// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeProviderRegistrationResponseTest {

    @Test
    fun create() {
        val mediaBridgeProviderRegistrationResponse =
            MediaBridgeProviderRegistrationResponse.builder().appId(0).name("name").build()

        assertThat(mediaBridgeProviderRegistrationResponse.appId()).isEqualTo(0)
        assertThat(mediaBridgeProviderRegistrationResponse.name()).isEqualTo("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBridgeProviderRegistrationResponse =
            MediaBridgeProviderRegistrationResponse.builder().appId(0).name("name").build()

        val roundtrippedMediaBridgeProviderRegistrationResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBridgeProviderRegistrationResponse),
                jacksonTypeRef<MediaBridgeProviderRegistrationResponse>(),
            )

        assertThat(roundtrippedMediaBridgeProviderRegistrationResponse)
            .isEqualTo(mediaBridgeProviderRegistrationResponse)
    }
}
