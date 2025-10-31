// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.channelaccounts

import com.hubspot_sdk.api.models.conversations.PublicDeliveryIdentifier
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChannelAccountCreateParamsTest {

    @Test
    fun create() {
        ChannelAccountCreateParams.builder()
            .channelId("channelId")
            .authorized(true)
            .inboxId("inboxId")
            .name("name")
            .deliveryIdentifier(
                PublicDeliveryIdentifier.builder().type("type").value("value").build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ChannelAccountCreateParams.builder()
                .channelId("channelId")
                .authorized(true)
                .inboxId("inboxId")
                .name("name")
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
                .authorized(true)
                .inboxId("inboxId")
                .name("name")
                .deliveryIdentifier(
                    PublicDeliveryIdentifier.builder().type("type").value("value").build()
                )
                .build()

        val body = params._body()

        assertThat(body.authorized()).isEqualTo(true)
        assertThat(body.inboxId()).isEqualTo("inboxId")
        assertThat(body.name()).isEqualTo("name")
        assertThat(body.deliveryIdentifier())
            .contains(PublicDeliveryIdentifier.builder().type("type").value("value").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ChannelAccountCreateParams.builder()
                .channelId("channelId")
                .authorized(true)
                .inboxId("inboxId")
                .name("name")
                .build()

        val body = params._body()

        assertThat(body.authorized()).isEqualTo(true)
        assertThat(body.inboxId()).isEqualTo("inboxId")
        assertThat(body.name()).isEqualTo("name")
    }
}
