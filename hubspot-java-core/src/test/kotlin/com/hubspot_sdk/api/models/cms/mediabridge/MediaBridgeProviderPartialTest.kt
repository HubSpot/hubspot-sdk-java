// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeProviderPartialTest {

    @Test
    fun create() {
        val mediaBridgeProviderPartial =
            MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()

        assertThat(mediaBridgeProviderPartial.updatedAt()).isEqualTo(0L)
        assertThat(mediaBridgeProviderPartial.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBridgeProviderPartial =
            MediaBridgeProviderPartial.builder().updatedAt(0L).name("name").build()

        val roundtrippedMediaBridgeProviderPartial =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBridgeProviderPartial),
                jacksonTypeRef<MediaBridgeProviderPartial>(),
            )

        assertThat(roundtrippedMediaBridgeProviderPartial).isEqualTo(mediaBridgeProviderPartial)
    }
}
