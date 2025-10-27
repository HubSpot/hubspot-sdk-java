// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.errors.HubSpotInvalidDataException
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PublicMessageEggTest {

    @Test
    fun ofConversations() {
        val conversations =
            PublicConversationsMessageEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .channelAccountId("channelAccountId")
                .channelId("channelId")
                .addRecipient(
                    PublicRecipientEgg.builder()
                        .addDeliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .actorId("actorId")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .name("name")
                        .recipientField("recipientField")
                        .build()
                )
                .senderActorId("senderActorId")
                .text("text")
                .type(PublicConversationsMessageEgg.Type.MESSAGE)
                .richText("richText")
                .subject("subject")
                .build()

        val publicMessageEgg = PublicMessageEgg.ofConversations(conversations)

        assertThat(publicMessageEgg.conversations()).contains(conversations)
        assertThat(publicMessageEgg.comment()).isEmpty
    }

    @Test
    fun ofConversationsRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageEgg =
            PublicMessageEgg.ofConversations(
                PublicConversationsMessageEgg.builder()
                    .addAttachment(
                        PublicFileEgg.builder()
                            .fileId("fileId")
                            .type(PublicFileEgg.Type.FILE)
                            .build()
                    )
                    .channelAccountId("channelAccountId")
                    .channelId("channelId")
                    .addRecipient(
                        PublicRecipientEgg.builder()
                            .addDeliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .actorId("actorId")
                            .deliveryIdentifier(
                                PublicDeliveryIdentifier.builder()
                                    .type("type")
                                    .value("value")
                                    .build()
                            )
                            .name("name")
                            .recipientField("recipientField")
                            .build()
                    )
                    .senderActorId("senderActorId")
                    .text("text")
                    .type(PublicConversationsMessageEgg.Type.MESSAGE)
                    .richText("richText")
                    .subject("subject")
                    .build()
            )

        val roundtrippedPublicMessageEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageEgg),
                jacksonTypeRef<PublicMessageEgg>(),
            )

        assertThat(roundtrippedPublicMessageEgg).isEqualTo(publicMessageEgg)
    }

    @Test
    fun ofComment() {
        val comment =
            PublicCommentEgg.builder()
                .addAttachment(
                    PublicFileEgg.builder().fileId("fileId").type(PublicFileEgg.Type.FILE).build()
                )
                .text("text")
                .type(PublicCommentEgg.Type.COMMENT)
                .richText("richText")
                .build()

        val publicMessageEgg = PublicMessageEgg.ofComment(comment)

        assertThat(publicMessageEgg.conversations()).isEmpty
        assertThat(publicMessageEgg.comment()).contains(comment)
    }

    @Test
    fun ofCommentRoundtrip() {
        val jsonMapper = jsonMapper()
        val publicMessageEgg =
            PublicMessageEgg.ofComment(
                PublicCommentEgg.builder()
                    .addAttachment(
                        PublicFileEgg.builder()
                            .fileId("fileId")
                            .type(PublicFileEgg.Type.FILE)
                            .build()
                    )
                    .text("text")
                    .type(PublicCommentEgg.Type.COMMENT)
                    .richText("richText")
                    .build()
            )

        val roundtrippedPublicMessageEgg =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicMessageEgg),
                jacksonTypeRef<PublicMessageEgg>(),
            )

        assertThat(roundtrippedPublicMessageEgg).isEqualTo(publicMessageEgg)
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
        val publicMessageEgg =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<PublicMessageEgg>())

        val e = assertThrows<HubSpotInvalidDataException> { publicMessageEgg.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
