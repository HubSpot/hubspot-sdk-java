// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.conversations.QuickReply
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuickRepliesAttachmentTest {

    @Test
    fun create() {
        val quickRepliesAttachment =
            QuickRepliesAttachment.builder()
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType("valueType")
                        .label("label")
                        .build()
                )
                .type(QuickRepliesAttachment.Type.QUICK_REPLIES)
                .build()

        assertThat(quickRepliesAttachment.quickReplies())
            .containsExactly(
                QuickReply.builder().value("value").valueType("valueType").label("label").build()
            )
        assertThat(quickRepliesAttachment.type())
            .isEqualTo(QuickRepliesAttachment.Type.QUICK_REPLIES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quickRepliesAttachment =
            QuickRepliesAttachment.builder()
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType("valueType")
                        .label("label")
                        .build()
                )
                .type(QuickRepliesAttachment.Type.QUICK_REPLIES)
                .build()

        val roundtrippedQuickRepliesAttachment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quickRepliesAttachment),
                jacksonTypeRef<QuickRepliesAttachment>(),
            )

        assertThat(roundtrippedQuickRepliesAttachment).isEqualTo(quickRepliesAttachment)
    }
}
