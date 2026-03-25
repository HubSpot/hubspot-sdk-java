// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageHeaderAttachmentTest {

    @Test
    fun create() {
        val messageHeaderAttachment =
            MessageHeaderAttachment.builder()
                .type(MessageHeaderAttachment.Type.MESSAGE_HEADER)
                .fileId(0L)
                .text("text")
                .build()

        assertThat(messageHeaderAttachment.type())
            .isEqualTo(MessageHeaderAttachment.Type.MESSAGE_HEADER)
        assertThat(messageHeaderAttachment.fileId()).contains(0L)
        assertThat(messageHeaderAttachment.text()).contains("text")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val messageHeaderAttachment =
            MessageHeaderAttachment.builder()
                .type(MessageHeaderAttachment.Type.MESSAGE_HEADER)
                .fileId(0L)
                .text("text")
                .build()

        val roundtrippedMessageHeaderAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageHeaderAttachment),
                jacksonTypeRef<MessageHeaderAttachment>(),
            )

        assertThat(roundtrippedMessageHeaderAttachment).isEqualTo(messageHeaderAttachment)
    }
}
