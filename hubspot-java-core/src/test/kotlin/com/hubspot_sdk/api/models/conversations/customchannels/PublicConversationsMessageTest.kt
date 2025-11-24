// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicConversationsMessageTest {

    @Test
    fun create() {
        val publicConversationsMessage =
            PublicConversationsMessage.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .name("name")
                        .url("url")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .direction(PublicConversationsMessage.Direction.INCOMING)
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
                .text("text")
                .truncationStatus(PublicConversationsMessage.TruncationStatus.NOT_TRUNCATED)
                .type(PublicConversationsMessage.Type.MESSAGE)
                .inReplyToId("inReplyToId")
                .richText("richText")
                .status(
                    PublicMessageStatus.builder()
                        .statusType(PublicMessageStatus.StatusType.FAILED)
                        .failureDetails(
                            PublicMessageFailureDetails.builder()
                                .errorMessageTokens(
                                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .errorMessage("errorMessage")
                                .build()
                        )
                        .build()
                )
                .subject("subject")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(publicConversationsMessage.id()).isEqualTo("id")
        assertThat(publicConversationsMessage.archived()).isEqualTo(true)
        assertThat(publicConversationsMessage.attachments())
            .containsExactly(
                PublicConversationsMessage.Attachment.ofPublicFile(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .name("name")
                        .url("url")
                        .build()
                )
            )
        assertThat(publicConversationsMessage.channelAccountId()).isEqualTo("channelAccountId")
        assertThat(publicConversationsMessage.channelId()).isEqualTo("channelId")
        assertThat(publicConversationsMessage.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicConversationsMessage.conversationsThreadId())
            .isEqualTo("conversationsThreadId")
        assertThat(publicConversationsMessage.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicConversationsMessage.createdBy()).isEqualTo("createdBy")
        assertThat(publicConversationsMessage.direction())
            .isEqualTo(PublicConversationsMessage.Direction.INCOMING)
        assertThat(publicConversationsMessage.recipients())
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
        assertThat(publicConversationsMessage.senders())
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
        assertThat(publicConversationsMessage.text()).isEqualTo("text")
        assertThat(publicConversationsMessage.truncationStatus())
            .isEqualTo(PublicConversationsMessage.TruncationStatus.NOT_TRUNCATED)
        assertThat(publicConversationsMessage.type())
            .isEqualTo(PublicConversationsMessage.Type.MESSAGE)
        assertThat(publicConversationsMessage.inReplyToId()).contains("inReplyToId")
        assertThat(publicConversationsMessage.richText()).contains("richText")
        assertThat(publicConversationsMessage.status())
            .contains(
                PublicMessageStatus.builder()
                    .statusType(PublicMessageStatus.StatusType.FAILED)
                    .failureDetails(
                        PublicMessageFailureDetails.builder()
                            .errorMessageTokens(
                                PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .errorMessage("errorMessage")
                            .build()
                    )
                    .build()
            )
        assertThat(publicConversationsMessage.subject()).contains("subject")
        assertThat(publicConversationsMessage.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicConversationsMessage =
            PublicConversationsMessage.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .name("name")
                        .url("url")
                        .build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .client(
                    PublicClient.builder()
                        .clientType(PublicClient.ClientType.HUBSPOT)
                        .integrationAppId(0)
                        .build()
                )
                .conversationsThreadId("conversationsThreadId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("createdBy")
                .direction(PublicConversationsMessage.Direction.INCOMING)
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
                .text("text")
                .truncationStatus(PublicConversationsMessage.TruncationStatus.NOT_TRUNCATED)
                .type(PublicConversationsMessage.Type.MESSAGE)
                .inReplyToId("inReplyToId")
                .richText("richText")
                .status(
                    PublicMessageStatus.builder()
                        .statusType(PublicMessageStatus.StatusType.FAILED)
                        .failureDetails(
                            PublicMessageFailureDetails.builder()
                                .errorMessageTokens(
                                    PublicMessageFailureDetails.ErrorMessageTokens.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .errorMessage("errorMessage")
                                .build()
                        )
                        .build()
                )
                .subject("subject")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPublicConversationsMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicConversationsMessage),
                jacksonTypeRef<PublicConversationsMessage>(),
            )

        assertThat(roundtrippedPublicConversationsMessage).isEqualTo(publicConversationsMessage)
    }
}
