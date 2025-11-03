// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationsPublicChannelAccountTest {

    @Test
    fun create() {
        val conversationsPublicChannelAccount =
            ConversationsPublicChannelAccount.builder()
                .archived(true)
                .id("id")
                .active(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorized(true)
                .channelId("channelId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .inboxId("inboxId")
                .name("name")
                .build()

        assertThat(conversationsPublicChannelAccount.archived()).isEqualTo(true)
        assertThat(conversationsPublicChannelAccount.id()).contains("id")
        assertThat(conversationsPublicChannelAccount.active()).contains(true)
        assertThat(conversationsPublicChannelAccount.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conversationsPublicChannelAccount.authorized()).contains(true)
        assertThat(conversationsPublicChannelAccount.channelId()).contains("channelId")
        assertThat(conversationsPublicChannelAccount.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conversationsPublicChannelAccount.deliveryIdentifier())
            .contains(PublicDeliveryIdentifier.builder().type("type").value("value").build())
        assertThat(conversationsPublicChannelAccount.inboxId()).contains("inboxId")
        assertThat(conversationsPublicChannelAccount.name()).contains("name")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conversationsPublicChannelAccount =
            ConversationsPublicChannelAccount.builder()
                .archived(true)
                .id("id")
                .active(true)
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .authorized(true)
                .channelId("channelId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .inboxId("inboxId")
                .name("name")
                .build()

        val roundtrippedConversationsPublicChannelAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conversationsPublicChannelAccount),
                jacksonTypeRef<ConversationsPublicChannelAccount>(),
            )

        assertThat(roundtrippedConversationsPublicChannelAccount)
            .isEqualTo(conversationsPublicChannelAccount)
    }
}
