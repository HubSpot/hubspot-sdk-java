// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels

import com.hubspot.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomChannelCreateParamsTest {

    @Test
    fun create() {
        CustomChannelCreateParams.builder()
            .publicChannelIntegrationChannelCreate(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CustomChannelCreateParams.builder()
                .publicChannelIntegrationChannelCreate(
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CustomChannelCreateParams.builder()
                .publicChannelIntegrationChannelCreate(
                    PublicChannelIntegrationChannelCreate.builder()
                        .capabilities(
                            PublicChannelIntegrationChannelCreate.Capabilities.builder()
                                .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                                .build()
                        )
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelIntegrationChannelCreate.builder()
                    .capabilities(
                        PublicChannelIntegrationChannelCreate.Capabilities.builder()
                            .putAdditionalProperty("foo", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .name("name")
                    .build()
            )
    }
}
