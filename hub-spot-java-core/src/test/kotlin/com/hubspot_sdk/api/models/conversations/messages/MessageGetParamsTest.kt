// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetParamsTest {

    @Test
    fun create() {
        MessageGetParams.builder().threadId("threadId").messageId("messageId").build()
    }

    @Test
    fun pathParams() {
        val params = MessageGetParams.builder().threadId("threadId").messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("threadId")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
