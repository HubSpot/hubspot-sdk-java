// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicThreadStatusChangeTest {

    @Test
    fun create() {
        val publicThreadStatusChange =
            PublicThreadStatusChange.builder()
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
                .newStatus(PublicThreadStatusChange.NewStatus.OPEN)
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
                .type(PublicThreadStatusChange.Type.THREAD_STATUS_CHANGE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicThreadStatusChange.id()).isEqualTo("id")
        assertThat(publicThreadStatusChange.archived()).isEqualTo(true)
        assertThat(publicThreadStatusChange.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicThreadStatusChange.conversationsThreadId())
            .isEqualTo("conversationsThreadId")
        assertThat(publicThreadStatusChange.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicThreadStatusChange.createdBy()).isEqualTo("createdBy")
        assertThat(publicThreadStatusChange.newStatus())
            .isEqualTo(PublicThreadStatusChange.NewStatus.OPEN)
        assertThat(publicThreadStatusChange.recipients())
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
        assertThat(publicThreadStatusChange.senders())
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
        assertThat(publicThreadStatusChange.type())
            .isEqualTo(PublicThreadStatusChange.Type.THREAD_STATUS_CHANGE)
        assertThat(publicThreadStatusChange.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicThreadStatusChange =
            PublicThreadStatusChange.builder()
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
                .newStatus(PublicThreadStatusChange.NewStatus.OPEN)
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
                .type(PublicThreadStatusChange.Type.THREAD_STATUS_CHANGE)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicThreadStatusChange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicThreadStatusChange),
                jacksonTypeRef<PublicThreadStatusChange>(),
            )

        assertThat(roundtrippedPublicThreadStatusChange).isEqualTo(publicThreadStatusChange)
    }
}
