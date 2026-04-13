// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicMessageHeaderTest {

    @Test
    fun create() {
        val publicMessageHeader =
            PublicMessageHeader.builder()
                .type(PublicMessageHeader.Type.MESSAGE_HEADER)
                .fileId(0L)
                .text("text")
                .build()

        assertThat(publicMessageHeader.type()).isEqualTo(PublicMessageHeader.Type.MESSAGE_HEADER)
        assertThat(publicMessageHeader.fileId()).contains(0L)
        assertThat(publicMessageHeader.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageHeader =
            PublicMessageHeader.builder()
                .type(PublicMessageHeader.Type.MESSAGE_HEADER)
                .fileId(0L)
                .text("text")
                .build()

        val roundtrippedPublicMessageHeader =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageHeader),
                jacksonTypeRef<PublicMessageHeader>(),
            )

        assertThat(roundtrippedPublicMessageHeader).isEqualTo(publicMessageHeader)
    }
}
