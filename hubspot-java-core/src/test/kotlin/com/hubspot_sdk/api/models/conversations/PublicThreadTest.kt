// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicThreadTest {

    @Test
    fun create() {
        val publicThread =
            PublicThread.builder()
                .id("id")
                .archived(true)
                .associatedContactId("associatedContactId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inboxId("inboxId")
                .originalChannelAccountId("originalChannelAccountId")
                .originalChannelId("originalChannelId")
                .spam(true)
                .status(PublicThread.Status.CLOSED)
                .assignedTo("assignedTo")
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageReceivedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageSentTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .threadAssociations(
                    PublicThreadAssociations.builder()
                        .associatedTicketId("associatedTicketId")
                        .build()
                )
                .build()

        assertThat(publicThread.id()).isEqualTo("id")
        assertThat(publicThread.archived()).isEqualTo(true)
        assertThat(publicThread.associatedContactId()).isEqualTo("associatedContactId")
        assertThat(publicThread.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThread.inboxId()).isEqualTo("inboxId")
        assertThat(publicThread.originalChannelAccountId()).isEqualTo("originalChannelAccountId")
        assertThat(publicThread.originalChannelId()).isEqualTo("originalChannelId")
        assertThat(publicThread.spam()).isEqualTo(true)
        assertThat(publicThread.status()).isEqualTo(PublicThread.Status.CLOSED)
        assertThat(publicThread.assignedTo()).contains("assignedTo")
        assertThat(publicThread.closedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThread.latestMessageReceivedTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThread.latestMessageSentTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThread.latestMessageTimestamp())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThread.threadAssociations())
            .contains(
                PublicThreadAssociations.builder().associatedTicketId("associatedTicketId").build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicThread =
            PublicThread.builder()
                .id("id")
                .archived(true)
                .associatedContactId("associatedContactId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inboxId("inboxId")
                .originalChannelAccountId("originalChannelAccountId")
                .originalChannelId("originalChannelId")
                .spam(true)
                .status(PublicThread.Status.CLOSED)
                .assignedTo("assignedTo")
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageReceivedTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageSentTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .latestMessageTimestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .threadAssociations(
                    PublicThreadAssociations.builder()
                        .associatedTicketId("associatedTicketId")
                        .build()
                )
                .build()

        val roundtrippedPublicThread =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicThread),
                jacksonTypeRef<PublicThread>(),
            )

        assertThat(roundtrippedPublicThread).isEqualTo(publicThread)
    }
}
