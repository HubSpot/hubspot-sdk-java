// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import com.hubspot_sdk.api.models.conversations.customchannels.PublicChannelAccountEgg
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountCreateParamsTest {

    @Test
    fun create() {
        ChannelAccountCreateParams.builder()
            .channelId("channelId")
            .publicChannelAccountEgg(
                PublicChannelAccountEgg.builder()
                    .authorized(true)
                    .inboxId("inboxId")
                    .name("name")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountCreateParams.builder()
                .channelId("channelId")
                .publicChannelAccountEgg(
                    PublicChannelAccountEgg.builder()
                        .authorized(true)
                        .inboxId("inboxId")
                        .name("name")
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
            ChannelAccountCreateParams.builder()
                .channelId("channelId")
                .publicChannelAccountEgg(
                    PublicChannelAccountEgg.builder()
                        .authorized(true)
                        .inboxId("inboxId")
                        .name("name")
                        .deliveryIdentifier(
                            PublicDeliveryIdentifier.builder().type("type").value("value").build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelAccountEgg.builder()
                    .authorized(true)
                    .inboxId("inboxId")
                    .name("name")
                    .deliveryIdentifier(
                        PublicDeliveryIdentifier.builder().type("type").value("value").build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelAccountCreateParams.builder()
                .channelId("channelId")
                .publicChannelAccountEgg(
                    PublicChannelAccountEgg.builder()
                        .authorized(true)
                        .inboxId("inboxId")
                        .name("name")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelAccountEgg.builder()
                    .authorized(true)
                    .inboxId("inboxId")
                    .name("name")
                    .build()
            )
    }
}
