// File generated from our OpenAPI spec by Stainless.

package com.hubspot.models.conversations.customchannels.messages

import com.hubspot.models.conversations.customchannels.PublicChannelIntegrationMessageUpdateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageUpdateParamsTest {

    @Test
    fun create() {
        MessageUpdateParams.builder()
            .channelId(0)
            .messageId("messageId")
            .publicChannelIntegrationMessageUpdateRequest(
                PublicChannelIntegrationMessageUpdateRequest.builder()
                    .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                    .errorMessage("errorMessage")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageUpdateParams.builder()
                .channelId(0)
                .messageId("messageId")
                .publicChannelIntegrationMessageUpdateRequest(
                    PublicChannelIntegrationMessageUpdateRequest.builder()
                        .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageUpdateParams.builder()
                .channelId(0)
                .messageId("messageId")
                .publicChannelIntegrationMessageUpdateRequest(
                    PublicChannelIntegrationMessageUpdateRequest.builder()
                        .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                        .errorMessage("errorMessage")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelIntegrationMessageUpdateRequest.builder()
                    .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                    .errorMessage("errorMessage")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageUpdateParams.builder()
                .channelId(0)
                .messageId("messageId")
                .publicChannelIntegrationMessageUpdateRequest(
                    PublicChannelIntegrationMessageUpdateRequest.builder()
                        .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                PublicChannelIntegrationMessageUpdateRequest.builder()
                    .statusType(PublicChannelIntegrationMessageUpdateRequest.StatusType.FAILED)
                    .build()
            )
    }
}
