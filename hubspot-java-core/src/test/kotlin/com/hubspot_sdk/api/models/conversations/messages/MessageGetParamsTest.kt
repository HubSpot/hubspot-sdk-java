// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.conversations.messages

import com.hubspot_sdk.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MessageGetParamsTest {

    @Test
    fun create() {
        MessageGetParams.builder().threadId(0L).messageId("messageId").property("property").build()
    }

    @Test
    fun pathParams() {
        val params = MessageGetParams.builder().threadId(0L).messageId("messageId").build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        assertThat(params._pathParam(1)).isEqualTo("messageId")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            MessageGetParams.builder()
                .threadId(0L)
                .messageId("messageId")
                .property("property")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("property", "property").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MessageGetParams.builder().threadId(0L).messageId("messageId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
