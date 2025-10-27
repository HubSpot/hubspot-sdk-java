// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PublicMessageTest {

    @Test
    fun ofConversations() {
        val conversations =
            PublicConversationsMessage.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
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
                        .statusType(PublicMessageStatus.StatusType.SENT)
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

        val publicMessage = PublicMessage.ofConversations(conversations)

        assertThat(publicMessage.conversations()).contains(conversations)
        assertThat(publicMessage.comment()).isEmpty
        assertThat(publicMessage.welcome()).isEmpty
        assertThat(publicMessage.assignment()).isEmpty
        assertThat(publicMessage.threadStatusChange()).isEmpty
        assertThat(publicMessage.threadInboxChange()).isEmpty
    }

    @Test
    fun ofConversationsRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofConversations(
                PublicConversationsMessage.builder()
                    .id("id")
                    .archived(true)
                    .addAttachment(
                        PublicFile.builder()
                            .fileId("fileId")
                            .fileUsageType("fileUsageType")
                            .type(PublicFile.Type.FILE)
                            .url("url")
                            .name("name")
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                            .statusType(PublicMessageStatus.StatusType.SENT)
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
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    @Test
    fun ofComment() {
        val comment =
            PublicComment.builder()
                .id("id")
                .archived(true)
                .addAttachment(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
                        .build()
                )
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
                .richText("richText")
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
                .type(PublicComment.Type.COMMENT)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val publicMessage = PublicMessage.ofComment(comment)

        assertThat(publicMessage.conversations()).isEmpty
        assertThat(publicMessage.comment()).contains(comment)
        assertThat(publicMessage.welcome()).isEmpty
        assertThat(publicMessage.assignment()).isEmpty
        assertThat(publicMessage.threadStatusChange()).isEmpty
        assertThat(publicMessage.threadInboxChange()).isEmpty
    }

    @Test
    fun ofCommentRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofComment(
                PublicComment.builder()
                    .id("id")
                    .archived(true)
                    .addAttachment(
                        PublicFile.builder()
                            .fileId("fileId")
                            .fileUsageType("fileUsageType")
                            .type(PublicFile.Type.FILE)
                            .url("url")
                            .name("name")
                            .build()
                    )
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .actorId("actorId")
                            .name("name")
                            .recipientField("recipientField")
                            .build()
                    )
                    .richText("richText")
                    .addSender(
                        PublicSender.builder()
                            .actorId("actorId")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderField("senderField")
                            .build()
                    )
                    .text("text")
                    .type(PublicComment.Type.COMMENT)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    @Test
    fun ofWelcome() {
        val welcome =
            PublicWelcomeMessage.builder()
                .id("id")
                .archived(true)
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
                .type(PublicWelcomeMessage.Type.WELCOME_MESSAGE)
                .richText("richText")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val publicMessage = PublicMessage.ofWelcome(welcome)

        assertThat(publicMessage.conversations()).isEmpty
        assertThat(publicMessage.comment()).isEmpty
        assertThat(publicMessage.welcome()).contains(welcome)
        assertThat(publicMessage.assignment()).isEmpty
        assertThat(publicMessage.threadStatusChange()).isEmpty
        assertThat(publicMessage.threadInboxChange()).isEmpty
    }

    @Test
    fun ofWelcomeRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofWelcome(
                PublicWelcomeMessage.builder()
                    .id("id")
                    .archived(true)
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
                    .addRecipient(
                        PublicRecipient.builder()
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderField("senderField")
                            .build()
                    )
                    .text("text")
                    .type(PublicWelcomeMessage.Type.WELCOME_MESSAGE)
                    .richText("richText")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    @Test
    fun ofAssignment() {
        val assignment =
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

        val publicMessage = PublicMessage.ofAssignment(assignment)

        assertThat(publicMessage.conversations()).isEmpty
        assertThat(publicMessage.comment()).isEmpty
        assertThat(publicMessage.welcome()).isEmpty
        assertThat(publicMessage.assignment()).contains(assignment)
        assertThat(publicMessage.threadStatusChange()).isEmpty
        assertThat(publicMessage.threadInboxChange()).isEmpty
    }

    @Test
    fun ofAssignmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofAssignment(
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    @Test
    fun ofThreadStatusChange() {
        val threadStatusChange =
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

        val publicMessage = PublicMessage.ofThreadStatusChange(threadStatusChange)

        assertThat(publicMessage.conversations()).isEmpty
        assertThat(publicMessage.comment()).isEmpty
        assertThat(publicMessage.welcome()).isEmpty
        assertThat(publicMessage.assignment()).isEmpty
        assertThat(publicMessage.threadStatusChange()).contains(threadStatusChange)
        assertThat(publicMessage.threadInboxChange()).isEmpty
    }

    @Test
    fun ofThreadStatusChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofThreadStatusChange(
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderField("senderField")
                            .build()
                    )
                    .type(PublicThreadStatusChange.Type.THREAD_STATUS_CHANGE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    @Test
    fun ofThreadInboxChange() {
        val threadInboxChange =
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

        val publicMessage = PublicMessage.ofThreadInboxChange(threadInboxChange)

        assertThat(publicMessage.conversations()).isEmpty
        assertThat(publicMessage.comment()).isEmpty
        assertThat(publicMessage.welcome()).isEmpty
        assertThat(publicMessage.assignment()).isEmpty
        assertThat(publicMessage.threadStatusChange()).isEmpty
        assertThat(publicMessage.threadInboxChange()).contains(threadInboxChange)
    }

    @Test
    fun ofThreadInboxChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessage =
            PublicMessage.ofThreadInboxChange(
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
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
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .senderField("senderField")
                            .build()
                    )
                    .toInboxId("toInboxId")
                    .type(PublicThreadInboxChange.Type.THREAD_INBOX_CHANGE)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val roundtrippedPublicMessage =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessage),
                jacksonTypeRef<PublicMessage>(),
            )

        assertThat(roundtrippedPublicMessage).isEqualTo(publicMessage)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val publicMessage =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PublicMessage>())

        val e = assertThrows<HubSpotInvalidDataException> { publicMessage.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
