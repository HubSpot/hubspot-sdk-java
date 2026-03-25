// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.mediabridge

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VideoObjectTest {

    @Test
    fun create() {
        val videoObject = VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build()

        assertThat(videoObject.id()).isEqualTo(0)
        assertThat(videoObject.deeplinkUrl()).isEqualTo("deeplinkUrl")
        assertThat(videoObject.fileId()).isEqualTo(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val videoObject = VideoObject.builder().id(0).deeplinkUrl("deeplinkUrl").fileId(0).build()

        val roundtrippedVideoObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(videoObject),
                jacksonTypeRef<VideoObject>(),
            )

        assertThat(roundtrippedVideoObject).isEqualTo(videoObject)
    }
}
