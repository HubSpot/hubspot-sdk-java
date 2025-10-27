// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicCommentTest {

    @Test
    fun create() {
        val publicComment =
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

        assertThat(publicComment.id()).isEqualTo("id")
        assertThat(publicComment.archived()).isEqualTo(true)
        assertThat(publicComment.attachments())
            .containsExactly(
                PublicComment.Attachment.ofPublicFile(
                    PublicFile.builder()
                        .fileId("fileId")
                        .fileUsageType("fileUsageType")
                        .type(PublicFile.Type.FILE)
                        .url("url")
                        .name("name")
                        .build()
                )
            )
        assertThat(publicComment.client())
            .isEqualTo(
                PublicClient.builder()
                    .clientType(PublicClient.ClientType.HUBSPOT)
                    .integrationAppId(0)
                    .build()
            )
        assertThat(publicComment.conversationsThreadId()).isEqualTo("conversationsThreadId")
        assertThat(publicComment.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicComment.createdBy()).isEqualTo("createdBy")
        assertThat(publicComment.recipients())
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
        assertThat(publicComment.richText()).isEqualTo("richText")
        assertThat(publicComment.senders())
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
        assertThat(publicComment.text()).isEqualTo("text")
        assertThat(publicComment.type()).isEqualTo(PublicComment.Type.COMMENT)
        assertThat(publicComment.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicComment =
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

        val roundtrippedPublicComment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicComment),
                jacksonTypeRef<PublicComment>(),
            )

        assertThat(roundtrippedPublicComment).isEqualTo(publicComment)
    }
}
