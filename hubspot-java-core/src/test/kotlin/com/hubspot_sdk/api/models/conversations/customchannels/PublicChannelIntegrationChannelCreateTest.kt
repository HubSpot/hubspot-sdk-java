// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelIntegrationChannelCreateTest {

    @Test
    fun create() {
        val publicChannelIntegrationChannelCreate =
            PublicChannelIntegrationChannelCreate.builder()
                .capabilities(
                    PublicChannelIntegrationChannelCreate.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                .channelDescription("channelDescription")
                .channelLogoUrl("channelLogoUrl")
                .webhookUrl("webhookUrl")
                .build()

        assertThat(publicChannelIntegrationChannelCreate.capabilities())
            .isEqualTo(
                PublicChannelIntegrationChannelCreate.Capabilities.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicChannelIntegrationChannelCreate.name()).isEqualTo("name")
        assertThat(publicChannelIntegrationChannelCreate.channelAccountConnectionRedirectUrl())
            .contains("channelAccountConnectionRedirectUrl")
        assertThat(publicChannelIntegrationChannelCreate.channelDescription())
            .contains("channelDescription")
        assertThat(publicChannelIntegrationChannelCreate.channelLogoUrl())
            .contains("channelLogoUrl")
        assertThat(publicChannelIntegrationChannelCreate.webhookUrl()).contains("webhookUrl")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelIntegrationChannelCreate =
            PublicChannelIntegrationChannelCreate.builder()
                .capabilities(
                    PublicChannelIntegrationChannelCreate.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .name("name")
                .channelAccountConnectionRedirectUrl("channelAccountConnectionRedirectUrl")
                .channelDescription("channelDescription")
                .channelLogoUrl("channelLogoUrl")
                .webhookUrl("webhookUrl")
                .build()

        val roundtrippedPublicChannelIntegrationChannelCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelIntegrationChannelCreate),
                jacksonTypeRef<PublicChannelIntegrationChannelCreate>(),
            )

        assertThat(roundtrippedPublicChannelIntegrationChannelCreate)
            .isEqualTo(publicChannelIntegrationChannelCreate)
    }
}
