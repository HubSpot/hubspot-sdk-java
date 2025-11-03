// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelsPublicFileTest {

    @Test
    fun create() {
        val customChannelsPublicFile =
            CustomChannelsPublicFile.builder()
                .fileId("fileId")
                .fileUsageType("fileUsageType")
                .type(CustomChannelsPublicFile.Type.FILE)
                .name("name")
                .url("url")
                .build()

        assertThat(customChannelsPublicFile.fileId()).isEqualTo("fileId")
        assertThat(customChannelsPublicFile.fileUsageType()).isEqualTo("fileUsageType")
        assertThat(customChannelsPublicFile.type()).isEqualTo(CustomChannelsPublicFile.Type.FILE)
        assertThat(customChannelsPublicFile.name()).contains("name")
        assertThat(customChannelsPublicFile.url()).contains("url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customChannelsPublicFile =
            CustomChannelsPublicFile.builder()
                .fileId("fileId")
                .fileUsageType("fileUsageType")
                .type(CustomChannelsPublicFile.Type.FILE)
                .name("name")
                .url("url")
                .build()

        val roundtrippedCustomChannelsPublicFile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customChannelsPublicFile),
                jacksonTypeRef<CustomChannelsPublicFile>(),
            )

        assertThat(roundtrippedCustomChannelsPublicFile).isEqualTo(customChannelsPublicFile)
    }
}
