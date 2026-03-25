// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuickReplyTest {

    @Test
    fun create() {
        val quickReply =
            QuickReply.builder()
                .value("value")
                .valueType(QuickReply.ValueType.TEXT)
                .label("label")
                .build()

        assertThat(quickReply.value()).isEqualTo("value")
        assertThat(quickReply.valueType()).isEqualTo(QuickReply.ValueType.TEXT)
        assertThat(quickReply.label()).contains("label")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quickReply =
            QuickReply.builder()
                .value("value")
                .valueType(QuickReply.ValueType.TEXT)
                .label("label")
                .build()

        val roundtrippedQuickReply =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quickReply),
                jacksonTypeRef<QuickReply>(),
            )

        assertThat(roundtrippedQuickReply).isEqualTo(quickReply)
    }
}
