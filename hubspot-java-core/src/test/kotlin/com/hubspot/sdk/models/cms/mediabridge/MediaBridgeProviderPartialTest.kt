// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MediaBridgeProviderPartialTest {

    @Test
    fun create() {
        val mediaBridgeProviderPartial =
            MediaBridgeProviderPartial.builder()
                .updatedAt(0L)
                .allowImportOnDisconnect(true)
                .moduleName("moduleName")
                .name("name")
                .build()

        assertThat(mediaBridgeProviderPartial.updatedAt()).isEqualTo(0L)
        assertThat(mediaBridgeProviderPartial.allowImportOnDisconnect()).contains(true)
        assertThat(mediaBridgeProviderPartial.moduleName()).contains("moduleName")
        assertThat(mediaBridgeProviderPartial.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mediaBridgeProviderPartial =
            MediaBridgeProviderPartial.builder()
                .updatedAt(0L)
                .allowImportOnDisconnect(true)
                .moduleName("moduleName")
                .name("name")
                .build()

        val roundtrippedMediaBridgeProviderPartial =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mediaBridgeProviderPartial),
                jacksonTypeRef<MediaBridgeProviderPartial>(),
            )

        assertThat(roundtrippedMediaBridgeProviderPartial).isEqualTo(mediaBridgeProviderPartial)
    }
}
