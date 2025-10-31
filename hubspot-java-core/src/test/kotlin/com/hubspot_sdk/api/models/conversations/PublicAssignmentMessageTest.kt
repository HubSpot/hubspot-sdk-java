// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicAssignmentMessageTest {

    @Test
    fun create() {
        val publicAssignmentMessage =
            PublicAssignmentMessage.builder()
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
                .type(PublicAssignmentMessage.Type.ASSIGNMENT)
                .assignedFrom("assignedFrom")
                .assignedTo("assignedTo")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicAssignmentMessage.id()).isEqualTo("id")
        assertThat(publicAssignmentMessage.archived()).isEqualTo(true)
        assertThat(publicAssignmentMessage.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicAssignmentMessage.conversationsThreadId())
            .isEqualTo("conversationsThreadId")
        assertThat(publicAssignmentMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicAssignmentMessage.createdBy()).isEqualTo("createdBy")
        assertThat(publicAssignmentMessage.recipients())
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
        assertThat(publicAssignmentMessage.senders())
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
        assertThat(publicAssignmentMessage.type())
            .isEqualTo(PublicAssignmentMessage.Type.ASSIGNMENT)
        assertThat(publicAssignmentMessage.assignedFrom()).contains("assignedFrom")
        assertThat(publicAssignmentMessage.assignedTo()).contains("assignedTo")
        assertThat(publicAssignmentMessage.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicAssignmentMessage =
            PublicAssignmentMessage.builder()
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
                .type(PublicAssignmentMessage.Type.ASSIGNMENT)
                .assignedFrom("assignedFrom")
                .assignedTo("assignedTo")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicAssignmentMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicAssignmentMessage),
                jacksonTypeRef<PublicAssignmentMessage>(),
            )

        assertThat(roundtrippedPublicAssignmentMessage).isEqualTo(publicAssignmentMessage)
    }
}
