// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels

import com.hubspot_sdk.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelUpdateParamsTest {

    @Test
    fun create() {
        CustomChannelUpdateParams.builder()
            .channelId("channelId")
            .publicChannelIntegrationChannelPatch(
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
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomChannelUpdateParams.builder()
                .channelId("channelId")
                .publicChannelIntegrationChannelPatch(
                    PublicChannelIntegrationChannelPatch.builder()
                        .capabilities(
                            PublicChannelIntegrationChannelPatch.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .channelDescription(JsonValue.from(mapOf<String, Any>()))
                        .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CustomChannelUpdateParams.builder()
                .channelId("channelId")
                .publicChannelIntegrationChannelPatch(
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
                    .channelDescription(JsonValue.from(mapOf<String, Any>()))
                    .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                    .channelAccountConnectionRedirectUrl(JsonValue.from(mapOf<String, Any>()))
                    .name(JsonValue.from(mapOf<String, Any>()))
                    .webhookUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomChannelUpdateParams.builder()
                .channelId("channelId")
                .publicChannelIntegrationChannelPatch(
                    PublicChannelIntegrationChannelPatch.builder()
                        .capabilities(
                            PublicChannelIntegrationChannelPatch.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .channelDescription(JsonValue.from(mapOf<String, Any>()))
                        .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
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
                    .channelDescription(JsonValue.from(mapOf<String, Any>()))
                    .channelLogoUrl(JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }
}
