// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicThreadInboxChangeTest {

    @Test
    fun create() {
        val publicThreadInboxChange =
            PublicThreadInboxChange.builder()
                .id("id")
                .archived(true)
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .fromInboxId("fromInboxId")
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .toInboxId("toInboxId")
                .type(PublicThreadInboxChange.Type.THREAD_INBOX_CHANGE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicThreadInboxChange.id()).isEqualTo("id")
        assertThat(publicThreadInboxChange.archived()).isEqualTo(true)
        assertThat(publicThreadInboxChange.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicThreadInboxChange.conversationsThreadId())
            .isEqualTo("conversationsThreadId")
        assertThat(publicThreadInboxChange.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThreadInboxChange.createdBy()).isEqualTo("createdBy")
        assertThat(publicThreadInboxChange.fromInboxId()).isEqualTo("fromInboxId")
        assertThat(publicThreadInboxChange.recipients())
            .containsExactly(
                PublicRecipient.builder()
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .actorId("actorId")
                    .name("name")
                    .recipientField("recipientField")
                    .build()
            )
        assertThat(publicThreadInboxChange.senders())
            .containsExactly(
                PublicSender.builder()
                    .actorId("actorId")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .name("name")
                    .senderField("senderField")
                    .build()
            )
        assertThat(publicThreadInboxChange.toInboxId()).isEqualTo("toInboxId")
        assertThat(publicThreadInboxChange.type())
            .isEqualTo(PublicThreadInboxChange.Type.THREAD_INBOX_CHANGE)
        assertThat(publicThreadInboxChange.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicThreadInboxChange =
            PublicThreadInboxChange.builder()
                .id("id")
                .archived(true)
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .fromInboxId("fromInboxId")
                .addRecipient(
                    PublicRecipient.builder()
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .addSender(
                    PublicSender.builder()
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .senderField("senderField")
                        .build()
                )
                .toInboxId("toInboxId")
                .type(PublicThreadInboxChange.Type.THREAD_INBOX_CHANGE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicThreadInboxChange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicThreadInboxChange),
                jacksonTypeRef<PublicThreadInboxChange>(),
            )

        assertThat(roundtrippedPublicThreadInboxChange).isEqualTo(publicThreadInboxChange)
    }
}
