// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.customchannels.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageUpdateParamsTest {

    @Test
    fun create() {
        MessageUpdateParams.builder()
            .channelId("channelId")
            .messageId("messageId")
            .statusType(MessageUpdateParams.StatusType.SENT)
            .errorMessage("errorMessage")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            MessageUpdateParams.builder()
                .channelId("channelId")
                .messageId("messageId")
                .statusType(MessageUpdateParams.StatusType.SENT)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("channelId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            MessageUpdateParams.builder()
                .channelId("channelId")
                .messageId("messageId")
                .statusType(MessageUpdateParams.StatusType.SENT)
                .errorMessage("errorMessage")
                .build()

        val body = params._body()

        assertThat(body.statusType()).isEqualTo(MessageUpdateParams.StatusType.SENT)
        assertThat(body.errorMessage()).contains("errorMessage")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MessageUpdateParams.builder()
                .channelId("channelId")
                .messageId("messageId")
                .statusType(MessageUpdateParams.StatusType.SENT)
                .build()

        val body = params._body()

        assertThat(body.statusType()).isEqualTo(MessageUpdateParams.StatusType.SENT)
    }
}
