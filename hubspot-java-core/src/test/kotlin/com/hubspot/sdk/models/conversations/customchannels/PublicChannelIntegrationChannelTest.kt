// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelIntegrationChannelTest {

    @Test
    fun create() {
        val publicChannelIntegrationChannel =
            PublicChannelIntegrationChannel.builder()
                .id("id")
                .capabilities(
                    PublicChannelIntegrationChannel.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                .channelDescription("channelDescription")
                .channelLogoUrl("channelLogoUrl")
                .webhookUrl("webhookUrl")
                .build()

        assertThat(publicChannelIntegrationChannel.id()).isEqualTo("id")
        assertThat(publicChannelIntegrationChannel.capabilities())
            .isEqualTo(
                PublicChannelIntegrationChannel.Capabilities.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicChannelIntegrationChannel.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(publicChannelIntegrationChannel.name()).isEqualTo("name")
        assertThat(publicChannelIntegrationChannel.channelAccountConnectionRedirectUrl())
            .contains("channelAccountConnectionRedirectUrl")
        assertThat(publicChannelIntegrationChannel.channelDescription())
            .contains("channelDescription")
        assertThat(publicChannelIntegrationChannel.channelLogoUrl()).contains("channelLogoUrl")
        assertThat(publicChannelIntegrationChannel.webhookUrl()).contains("webhookUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelIntegrationChannel =
            PublicChannelIntegrationChannel.builder()
                .id("id")
                .capabilities(
                    PublicChannelIntegrationChannel.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                .channelDescription("channelDescription")
                .channelLogoUrl("channelLogoUrl")
                .webhookUrl("webhookUrl")
                .build()

        val roundtrippedPublicChannelIntegrationChannel =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelIntegrationChannel),
                jacksonTypeRef<PublicChannelIntegrationChannel>(),
            )

        assertThat(roundtrippedPublicChannelIntegrationChannel)
            .isEqualTo(publicChannelIntegrationChannel)
    }
}
