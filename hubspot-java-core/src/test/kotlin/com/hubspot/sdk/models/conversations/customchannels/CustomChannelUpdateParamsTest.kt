// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.conversations.customchannels

import com.hubspot.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelUpdateParamsTest {

    @Test
    fun create() {
        CustomChannelUpdateParams.builder()
            .channelId(0)
            .publicChannelIntegrationChannelPatch(
                PublicChannelIntegrationChannelPatch.builder()
                    .capabilities(
                        PublicChannelIntegrationChannelPatch.Capabilities.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                    .channelDescription(JsonValue.from(mapOf<String, Any>()))
                    .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                    .name(JsonValue.from(mapOf<String, Any>()))
                    .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomChannelUpdateParams.builder()
                .channelId(0)
                .publicChannelIntegrationChannelPatch(
                    PublicChannelIntegrationChannelPatch.builder()
                        .capabilities(
                            PublicChannelIntegrationChannelPatch.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                        .channelDescription(JsonValue.from(mapOf<String, Any>()))
                        .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                        .name(JsonValue.from(mapOf<String, Any>()))
                        .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomChannelUpdateParams.builder()
                .channelId(0)
                .publicChannelIntegrationChannelPatch(
                    PublicChannelIntegrationChannelPatch.builder()
                        .capabilities(
                            PublicChannelIntegrationChannelPatch.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                        .channelDescription(JsonValue.from(mapOf<String, Any>()))
                        .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                        .name(JsonValue.from(mapOf<String, Any>()))
                        .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelIntegrationChannelPatch.builder()
                    .capabilities(
                        PublicChannelIntegrationChannelPatch.Capabilities.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                    .channelDescription(JsonValue.from(mapOf<String, Any>()))
                    .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                    .name(JsonValue.from(mapOf<String, Any>()))
                    .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }
}
