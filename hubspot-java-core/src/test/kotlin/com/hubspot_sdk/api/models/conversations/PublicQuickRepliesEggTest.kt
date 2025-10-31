// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicQuickRepliesEggTest {

    @Test
    fun create() {
        val publicQuickRepliesEgg =
            PublicQuickRepliesEgg.builder()
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType("valueType")
                        .label("label")
                        .build()
                )
                .type(PublicQuickRepliesEgg.Type.QUICK_REPLIES)
                .build()

        assertThat(publicQuickRepliesEgg.quickReplies())
            .containsExactly(
                QuickReply.builder().value("value").valueType("valueType").label("label").build()
            )
        assertThat(publicQuickRepliesEgg.type()).isEqualTo(PublicQuickRepliesEgg.Type.QUICK_REPLIES)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicQuickRepliesEgg =
            PublicQuickRepliesEgg.builder()
                .addQuickReply(
                    QuickReply.builder()
                        .value("value")
                        .valueType("valueType")
                        .label("label")
                        .build()
                )
                .type(PublicQuickRepliesEgg.Type.QUICK_REPLIES)
                .build()

        val roundtrippedPublicQuickRepliesEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicQuickRepliesEgg),
                jacksonTypeRef<PublicQuickRepliesEgg>(),
            )

        assertThat(roundtrippedPublicQuickRepliesEgg).isEqualTo(publicQuickRepliesEgg)
    }
}
