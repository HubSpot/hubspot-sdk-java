// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicChannelIntegrationChannelPatchTest {

    @Test
    fun create() {
        val publicChannelIntegrationChannelPatch =
            PublicChannelIntegrationChannelPatch.builder()
                .capabilities(
                    PublicChannelIntegrationChannelPatch.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .channelDescription(JsonValue.from(mapOf<String, Any>()))
                .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                .name(JsonValue.from(mapOf<String, Any>()))
                .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(publicChannelIntegrationChannelPatch.capabilities())
            .isEqualTo(
                PublicChannelIntegrationChannelPatch.Capabilities.builder()
                    .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
        assertThat(publicChannelIntegrationChannelPatch._channelDescription())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicChannelIntegrationChannelPatch._channelLogoUrl())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicChannelIntegrationChannelPatch._channelAccountConnectionRedirectUrl())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicChannelIntegrationChannelPatch._name())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(publicChannelIntegrationChannelPatch._webhookUrl())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicChannelIntegrationChannelPatch =
            PublicChannelIntegrationChannelPatch.builder()
                .capabilities(
                    PublicChannelIntegrationChannelPatch.Capabilities.builder()
                        .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .channelDescription(JsonValue.from(mapOf<String, Any>()))
                .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                .name(JsonValue.from(mapOf<String, Any>()))
                .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedPublicChannelIntegrationChannelPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicChannelIntegrationChannelPatch),
                jacksonTypeRef<PublicChannelIntegrationChannelPatch>(),
            )

        assertThat(roundtrippedPublicChannelIntegrationChannelPatch)
            .isEqualTo(publicChannelIntegrationChannelPatch)
    }
}
