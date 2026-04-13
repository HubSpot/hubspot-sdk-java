// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicQuickRepliesTest {

    @Test
    fun create() {
        val publicQuickReplies =
            PublicQuickReplies.builder()
                .allowMultiSelect(true)
                .allowUserInput(true)
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType(QuickReply.ValueType.TEXT)
                        .label("label")
                        .build()
                )
                .type(PublicQuickReplies.Type.QUICK_REPLIES)
                .build()

        assertThat(publicQuickReplies.allowMultiSelect()).isEqualTo(true)
        assertThat(publicQuickReplies.allowUserInput()).isEqualTo(true)
        assertThat(publicQuickReplies.quickReplies())
            .containsExactly(
                QuickReply.builder()
                    .value("value")
                    .valueType(QuickReply.ValueType.TEXT)
                    .label("label")
                    .build()
            )
        assertThat(publicQuickReplies.type()).isEqualTo(PublicQuickReplies.Type.QUICK_REPLIES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicQuickReplies =
            PublicQuickReplies.builder()
                .allowMultiSelect(true)
                .allowUserInput(true)
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType(QuickReply.ValueType.TEXT)
                        .label("label")
                        .build()
                )
                .type(PublicQuickReplies.Type.QUICK_REPLIES)
                .build()

        val roundtrippedPublicQuickReplies =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicQuickReplies),
                jacksonTypeRef<PublicQuickReplies>(),
            )

        assertThat(roundtrippedPublicQuickReplies).isEqualTo(publicQuickReplies)
    }
}
