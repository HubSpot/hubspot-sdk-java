// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelAccountTest {

    @Test
    fun create() {
        val publicChannelAccount =
            PublicChannelAccount.builder()
                .id("id")
                .active(true)
                .archived(true)
                .authorized(true)
                .channelId("channelId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inboxId("inboxId")
                .name("name")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .build()

        assertThat(publicChannelAccount.id()).isEqualTo("id")
        assertThat(publicChannelAccount.active()).isEqualTo(true)
        assertThat(publicChannelAccount.archived()).isEqualTo(true)
        assertThat(publicChannelAccount.authorized()).isEqualTo(true)
        assertThat(publicChannelAccount.channelId()).isEqualTo("channelId")
        assertThat(publicChannelAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicChannelAccount.inboxId()).isEqualTo("inboxId")
        assertThat(publicChannelAccount.name()).isEqualTo("name")
        assertThat(publicChannelAccount.archivedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicChannelAccount.deliveryIdentifier())
            .contains(
                PublicDeliveryIdentifier.builder()
                    .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                    .value("value")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelAccount =
            PublicChannelAccount.builder()
                .id("id")
                .active(true)
                .archived(true)
                .authorized(true)
                .channelId("channelId")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .inboxId("inboxId")
                .name("name")
                .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder()
                        .type(PublicDeliveryIdentifier.Type.CHANNEL_SPECIFIC_OPAQUE_ID)
                        .value("value")
                        .build()
                )
                .build()

        val roundtrippedPublicChannelAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelAccount),
                jacksonTypeRef<PublicChannelAccount>(),
            )

        assertThat(roundtrippedPublicChannelAccount).isEqualTo(publicChannelAccount)
    }
}
