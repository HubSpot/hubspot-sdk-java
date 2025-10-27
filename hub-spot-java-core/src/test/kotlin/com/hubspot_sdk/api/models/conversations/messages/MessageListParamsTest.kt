// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageListParamsTest {

    @Test
    fun create() {
        MessageListParams.builder().threadId("threadId").build()
    }

    @Test
    fun pathParams() {
        val params = MessageListParams.builder().threadId("threadId").build()

        assertThat(params._pathParam(0)).isEqualTo("threadId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
