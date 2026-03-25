// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UnsupportedContentAttachmentTest {

    @Test
    fun create() {
        val unsupportedContentAttachment =
            UnsupportedContentAttachment.builder()
                .type(UnsupportedContentAttachment.Type.UNSUPPORTED_CONTENT)
                .build()

        assertThat(unsupportedContentAttachment.type())
            .isEqualTo(UnsupportedContentAttachment.Type.UNSUPPORTED_CONTENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val unsupportedContentAttachment =
            UnsupportedContentAttachment.builder()
                .type(UnsupportedContentAttachment.Type.UNSUPPORTED_CONTENT)
                .build()

        val roundtrippedUnsupportedContentAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unsupportedContentAttachment),
                jacksonTypeRef<UnsupportedContentAttachment>(),
            )

        assertThat(roundtrippedUnsupportedContentAttachment).isEqualTo(unsupportedContentAttachment)
    }
}
